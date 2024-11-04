package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ForestLoaderTest {
    
    // Note: We assume `forest_data.csv` is present and correctly formatted for these tests.
    
    @Test
    public void testLoadForestSuccessful() {
        Forest forest = ForestLoader.loadForest("test_forest_data.csv");
        assertEquals("Enchanted Woods", forest.getName());
        assertEquals("A mystical forest with various creatures.", forest.getDescription());
    }
    
    @Test(expected = IOException.class)
    public void testLoadForestFileNotFound() {
        ForestLoader.loadForest("non_existing_file.csv");
    }
}