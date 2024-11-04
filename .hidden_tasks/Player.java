import java.util.List;
import java.util.ArrayList;

public class Player {
    private int health;
    private List<String> inventory;

    public Player() {
        this.health = 100;
        this.inventory = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    public List<String> getInventory() {
        return inventory;
    }
}