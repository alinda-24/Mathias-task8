package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void testGameStateConstructorAndGetters() {
        Room startRoom = new Room("Starting Point");
        GameState state = new GameState(startRoom);

        assertEquals(startRoom, state.getCurrentRoom());
    }

    @Test
    public void testSetCurrentRoom() {
        Room startRoom = new Room("Starting Point");
        Room secondRoom = new Room("Second Room");
        GameState state = new GameState(startRoom);
        state.setCurrentRoom(secondRoom);

        assertEquals(secondRoom, state.getCurrentRoom());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

