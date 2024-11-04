package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainerTest {

    private Trainer ash;
    private Trainer brock;
    private Pokemon bulbasaur;
    private Pokemon charmander;

    @Before
    public void setUp() {
        ash = new Trainer("Ash");
        brock = new Trainer("Brock");
        bulbasaur = new Pokemon("Bulbasaur", "Grass", 45);
        charmander = new Pokemon("Charmander", "Fire", 39);
    }

    @Test
    public void testAddPokemon() {
        ash.addPokemon(bulbasaur);
        assertEquals(1, ash.getPokemonTeam().size());
        assertEquals(bulbasaur, ash.getPokemonTeam().get(0));
    }

    @Test
    public void testMultiplePokemonAddition() {
        ash.addPokemon(bulbasaur);
        ash.addPokemon(charmander);
        assertEquals(2, ash.getPokemonTeam().size());
    }

    @Test
    public void testGetPokemonTeam() {
        brock.addPokemon(charmander);
        List<Pokemon> team = brock.getPokemonTeam();
        assertEquals(1, team.size());
        assertEquals(charmander, team.get(0));
    }

    @Test
    public void testEmptyPokemonTeam() {
        assertTrue(ash.getPokemonTeam().isEmpty());
    }
}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

import java.util.*;

@RunWith(JUnit4.class)
