import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The `GameLoader` class is responsible for loading and initializing the game’s rooms, exits, 
 * characters, and items from a specified file. It parses the file to create `Room`, `Character`, 
 * and `Item` instances, establishing connections and attributes based on the file’s data. 
 * This class supports the setup of the game environment for gameplay.
 */

public class GameLoader {

    private Map<String, Room> rooms ;

    /**
     * Constructs a GameLoader with a reference to a map of rooms.
     * @param rooms the map where room names are keys and room objects are values.
     */
    public GameLoader(Map<String, Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * Loads room, exit, character, and item information from the specified file.
     * This method reads each line from the file and determines whether the line describes 
     * a room, exit, character, or item. It then delegates the parsing to the appropriate 
     * method based on the type of line.
     * 
     * Expected format for each line:
     * - "Room: roomName: description"
     * - "Exit: roomName: direction: targetRoomName"
     * - "Character: name: roomName: description: dialogue: hp: rewardPoints: attackPoints"
     * - "Item: itemName: roomName: pointsValue"
     * 
     * @param filename the name of the file containing the room data.
     */
    public void loadRoomsFromFile(String filename) {
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = file.readLine()) != null) {
                // Parse the line based on its type
                if (line.startsWith("Room")) {
                    parseRoom(line);
                } else if (line.startsWith("Exit")) {
                    parseExit(line);
                } else if (line.startsWith("Character")) {
                    parseCharacter(line);
                } else if (line.startsWith("Item")) {
                    parseItem(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading rooms: " + e.getMessage());
        }
    }

    /**
     * Parses a room line from the file and adds a new room to the rooms map.
     * The format of the room line is expected to be: "Room: roomName: description".
     * 
     * @param line the line containing room information, where:
     *             - roomName is the name of the room,
     *             - description is a short description of the room.
     */
    private void parseRoom(String line) {
        // Split the line into roomName and description using ":" as delimiter
        String[] roomInfo = line.split(":");
        String roomName = roomInfo[1].trim(); // Extracts the room name
        String description = roomInfo[2].trim(); // Extracts the room description

        // Creates a new Room object with the provided roomName and description
        Room room = new Room(roomName, description);

        // Adds the newly created room to the rooms map using roomName as the key
        rooms.put(roomName, room);

    }

    /**
     * Parses an exit line from the file and adds the exit to the corresponding room.
     * The format of the line should be: "Exit: roomName: direction: targetRoomName".
     * 
     * @param line the line containing exit information, where:
     *             - roomName is the name of the room that contains the exit,
     *             - direction is the direction of the exit (e.g., "north", "east"),
     *             - targetRoomName is the name of the room that the exit leads to.
     */
    private void parseExit(String line) {
        String[] exitInfo = line.split(":");
        String roomName = exitInfo[1].trim(); // Extracts the name of the room that contains the exit
        String direction = exitInfo[2].trim(); // Extracts the direction of the exit
        String targetRoomName = exitInfo[3].trim(); // Extracts the name of the room the exit leads to

        // Retrieves the fromRoom and toRoom from the rooms map using the room names
        Room fromRoom = rooms.get(roomName);
        Room toRoom = rooms.get(targetRoomName);

        // If both rooms are valid, adds the exit to the fromRoom
        if (fromRoom != null && toRoom != null) {
            fromRoom.addExit(direction, toRoom);
        }
    }

    /**
     * Parses a character line from the file and adds the character to the corresponding room.
     * The format of the line should be: "Character: name: roomName: description: dialogue: hp: rewardPoints: attackPoints".
     * 
     * @param line the line containing character information, where:
     *             - name is the character's name,
     *             - roomName is the name of the room where the character is located,
     *             - description is the character's description,
     *             - dialogue is the character's dialogue text,
     *             - hp is the character's health points,
     *             - rewardPoints is the number of points the player will earn for interacting with the character,
     *             - attackPoints is the character's attack power.
     */
    private void parseCharacter(String line) {
        String[] characterInfo = line.split(":");
        String characterName = characterInfo[1].trim(); // Extracts the character's name
        String roomName = characterInfo[2].trim(); // Extracts the room name where the character is located
        String characterDescription = characterInfo[3].trim(); // Extracts the character's description
        String characterDialogue = characterInfo[4].trim(); // Extracts the character's dialogue text
        String characterHp = characterInfo[5].trim(); // Extracts the character's health points (as a string)
        String characterRewardPoints = characterInfo[6].trim(); // Extracts the character's reward points (as a string)
        String characterAttackpoints = characterInfo[7].trim(); // Extracts the character's attack points (as a string)

        // Converts the health points, reward points, and attack points from strings to integers
        int hp = Integer.parseInt(characterHp);
        int rewardPoints = Integer.parseInt(characterRewardPoints);
        int attackPoints = Integer.parseInt(characterAttackpoints);

        // Retrieves the room from the map and adds the item if the room is found
        Room room = rooms.get(roomName);
        if (room != null) {
            // Creates a new Character object and adds it to the room
            Character character = new Character(characterName, characterDescription, characterDialogue, hp, rewardPoints, attackPoints);
            room.addCharacter(character); 
        }
    }

    /**
     * Parses an item line from the file and adds the item to a room.
     * Format expected: "Item: itemName: roomName: pointsValue".
     * @param line line the line containing item information, where:
     *             - itemName is the name of the item,
     *             - roomName is the name of the room where the item is located,
     *             - pointsValue is the points associated with the item.
     */
    private void parseItem(String line){
        String[] itemInfo = line.split(":");
        String itemName = itemInfo[1].trim(); // Extracts the item name
        String roomName = itemInfo[2].trim(); // Extracts the room name
        String itemPoints = itemInfo[3].trim(); // Extracts the point value as a string

        // Converts the points value from String to int
        int pointsValue = Integer.parseInt(itemPoints);

        // Retrieves the room from the map and adds the item if the room is found
        Room room = rooms.get(roomName);
        if (room != null){
            // Creates a new item and adds it to the room
            Item item = new Item(itemName, pointsValue);
            room.addItem(item); 
        }
    }
}