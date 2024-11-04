import java.util.Scanner;

public class Game {
    private Player player;
    private Forest forest;
    private Scanner scanner = new Scanner(System.in);

    public Game(Forest forest) {
        this.player = new Player();
        this.forest = forest;
    }

    public void start() {
        System.out.println("Welcome to the Forest Survival Game!");
        while (player.getHealth() > 0) {
            System.out.println("Choose an action: explore, inventory, exit");
            String action = scanner.nextLine();

            switch (action) {
                case "explore":
                    forest.explore();
                    break;
                case "inventory":
                    System.out.println("Inventory: " + player.getInventory());
                    break;
                case "exit":
                    System.out.println("Exiting the game.");
                    return;
                default:
                    System.out.println("Invalid action.");
            }
        }
        System.out.println("Game Over! You survived " + player.getHealth() + " health.");
    }

    public static void main(String[] args) {
        ForestLoader loader = new ForestLoader();
        Forest forest = loader.loadForest("forest_data.csv");
        Game game = new Game(forest);
        game.start();
    }
}