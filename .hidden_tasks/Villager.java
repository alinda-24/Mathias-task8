public class Villager extends Encounter {

    public Villager(String description) {
        super("Villager", description);
    }

    @Override
    public void interact() {
        System.out.println("A friendly villager greets you! " + getDescription());
        // Add more specific logic for interacting with a Villager
    }
}