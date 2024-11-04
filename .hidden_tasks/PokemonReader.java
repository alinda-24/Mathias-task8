import java.util.List;
import java.util.ArrayList;

public class PokemonReader {
    public List<Pokemon> readFromFile(String filename) {
        List<Pokemon> pokemons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String type = data[1];
                int hitPoints = Integer.parseInt(data[2]);
                pokemons.add(new Pokemon(name, type, hitPoints));
            }
        } catch (IOException e) {
            System.err.println("Error reading pokemon data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Incorrect data format in file: " + e.getMessage());
        }
        return pokemons;
    }
}