import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private String description;
    private Map<String, Room> exits = new HashMap<>();

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room toRoom) {
        exits.put(direction, toRoom);
    }

    public Room go(String direction) {
        Room room = exits.get(direction);
        if (room == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return room;
    }

    public void printExits() {
        System.out.print("There are exits in the directions: ");
        exits.keySet().forEach(exit -> System.out.print(exit + " "));
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}