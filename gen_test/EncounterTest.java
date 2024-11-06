package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncounterTest {
    private Encounter monster;
    private Encounter villager;

    @Before
    public void setUp() {
        monster = new Monster("A terrifying beast.");
        villager = new Villager("A friendly villager with a warm smile.");
    }

    @Test
    public void testMonsterInteraction() {
        assertEquals("Monster", monster.getType());
        assertEquals("A terrifying beast.", monster.getDescription());
    }

    @Test
    public void testVillagerInteraction() {
        assertEquals("Villager", villager.getType());
        assertEquals("A friendly villager with a warm smile.", villager.getDescription());
    }
}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

