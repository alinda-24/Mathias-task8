import java.util.List;

public class Game {
    public static void main(String[] args) {
        PokemonReader pokemonReader = new PokemonReader();
        List<Pokemon> pokemons = pokemonReader.readFromFile("pokemon_data.csv");
        
        Trainer ash = new Trainer("Ash");
        Trainer brock = new Trainer("Brock");

        // Adding some sample Pokémon to trainers
        ash.addPokemon(pokemons.get(0)); // example: Bulbasaur
        brock.addPokemon(pokemons.get(1)); // example: Charmander

        BattleArena arena = new BattleArena(ash, brock);
        arena.startBattle();
        
        // Implement game loop & AI behavior
    }
}