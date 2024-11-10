import java.util.HashMap;
import java.util.Map;

public class Room {

    public Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room toRoom) {
        exits.put(direction.toLowerCase(), toRoom);
    }

    public Room go(String direction) {
        Room newRoom = exits.get(direction);
        if (newRoom == null){
            System.out.println("You can't go that way!");
            printExits();
        }
        return newRoom;
    }

    public void printExits() {
        System.out.println("Exits: ");
            for(String direction : exits.keySet());
    }

    public void lookAround() {
        System.out.println(this.description);
        printExits();
    }

    public void setExit(String direction, Room room){
        //newFile = input.jso
    }
}

