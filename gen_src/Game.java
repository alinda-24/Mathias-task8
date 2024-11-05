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
        // File reading logic goes here
    }

    private void printWelcomeMessage() {
        // Welcome message logic goes here
    }

    private void startGameLoop() {
        // Game loop logic goes here
    }
}

class GameState {
    // GameState class implementation
}