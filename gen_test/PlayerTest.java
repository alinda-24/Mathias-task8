package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testInitialHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testDecreaseHealth() {
        player.decreaseHealth(20);
        assertEquals(80, player.getHealth());
        player.decreaseHealth(100);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testAddItemToInventory() {
        player.addItemToInventory("Sword");
        List<String> inventory = player.getInventory();
        assertEquals(1, inventory.size());
        assertTrue(inventory.contains("Sword"));
    }
}

ForestTest.java:
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

