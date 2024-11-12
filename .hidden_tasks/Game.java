import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        loadRoomsFromFile("rooms.txt");
        printWelcomeMessage();

        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static String getCommand() {
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        return command.replaceFirst(PROMPT, "");
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to the Adventure Game!");
        state.getCurrentRoom().lookAround();
        CommandParser.printHelpMessage();
    }

    private static void loadRoomsFromFile(String filename) {
        Map<String, Room> worldModel = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(";");

                if (data[0].equals("Room"))
                    worldModel.put(data[1], new Room(data[2]));
                else if (data[0].equals("Exit"))
                    worldModel.get(data[1]).addExit(data[2], worldModel.get(data[3]));

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
            System.exit(1);
        }

        state = new GameState(worldModel.get("start"));
    }
}

class GameState {
    private Room currentRoom;

    public GameState(Room startingRoom) {
        currentRoom = startingRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}


class Room {
    private Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room toRoom) {
        exits.put(direction, toRoom);
    }

    public Room go(String direction) {
        Room newRoom = exits.get(direction);
        if (newRoom == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return newRoom;
    }

    public void printExits() {
        System.out.print("There are exits in the directions: ");
        for (String direction : exits.keySet())
            System.out.print(direction + " ");
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}


class Character {
    private String name;
    private String description;
    private String dialogue;

    public Character(String name, String description, String dialogue) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
    }

    public void talk() {
        System.out.println(dialogue);
    }
}


class CommandParser {
    public static void parse(String command, GameState state) {
        // Parse commands and interact with the GameState
    }

    public static void printHelpMessage() {
        System.out.println("Available commands are: move <direction>, look, talk, help.");
    }
}