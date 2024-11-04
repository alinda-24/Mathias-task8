public class Pokemon {
    private String name;
    private String type;
    private int hitPoints;

    public Pokemon(String name, String type, int hitPoints) {
        this.name = name;
        this.type = type;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    // Additional methods such as battles or moves would be here
}