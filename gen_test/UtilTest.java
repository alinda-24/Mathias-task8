package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testLoadPokemonsFromFile() throws IOException {
        String content = """
                         Pikachu,Electric,35,Thunderbolt-Electric-90;Quick Attack-Normal-40
                         Charmander,Fire,30,Ember-Fire-40;Scratch-Normal-40
                         """;
        
        File tempFile = File.createTempFile("tempfile", ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
            bw.write(content);
        }

        List<Pokemon> pokemons = Util.loadPokemonsFromFile(tempFile.getAbsolutePath());
        assertEquals(2, pokemons.size());

        Pokemon p1 = pokemons.get(0);
        assertEquals("Pikachu", p1.getName());
        assertEquals("Electric", p1.getType());
        assertEquals(35, p1.getLevel());
        assertEquals(2, p1.getMoves().size());
        assertEquals("Thunderbolt", p1.getMoves().get(0).getName());

        Pokemon p2 = pokemons.get(1);
        assertEquals("Charmander", p2.getName());
        assertEquals("Fire", p2.getType());
        assertEquals(30, p2.getLevel());
        assertEquals(2, p2.getMoves().size());
        assertEquals("Ember", p2.getMoves().get(0).getName());

        tempFile.delete();
    }

    @Test
    public void testLoadPokemonsFromFileMalformedLine() throws IOException {
        String content = """
                         Pikachu,Electric,35,Thunderbolt-Electric-90
                         Malformed Line
                         """;
        
        File tempFile = File.createTempFile("tempfile", ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
            bw.write(content);
        }

        // We expect the malformed line to be skipped and no exceptions thrown
        List<Pokemon> pokemons = Util.loadPokemonsFromFile(tempFile.getAbsolutePath());
        assertEquals(1, pokemons.size());

        Pokemon p1 = pokemons.get(0);
        assertEquals("Pikachu", p1.getName());
        assertEquals("Electric", p1.getType());
        assertEquals(35, p1.getLevel());
        assertEquals(1, p1.getMoves().size());
        assertEquals("Thunderbolt", p1.getMoves().get(0).getName());

        tempFile.delete();
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

