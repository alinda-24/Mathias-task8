import java.util.List;
import java.util.ArrayList;

public class ForestLoader {
    public static Forest loadForest(String filename) {
        List<Animal> animals = new ArrayList<>();
        String forestName = "";
        String forestDescription = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                if (type.equals("Forest")) {
                    forestName = parts[1];
                    forestDescription = parts[2];
                } else if (type.equals("Animal")) {
                    String name = parts[1];
                    String description = parts[2];
                    animals.add(new Animal(name, description));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
        
        return new Forest(forestName, forestDescription, animals);
    }
}