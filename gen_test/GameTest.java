package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private GameState testState;
    private Room startRoom;
    private Room northRoom;

    @Before
    public void setUp() {
        startRoom = new Room("Start Room");
        northRoom = new Room("North Room");
        startRoom.addExit("north", northRoom);
        testState = new GameState(startRoom);
    }
    
    @Test
    public void testInitialGameState() {
        assertEquals(startRoom, testState.getCurrentRoom());
    }

    @Test
    public void testGoCommandValidDirection() {
        CommandParser.parse("go north", testState);
        assertEquals(northRoom, testState.getCurrentRoom());
    }

    @Test
    public void testGoCommandInvalidDirection() {
        CommandParser.parse("go east", testState);
        assertEquals(startRoom, testState.getCurrentRoom());
    }

    @Test
    public void testGoCommandWithoutDirection() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CommandParser.parse("go", testState);

        System.setOut(original);
        assertTrue(outputStream.toString().contains("Go where?"));
    }
    
    @Test
    public void testHelpCommand() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CommandParser.parse("help", testState);

        System.setOut(original);
        assertTrue(outputStream.toString().contains("Available commands:"));
    }

    @Test
    public void testUnrecognizedCommand() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CommandParser.parse("dance", testState);

        System.setOut(original);
        assertTrue(outputStream.toString().contains("I don't understand that command."));
    }

    @Test
    public void testRoomLookAround() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testState.getCurrentRoom().lookAround();

        System.setOut(original);
        String output = outputStream.toString();
        assertTrue(output.contains("Start Room"));
        assertTrue(output.contains("north"));
    }

    @Test
    public void testRoomGoToNonexistentExit() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testState.getCurrentRoom().go("west");

        System.setOut(original);
        String output = outputStream.toString();
        assertTrue(output.contains("You can't go that way!"));
        assertTrue(output.contains("There are exits in the directions: north"));
    }

    @Test
    public void testGenerateRoomsFromFileHandlesIOException() {
        PrintStream original = System.err;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        // Assuming we don't have access to an invalid "rooms.txt" file in this test directory.
        File originalFile = new File("rooms.txt");
        File renamedFile = null;

        if (originalFile.exists()) {
            renamedFile = new File("rooms_temp.txt");
            originalFile.renameTo(renamedFile);
        }

        try {
            Game.main(new String[]{});
        } catch (SecurityException ignored) {} // Expecting the method to halt the JVM

        System.setErr(original);
        String output = outputStream.toString();
        assertTrue(output.contains("Error generating rooms from file:"));

        // Restore file if it was renamed
        if (renamedFile != null) {
            renamedFile.renameTo(originalFile);
        }
    }
}