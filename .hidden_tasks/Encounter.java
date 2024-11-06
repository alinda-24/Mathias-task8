public class Encounter {
    private String type; // e.g., "Monster" or "Villager"
    private String description;

    public Encounter(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void interact() {
        // Generic interaction
        System.out.println(description);
    }
}