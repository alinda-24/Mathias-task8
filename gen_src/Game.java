// Game.java
import java.util.Scanner;

public class Game {
    private Player player;
    private Forest forest;
    private Scanner scanner = new Scanner(System.in);

    public Game(Forest forest) {
        // constructor
    }

    public void start() {
        // start method
    }

    public static void main(String[] args) {
        // main method
    }
}

// Player.java
public class Player {
    // Player class with methods used in Game
    public int getHealth() {
        // getHealth method
    }

    public String getInventory() {
        // getInventory method
    }
}

// Forest.java
public class Forest {
    // Forest class with methods used in Game
    public void explore() {
        // explore method
    }
}

// ForestLoader.java
public class ForestLoader {
    // ForestLoader class with methods used in Game
    public Forest loadForest(String filename) {
        // loadForest method
    }
}