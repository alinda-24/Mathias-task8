public class Monster extends Encounter {
    
    public Monster(String description) {
        super("Monster", description);
    }

    @Override
    public void interact() {
        System.out.println("A fearsome monster appears! " + getDescription());
        // Add more specific logic for interacting with a Monster
    }
}