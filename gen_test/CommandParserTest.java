package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {

    private GameState state;
    private Room startingRoom;
    private Room northRoom;

    @Before
    public void setUp() {
        startingRoom = new Room("Starting Room");
        northRoom = new Room("North Room");
        startingRoom.addExit("north", northRoom);
        state = new GameState(startingRoom);
    }

    @Test
    public void testParseGoValidDirection() {
        CommandParser.parse("go north", state);
        assertEquals(northRoom, state.getCurrentRoom());
    }

    @Test
    public void testParseGoInvalidDirection() {
        CommandParser.parse("go south", state);
        // Should still be in the starting room since "south" is invalid
        assertEquals(startingRoom, state.getCurrentRoom());
    }

    @Test
    public void testParseInvalidCommand() {
        CommandParser.parse("fly east", state);
        // Invalid command, should stay in the same room
        assertEquals(startingRoom, state.getCurrentRoom());
    }

    @Test
    public void testHelpMessage() {
        assertEquals("Available commands are: 'go [direction]'", CommandParser.printHelpMessage());
    }
}
```

```java
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

