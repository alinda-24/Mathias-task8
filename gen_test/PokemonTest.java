package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTest {
    
    @Test
    public void testPokemonConstructorAndGetters() {
        List<Move> moves = new ArrayList<>();
        moves.add(new Move("Thunderbolt", "Electric", 90));
        Pokemon pokemon = new Pokemon("Pikachu", "Electric", 35, moves);

        assertEquals("Pikachu", pokemon.getName());
        assertEquals("Electric", pokemon.getType());
        assertEquals(35, pokemon.getLevel());
        assertEquals(1, pokemon.getMoves().size());
        assertEquals("Thunderbolt", pokemon.getMoves().get(0).getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

