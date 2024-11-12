import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * The `Game` class is the main entry point for the text-based adventure game.
 * It initializes the game environment, sets up the starting room, and listens for
 * player commands to progress through the game. The game loops continuously, 
 * processing player input and interacting with game objects via the `GameState` 
 * and `CommandParser` classes.
 */
public class Game{
    // The current state of the game, including player location and attributes
    private static GameState state;
    // Scanner for reading player input from the console
    private static Scanner scanner = new Scanner(System.in);
    // The prompt symbol displayed to the player before each command
    private static final String PROMPT = "> ";
    // A map of all rooms in the game, identified by their names
    private static Map<String, Room> rooms = new HashMap<>();

    /**
     * Main method, the starting point of the game. It initializes game resources,
     * loads room data, sets the starting room, and begins the game loop.
     * 
     * @param args command-line arguments, unused in this game.
     */
    public static void main(String[] args) {
        // Load rooms and other game data from file
        GameLoader loader = new GameLoader(rooms);
        loader.loadRoomsFromFile("rooms.txt");

        // Set the starting room; must be present in the loaded rooms map
        Room startingRoom = rooms.get("Entrance"); // or another starting room key if applicable

        state = new GameState(startingRoom);


        // Print welcome message for the player
        printWelcomeMessage();

        // Main game loop: continually prompt for and handle player commands
        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }
    
    /**
     * Displays the introductory message and starting instructions to the player.
     * Also verifies that the starting room is correctly initialized.
     */
    private static void printWelcomeMessage() {
        System.out.println("Welcome to your next adventure!");
        System.out.println("Collect points and win when 3 is achieved");

        // Display the starting room's name if initialized correctly
        if (state != null && state.getCurrentRoom() != null) {
            state.getCurrentRoom().getRoomName();
        } else {
            System.out.println("Error: Starting room or game state not properly initialized.");
        }

        // Print the list of available commands to the player
        CommandParser.printHelpMessage();
    }
    
    /**
     * Prompts the player to enter a command, reads the input from the console,
     * and returns it as a string without the initial prompt symbol.
     * 
     * @return the player's command as a lowercase string
     */
    private static String getCommand() {
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        command = command.replaceFirst(PROMPT, ""); // Remove any extra prompt characters
        return command;
    }

   
 
}
