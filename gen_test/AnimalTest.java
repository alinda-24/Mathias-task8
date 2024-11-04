package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;
    private Player mockPlayer;

    @Before
    public void setUp() {
        mockPlayer = mock(Player.class);
        animal = new Animal("Wolf", "A fierce wolf.");
    }

    @Test
    public void testAttack() {
        doNothing().when(mockPlayer).decreaseHealth(10);
        animal.attack(mockPlayer);
        verify(mockPlayer, times(1)).decreaseHealth(10);
    }
}

ForestLoaderTest.java:
import org.junit.Test;
import static org.junit.Assert.assertEquals;

