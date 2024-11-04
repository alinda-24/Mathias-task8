package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonReaderTest {

    private PokemonReader pokemonReader;
    private String validCsv;
    private String invalidCsv;
    private String nonExistentFile;

    @Before
    public void setUp() {
        pokemonReader = new PokemonReader();
        validCsv = "valid_pokemon_data.csv";
        invalidCsv = "invalid_pokemon_data.csv";
        nonExistentFile = "non_existent.csv";

        // Create a valid CSV for testing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(validCsv))) {
            writer.write("Bulbasaur,Grass,45\nCharmander,Fire,39\nSquirtle,Water,44\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create an invalid CSV for testing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(invalidCsv))) {
            writer.write("Bulbasaur,Grass,abc\nCharmander,Fire,39\nSquirtle,Water,44\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadFromFileReturnsCorrectListForValidCsv() {
        List<Pokemon> pokemons = pokemonReader.readFromFile(validCsv);
        assertEquals(3, pokemons.size());
        assertEquals("Bulbasaur", pokemons.get(0).getName());
        assertEquals("Grass", pokemons.get(0).getType());
        assertEquals(45, pokemons.get(0).getHitPoints());
    }

    @Test
    public void testReadFromFileHandlesNonExistentFile() {
        List<Pokemon> pokemons = pokemonReader.readFromFile(nonExistentFile);
        assertTrue(pokemons.isEmpty());
    }

    @Test
    public void testReadFromFileHandlesInvalidNumberFormat() {
        List<Pokemon> pokemons = pokemonReader.readFromFile(invalidCsv);
        // Expected that the entry with invalid data is skipped or causes an error, but the others are read correctly
        assertEquals(2, pokemons.size()); // Only valid entries should be added
    }
}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.*;

