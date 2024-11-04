import java.util.List;
import java.util.ArrayList;

public class Trainer {
    private String name;
    private List<Pokemon> pokemonTeam;

    public Trainer(String name) {
        this.name = name;
        this.pokemonTeam = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonTeam.add(pokemon);
    }

    public List<Pokemon> getPokemonTeam() {
        return pokemonTeam;
    }

    // Add methods for trainer actions like selecting Pokemon for battle
}