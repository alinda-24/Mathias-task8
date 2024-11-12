package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    // Helper method to create a temporary rooms file
    private File createRoomsFile(String content) throws IOException {
        File tempFile = File.createTempFile("rooms", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(content);
        }
        return tempFile;
    }

    @Test
    public void testLoadRoomsFromFileValidInput() throws IOException {
        // Arrange
        String fileContent = "Room;start;Start Room\n" +
                             "Room;lobby;Lobby\n" +
                             "Exit;start;north;lobby\n";
        File tempFile = createRoomsFile(fileContent);

        // Act
        Game.main(new String[]{tempFile.getAbsolutePath()});

        // Assert
        assertNotNull(Game.getState());
        assertEquals("Start Room", Game.getState().getCurrentRoom().getDescription());
        assertNotNull(Game.getState().getCurrentRoom().go("north"));
        assertEquals("Lobby", Game.getState().getCurrentRoom().go("north").getDescription());

        tempFile.delete();
    }

    @Test
    public void testLoadRoomsFromFileInvalidRoom() throws IOException {
        // Arrange
        String fileContent = "Room;start;Start Room\n" +
                             "Exit;start;north;unknownRoom\n"; // Points to a non-existent room
        File tempFile = createRoomsFile(fileContent);

        // Act
        Game.main(new String[]{tempFile.getAbsolutePath()});

        // No assert needed; check for console error or graceful exit
        tempFile.delete();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadRoomsFromFileInvalidFormat() throws IOException {
        // Arrange
        String fileContent = "InvalidFormat\n";
        File tempFile = createRoomsFile(fileContent);

        // Act
        Game.main(new String[]{tempFile.getAbsolutePath()});

        tempFile.delete();
    }

    @Test
    public void testRoomExits() {
        // Arrange
        Room startRoom = new Room("Start Room");
        Room lobby = new Room("Lobby");
        startRoom.addExit("north", lobby);

        // Act & Assert
        assertEquals(lobby, startRoom.go("north"));
        assertNull(startRoom.go("south")); // No exit south
    }

    @Test
    public void testRoomLookAround() {
        // Arrange
        Room room = new Room("A dark room");
        Room hallway = new Room("A long hallway");
        room.addExit("south", hallway);

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        room.lookAround();

        // Assert
        assertTrue(outContent.toString().contains("A dark room"));
        assertTrue(outContent.toString().contains("south"));

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testCharacterTalking() {
        // Arrange
        Character npc = new Character("Guard", "A stern-looking guard", "Halt! Who goes there?");

        // Redirect standard output to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        npc.talk();

        // Assert
        assertTrue(outContent.toString().contains("Halt! Who goes there?"));

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testCommandParser() {
        // This is a placeholder since the `parse` method in CommandParser is not implemented.
        // A proper implementation would be needed to test command parsing thoroughly.
        GameState state = new GameState(new Room("Room"));
        CommandParser.parse("move north", state);
        // Outputs or state mutations would be checked based on the actual parse logic implemented.
    }
}