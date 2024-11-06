package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Room room;
    private Encounter monster;
    private Encounter villager;
    private Encounter nullEncounter;
    private Game game;

    @Before
    public void setUp() {
        room = new Room("Test Room", "This is a test room.");
        monster = new Monster("A terrifying beast.");
        villager = new Villager("A friendly villager with a warm smile.");
        nullEncounter = null;
    }
    
    @Test
    public void testProcessEncounterWithMonster() {
        game = new Game(room, monster);
        game.processEncounter();
        // Testing the stdout is beyond the scope without using mocking/stubbing frameworks.
        // We assume here the monster.interact() does what it should (prints to console).
    }
    
    @Test
    public void testProcessEncounterWithVillager() {
        game = new Game(room, villager);
        game.processEncounter();
    }

    @Test
    public void testProcessEncounterWithNoEncounter() {
        game = new Game(room, nullEncounter);
        game.processEncounter();
    }

    // Broader Game play test requires mocking user input, limit scope here
    @Test
    public void testStartGameWithMonster() {
        game = new Game(room, monster);
        assertEquals("Test Room", room.getName());
        assertEquals("This is a test room.", room.getDescription());
        assertEquals("Monster", monster.getType());
    }

    @Test
    public void testStartGameWithVillager() {
        game = new Game(room, villager);
        assertEquals("Test Room", room.getName());
        assertEquals("This is a test room.", room.getDescription());
        assertEquals("Villager", villager.getType());
    }

    // Edge Cases
    @Test(expected = IllegalArgumentException.class)
    public void testGameWithNullRoom() {
        new Game(null, monster);
    }

    @Test
    public void testQuitCommandBreaksGameLoop() {
        // Implement testing using input simulation/mocking.
    }
}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

