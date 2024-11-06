package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {
    private Room room;

    @Before
    public void setUp() {
        room = new Room("Test Room", "This is a test room.");
    }

    @Test
    public void testRoomCreation() {
        assertEquals("Test Room", room.getName());
        assertEquals("This is a test room.", room.getDescription());
    }

    @Test
    public void testLoadRoomsFromFile() {
        List<Room> rooms = Room.loadRoomsFromFile("test_rooms.csv");
        assertTrue(rooms.size() > 0);
    }

    @Test
    public void testLoadRoomsFromFileWithInvalidPath() {
        List<Room> rooms = Room.loadRoomsFromFile("non_existing_file.csv");
        assertEquals(0, rooms.size());
    }
}