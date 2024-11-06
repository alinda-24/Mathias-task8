package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    private Room room;
    private Room exitRoom;

    @Before
    public void setUp() {
        room = new Room("A test room.");
        exitRoom = new Room("The room after the exit.");
        room.addExit("north", exitRoom);
    }

    @Test
    public void testRoomDescription() {
        assertEquals("A test room.", room.lookAround());
    }

    @Test
    public void testRoomHasExit() {
        assertEquals(exitRoom, room.go("north"));
    }

    @Test
    public void testRoomNoExit() {
        assertNull(room.go("south"));
    }

    @Test
    public void testPrintExits() {
        room.addExit("east", new Room("Another room."));
        room.addExit("south", new Room("One more room."));
        assertEquals("There are exits in the directions: north east south ", room.printExits());
    }
}
```

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

