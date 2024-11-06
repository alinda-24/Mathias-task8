package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    private GameState state;
    private Room room1;
    private Room room2;

    @Before
    public void setUp() {
        room1 = new Room("Room 1");
        room2 = new Room("Room 2");
        state = new GameState(room1);
    }

    @Test
    public void testGetCurrentRoom() {
        assertEquals(room1, state.getCurrentRoom());
    }

    @Test
    public void testSetCurrentRoom() {
        state.setCurrentRoom(room2);
        assertEquals(room2, state.getCurrentRoom());
    }
}
```

```java
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

