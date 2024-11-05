public class Game {
    private GameState state;
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        Game game = new Game();
        game.setupWorldFromFile("world.txt");
        game.printWelcomeMessage();
        game.startGameLoop();
    }

    private void setupWorldFromFile(String filename) {
        // Implement file reading logic to setup world
    }

    private void printWelcomeMessage() {
        // Print game start messages
    }

    private void startGameLoop() {
        // Main game logic loop
    }
}