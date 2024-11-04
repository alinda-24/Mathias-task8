package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private Player mockPlayer;
    private Forest mockForest;

    @Before
    public void setUp() {
        mockPlayer = mock(Player.class);
        mockForest = mock(Forest.class);
        game = new Game(mockForest);
    }

    @Test
    public void testPlayerExploreAction() {
        when(mockPlayer.getHealth()).thenReturn(100);
        doNothing().when(mockForest).explore();
        game.start();
        verify(mockForest, times(1)).explore();
    }

    @Test
    public void testInvalidActionDoesNotThrowError() {
        when(mockPlayer.getHealth()).thenReturn(100);
        System.setIn(new java.io.ByteArrayInputStream("invalidAction\nexit\n".getBytes()));
        game.start();
    }
}

PlayerTest.java:
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

