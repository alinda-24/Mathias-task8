package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainerTest {
    
    @Test
    public void testTrainerConstructorAndAddPokemon() {
        Trainer trainer = new Trainer("Ash");
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, new ArrayList<>());
        trainer.addPokemon(pikachu);

        List<Pokemon> pokemons = trainer.getPokemons();
        assertEquals(1, pokemons.size());
        assertEquals("Pikachu", pokemons.get(0).getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

