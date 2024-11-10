// File: Game.java
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Game{
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";
    private static Map<String, Room> rooms = new HashMap<>();


    public static void loadRoomsFromFile(String filename) {
        try  { BufferedReader file = new BufferedReader(new FileReader(filename));
    
            String line;

            while ((line = file.readLine())  != null){
                if (line.startsWith("Room")){
                    String[] roomInfo = line.split(":");
                    String roomName = roomInfo[1].trim();
                    Room room = new Room(roomName);
                    rooms.put(roomName, room);
                }  else if(!line.startsWith("Room")){
                        String[] exitInfo = line.split(":");
                        String roomName = exitInfo[1].trim();
                        String direction = exitInfo[2].trim();
                        String targetRoomName = exitInfo[3].trim();

                        Room fromRoom = rooms.get(roomName);
                        Room toRoom = rooms.get(targetRoomName);

                        if(fromRoom != null && toRoom != null){
                            fromRoom.addExit(direction, toRoom);
                        }
                }
            }    

                file.close();   

        } catch (IOException e) {
                System.out.println("Error loading rooms: " + e.getMessage());    
        }
    }

    public static void main(String[] args) {
        loadRoomsFromFile("rooms.txt");
        System.out.println(rooms.get("Entrance"));
        System.out.println(rooms.get("Cabin").exits);
}
}