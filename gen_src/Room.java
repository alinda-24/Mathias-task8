import java.util.Map;
import java.util.HashMap;

public class Room {
    private String description;
    private Map<String, Room> exits;

    // Constructor
    public Room(String description) {}

    // Method to add exits
    public void addExit(String direction, Room toRoom) {}

    // Method to move to a room in a given direction
    public Room go(String direction) {
        return null;
    }

    // Method to print available exits
    public void printExits() {}

    // Method to look around the room
    public void lookAround() {}
}