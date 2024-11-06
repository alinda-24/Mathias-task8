import java.util.List;
import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static List<Room> loadRoomsFromFile(String filename) {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    Room room = new Room(data[0], data[1]);
                    rooms.add(room);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading rooms from file: " + e.getMessage());
        }
        return rooms;
    }
}