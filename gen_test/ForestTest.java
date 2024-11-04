package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ForestTest {
    private Forest forest;
    private Player mockPlayer;
    private List<Animal> mockAnimals;

    @Before
    public void setUp() {
        mockAnimals = mock(List.class);
        mockPlayer = mock(Player.class);
        forest = new Forest("Enchanted Woods", "A mysterious forest.", mockAnimals);
    }

    @Test
    public void testExplore() {
        doNothing().when(mockAnimals).get(0).attack(mockPlayer);
        forest.explore();
        verify(mockAnimals, atLeastOnce()).get(0).attack(mockPlayer);
    }
}

AnimalTest.java:
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

