// File: Room.java

import java.util.Map;
import java.util.HashMap;

public class Room {
    private Map<String, Room> exits;
    private String description;

    public Room(String description) {
        // Constructor logic
    }

    public void addExit(String direction, Room toRoom) {
        // Add an exit to the room
    }

    public Room go(String direction) {
        // Logic to move to another room
        return null; // Placeholder return
    }

    public void printExits() {
        // Print available exits
    }

    public void lookAround() {
        // Print room description and exits
    }
}