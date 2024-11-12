/**
 * The `GameState` class manages the current state of the game, including the player’s
 * location, score (points), health points (HP), and interactions with non-player characters (NPCs).
 * It tracks player actions, such as collecting points and engaging in combat, and monitors 
 * victory or game-over conditions based on the player’s HP and points. This class also 
 * provides methods for displaying the player’s current points and HP.
 */

public class GameState {
    private Room currentRoom;
    private int points;
    private int punchCount;
    private int hp;
    
    /**
     * Creates a new GameState with the player starting in a specified room.
     * Initializes the player's points to 0 and health points (HP) to 5.
     * @param startingRoom the room where the player begins.
     */
    public GameState(Room startingRoom) {
            currentRoom = startingRoom;
            this.points = 0;
            this.hp = 5;

    }
    
    /**
     * Retrieves the player's current room.
     * @return the current room the player is in.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sets the player's current room.
     * @param currentRoom the new room to set as the current room.
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * Retrieves the player's current points.
     * @return the player's total points.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Retrieves the player's current health points (HP).
     * @return the player's current HP.
     */
    public int getHp() {
        return hp;
    }

    /**
     * Adds points to the player's score. Positive points indicate points gained, while
     * negative points indicate points lost. If the player reaches 3 points, they win the game.
     * @param pointsToAdd the number of points to add or subtract.
     */
    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;

            if (pointsToAdd > 1){
                System.out.println("You gained " + pointsToAdd + " point! Total points: " + points);
            } else if (pointsToAdd == 1) {
                System.out.println("You gained " + pointsToAdd + " point! Total points: " + points);
            } else if (pointsToAdd == -1){
                System.out.println("You lost " + Math.abs(pointsToAdd) + " point! Total points: " + points);
            } else if (pointsToAdd < -1){
                System.out.println("You lost " + Math.abs(pointsToAdd) + " points! Total points: " + points);
            } else if (pointsToAdd == 0){
                System.out.println("You gained 0 points! Total points " + points );
            }
            
            //Check if the player has won by reaching 5 points
            if(points >= 5){
                System.out.println("Great job! You are victorius and have now won the game!");
                System.exit(0);
            }
    }

    /**
     * Increments the punch count, tracking consecutive punches.
     */
    public void incrementPunchCount() {
        punchCount++;
    }

    /**
     * Resets the punch count to zero, typically after a retaliatory action.
     */
    public void resetPunchCount() {
        punchCount = 0;
    }

    /**
     * Triggers a retaliatory attack if the punch count is 2 or more.
     * Deducts health points (HP) based on the opponent's attack points.
     * If the player’s HP falls to zero or below, the game ends.
     * @param attackPoints the damage dealt back to the player.
     */
    public void triggerPunchBack(int attackPoints){
        if (punchCount >= 2){
            hp -= attackPoints;
                System.out.println("NO! I have had enough! You might like this");
                System.out.println("You lost " + attackPoints + " HP: Try me again if you dare!");
                    if (hp > 0){
                        System.out.println("HP left: " + hp);
                    } else if (hp <= 0){
                        System.out.println("You messed with the wrong people! Game over.");
                        System.exit(0);
                    }
            resetPunchCount();
        }
    }

    /**
     * Checks and displays the player's current points count.
     */
    public void checkPointCount(){
        if (points == 0){
            System.out.println("You have no points! Work harder!");
        } if (points == 1){
            System.out.println("You have 1 point.");
        } if (points == -1){
            System.out.println("You have -1 point.");
        } else {
            System.out.println("You have " + points + " points.");
        }
    }

    /**
     * Checks and displays the player's current health points (HP).
     * Displays a specific message if the player is down to 1 HP.
     */
    public void checkHpCount(){
        if (hp == 1){
            System.out.println("You only have 1 HP left. Be careful");
        } else {
            System.out.println("You have " + hp + " HP left.");
        }
    }
}