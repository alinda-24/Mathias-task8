// Game.java

import java.util.Scanner;

public class Game {
    private static GameState state;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile();
        printWelcomeMessage();
        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static void generateRoomsFromFile() {
        // Implementation goes here
    }

    private static String getCommand() {
        // Implementation goes here
    }

    private static void printWelcomeMessage() {
        // Implementation goes here
    }
}