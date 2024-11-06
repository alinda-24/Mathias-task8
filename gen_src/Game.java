Game.java
```java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile();
        printWelcomeMessage();

        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static String getCommand() {
    }

    private static void printWelcomeMessage() {
    }

    private static void generateRoomsFromFile() {
    }
}
```

GameState.java
```java
public class GameState {
    public GameState(Room startingRoom) {
    }

    public Room getCurrentRoom() {
        return null;
    }
}
```

CommandParser.java
```java
public class CommandParser {
    public static void parse(String command, GameState state) {
    }

    public static void printHelpMessage() {
    }
}
```

Room.java
```java
public class Room {
    public Room(String description) {
    }

    public void addExit(String direction, Room room) {
    }

    public void lookAround() {
    }
}
```