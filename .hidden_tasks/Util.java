import java.util.List;
import java.util.ArrayList;

public class Util {
    public static List<Pokemon> loadPokemonsFromFile(String filename) {
        List<Pokemon> pokemons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String type = data[1];
                int level = Integer.parseInt(data[2]);
                List<Move> moves = parseMoves(data[3]);
                pokemons.add(new Pokemon(name, type, level, moves));
            }
        } catch (IOException e) {
            System.err.println("Error reading Pokemon data: " + e.getMessage());
        }
        return pokemons;
    }

    private static List<Move> parseMoves(String movesData) {
        List<Move> moves = new ArrayList<>();
        String[] movesArray = movesData.split(";");
        for (String moveInfo : movesArray) {
            String[] moveParts = moveInfo.split("-");
            moves.add(new Move(moveParts[0], moveParts[1], Integer.parseInt(moveParts[2])));
        }
        return moves;
    }
}