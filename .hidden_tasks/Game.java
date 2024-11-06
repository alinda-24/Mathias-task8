import java.util.List;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private Encounter currentEncounter;

    public Game(Room startingRoom, Encounter startingEncounter) {
        this.currentRoom = startingRoom;
        this.currentEncounter = startingEncounter;
    }

    public void processEncounter() {
        if (currentEncounter != null) {
            currentEncounter.interact();
            // Implement more detailed game logic depending on the encounter
        } else {
            System.out.println("The room is peaceful.");
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("You are in " + currentRoom.getName() + ". " + currentRoom.getDescription());
            processEncounter();
            System.out.print("What would you like to do? ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            // Extend game loop with more commands and logic
        }
        scanner.close();
    }

    public static void main(String[] args) {
        List<Room> rooms = Room.loadRoomsFromFile("rooms.csv");
        Room startingRoom = rooms.isEmpty() ? new Room("Default Room", "You are in a mysterious room.") : rooms.get(0);
        Encounter startingEncounter = new Monster("It's lurking in the shadows.");
        Game game = new Game(startingRoom, startingEncounter);
        game.play();
    }
}