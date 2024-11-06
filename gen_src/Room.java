Room.java
```java
import java.util.Map;
import java.util.HashMap;

public class Room {
    private Map<String, Room> exits;
    private String description;

    public Room(String description) {
        // Constructor initialization
    }

    public void addExit(String direction, Room toRoom) {
        // Method to add exits
    }

    public Room go(String direction) {
        // Method to change room based on direction
        return null;
    }

    public void printExits() {
        // Method to print available exits
    }

    public void lookAround() {
        // Method to describe the current room
    }
}
```