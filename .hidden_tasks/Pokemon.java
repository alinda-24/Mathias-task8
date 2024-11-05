import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private String name;
    private String type;
    private int level;
    private List<Move> moves;

    public Pokemon(String name, String type, int level, List<Move> moves) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public List<Move> getMoves() {
        return new ArrayList<>(moves);
    }
}