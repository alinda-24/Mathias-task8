// File: Game.java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

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
        // Get user command
    }

    private static void printWelcomeMessage() {
        // Print welcome message
    }

    private static void loadRoomsFromFile(String filename) {
        // Load rooms from file
    }
}

// File: GameState.java
class GameState {
    private Room currentRoom;

    public GameState(Room startingRoom) {
        // Constructor
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

// File: Room.java
import java.util.Map;
import java.util.HashMap;

class Room {
    private Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
        // Constructor
    }

    public void addExit(String direction, Room toRoom) {
        // Add an exit
    }

    public Room go(String direction) {
        // Go in a direction
    }

    public void printExits() {
        // Print available exits
    }

    public void lookAround() {
        // Look around the room
    }
}

// File: Character.java
class Character {
    private String name;
    private String description;
    private String dialogue;

    public Character(String name, String description, String dialogue) {
        // Constructor
    }

    public void talk() {
        // Character talks
    }
}

// File: CommandParser.java
class CommandParser {
    public static void parse(String command, GameState state) {
        // Parse and process commands
    }

    public static void printHelpMessage() {
        // Print help message
    }
}