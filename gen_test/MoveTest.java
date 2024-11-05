package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveTest {
    
    @Test
    public void testMoveConstructorAndGetters() {
        Move move = new Move("Thunderbolt", "Electric", 90);
        assertEquals("Thunderbolt", move.getName());
        assertEquals("Electric", move.getType());
        assertEquals(90, move.getPower());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

