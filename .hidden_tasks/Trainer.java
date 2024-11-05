import java.util.List;
import java.util.ArrayList;

public class Trainer {
    private String name;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return new ArrayList<>(pokemons);
    }
}