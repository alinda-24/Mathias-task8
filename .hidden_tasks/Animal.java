public class Animal {
    private String name;
    private String description;

    public Animal(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void attack(Player player) {
        // Implement attack logic
    }

    public void evade() {
        // Implement evade logic
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Description: " + description;
    }
}