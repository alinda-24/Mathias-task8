import java.util.List;

public class Forest {
    private String name;
    private String description;
    private List<Animal> animals;

    public Forest(String name, String description, List<Animal> animals) {
        this.name = name;
        this.description = description;
        this.animals = animals;
    }

    public void explore() {
        // Implement explore logic
    }
}