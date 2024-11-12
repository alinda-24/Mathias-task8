import java.util.HashMap;
import java.util.Map;

/**
 * The `Room` class represents a location in the game world. Each room has a description,
 * a name, and connections to other rooms (exits) that allow navigation. Rooms may contain 
 * items and characters with which the player can interact. This class provides methods 
 * to manage exits, add or remove characters and items, and display the room’s description 
 * and available exits to the player.
 */
public class Room {

    private Map<String, Room> exits = new HashMap<>();
    private String description;
    private String roomName;
    private Character character;
    private Item item;

    /**
     * Constructs a Room with a given name and description.
     * @param roomName   the name of the room.
     * @param description a description of the room.
     */
    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
    }

    /**
     * Retrieves the description of the room.
     * @return the room's description.
     */
    public String getRoomDescription(){
        return description;
    }

    /**
     * Retrieves the name of the room.
     * @return the room's name.
     */
    public String getRoomName(){
        return roomName;
    }

        /**
     * Add an exit from this room.
     * @param direction the direction in which the exit is.
     * @param toRoom the room that this exit leads to.
     */
    public void addExit(String direction, Room toRoom) {
        exits.put(direction.toLowerCase(), toRoom);
    }

    /**
     * Add a character to the room.
     * @param character The character to be added to the room.
     */
    public void addCharacter(Character character) {
        this.character = character;
    }
    
    /**
     * Get the character in this room.
     * @return the character in the room, or null if no character is present.
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * Talks to the character in the room, if any available.
     * @param character
     */
    public void talkToCharacter(Character character) {
        if (character != null){
            character.talk();
        } else {
            System.out.println("There is no one here to talk to.");
        }
    }

    /**
     * Removes the character from the room, setting the character field to null.
     */
    public void removeCharacter(){
        this.character = null;
    }

    /**
     * Retrieves the item present in the room.
     * @return the item in the room, or null if there is no item present.
     */
    public Item getItem(){
        return item;
    }

    /**
     * Adds an item to the room.
     * @param item the item to be placed in the room.
     */
    public void addItem(Item item){
        this.item = item;
    }

    /**
     * Removes the item from the room, setting the item field to null.
     */
    public void removeItem(){
        this.item = null;
    }

    /**
     * Checks and displays the name of the item in the room.
     * Assumes that there is an item present.
     */
    public void checkItem(){
        System.out.println(this.item.getName());
    }

        /**
     * Attempt to leave this room in the given direction.
     * @param direction the direction in which to move the player.
     * @return the room that the player ends up in. May be null if
     *         there is no exit from this room in that direction.
     */
    public Room go(String direction) {
        Room newRoom = exits.get(direction);
        if (newRoom == null){
            System.out.println("You can't go that way!");
            printExits();
        }
        return newRoom;
    }

    /**
     * Print the exits that are available from this room.
     */
    public void printExits() {
        System.out.print("There are exits in the directions: ");
        for (String direction : exits.keySet())
            System.out.print(direction + " ");
        System.out.println();
    }

        /**
     * Look around the current room, printing the room descriptions and the
     * available exits.
     */
    public void lookAround() {
        System.out.println(description);
            if(character != null){
                System.out.println("Someone is here");
            }
            if(item != null){
                System.out.println("There is something here");
            }
        printExits();
    }

    /**
     * Displays the name of the room, used to confirm movement between rooms.
     */
    public void movingRooms(){
        System.out.println(roomName);
    }

    /**
     * Checks if there is a character in the room and displays their identity if present.
     * If no character is present, displays a message indicating the room is empty.
     */
    public void whoIsHere() {
        if (character != null){
            character.who();
        } else {
            System.out.println("There is no one here!");
        }
    }
}

