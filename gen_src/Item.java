/**
 * The `Item` class represents items in the game world that players can interact with.
 * Each item has a name and a points value, which affects the player's score when collected.
 * Points can be positive (gaining points) or negative (losing points) depending on the item's 
 * characteristics. Additionally, items can be marked as "collected" when their points value 
 * reaches zero or below. This class provides methods for retrieving the item's name, points value,
 * and determining if it has been collected.
 */
public class Item {
    private String name;
    private int pointsValue;  

    /**
     * Constructs an item with specified attributes.
     * @param name the name if the item.
     * @param pointsValue pointsValue the points value associated with the item, which determines how 
     *                    many points the user will gain or lose upon collecting it.
     */
    public Item(String name, int pointsValue) {
        this.name = name;
        this.pointsValue = pointsValue;
    }

    /**
     * Retrieves the item's points value.
     * @return the item's points value.
     */
    public int getPointsValue() {
        return pointsValue;
    }

    /**
     * Retrieves the name of the item.
     * @return the name of the item.
     */
    public String getName(){
        return name;
    }

    /**
     * Checks if the item has already been collected by the player.
     * An item is considered "collected" if its points value is zero or less.
     * @return true if the item has been collected; false otherwise.
     */
    public boolean isCollected(){
        return pointsValue <= 0;
    }

    /**
     * Prints the item's name to the console, allowing players to identify it.
     */
    public void checkItem(){
        System.out.println(this.name);
    }
}

