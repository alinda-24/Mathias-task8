package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testRoomConstructorAndLookAround() {
        Room room = new Room("You are in a small chamber.");
        room.lookAround();
    }
    
    @Test
    public void testAddExitAndGo() {
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        
        room1.addExit("north", room2);
        
        assertEquals(room2, room1.go("north"));
        assertNull(room1.go("south"));
    }
    
    @Test
    public void testPrintExits() {
        Room room = new Room("Room with exits");
        room.addExit("north", new Room("North Room"));
        room.addExit("east", new Room("East Room"));
        
        room.printExits();
    }
}