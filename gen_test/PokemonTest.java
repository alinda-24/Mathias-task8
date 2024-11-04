package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTest {

    private Pokemon bulbasaur;
    private Pokemon charmander;

    @Before
    public void setUp() {
        bulbasaur = new Pokemon("Bulbasaur", "Grass", 45);
        charmander = new Pokemon("Charmander", "Fire", 39);
    }

    @Test
    public void testPokemonAttributes() {
        assertEquals("Bulbasaur", bulbasaur.getName());
        assertEquals("Grass", bulbasaur.getType());
        assertEquals(45, bulbasaur.getHitPoints());

        assertEquals("Charmander", charmander.getName());
        assertEquals("Fire", charmander.getType());
        assertEquals(39, charmander.getHitPoints());
    }

    // Edge case tests:
    @Test
    public void testPokemonWithZeroHitPoints() {
        Pokemon faintedPokemon = new Pokemon("Fainted", "Normal", 0);
        assertEquals(0, faintedPokemon.getHitPoints());
    }

    @Test
    public void testPokemonWithNegativeHitPoints() {
        Pokemon negativeHpPokemon = new Pokemon("Ghost", "Ghost", -5);
        assertEquals(-5, negativeHpPokemon.getHitPoints());
    }
}