/**
 * The `Character` class represents non-player characters (NPCs) in the game.
 * Each character has a name, description, dialogue, health points (HP), reward points,
 * and attack points. Characters can interact with the player, speak dialogue, and be 
 * engaged in combat. This class provides methods to retrieve and modify the character’s 
 * attributes, check if the character is defeated, and display descriptive information 
 * about the character.
 */

public class Character {
    private String name;
    private String description;
    private String dialogue;
    private int hp;
    private int rewardPoints;
    private int attackPoints;
    
    /**
     * Constructs a Character with specified attributes.
     * @param name the name of the character.
     * @param description a description of the character.
     * @param dialogue the dialogue the character will say.
     * @param hp the character's health points (HP).
     * @param rewardPoints points awarded to the player if they defeat this character.
     * @param attackPoints the points deducted from the player if the character retaliates.
     */
    public Character(String name, String description, String dialogue, int hp, int rewardPoints, int attackPoints) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
        this.hp = hp;
        this.rewardPoints = rewardPoints;
        this.attackPoints = attackPoints;
    }

    /**
     * Retrieves the character's name.
     * @return the character's name.
     */
    public String getName(){
        return name;
    }

    /**
     * Retrieves the character's health points (HP).
     * @return the character's HP.
     */
    public int getHp(){
        return hp;
    }

    /**
     * Retrieves the reward points the player receives for defeating this character.
     * @return the reward points.
     */
    public int getRewardPoints(){
        return rewardPoints;
    }

    /**
     * Retrieves the character's description.
     * @return the description of the character.
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Retrieves the dialogue that this character will say when spoken to.
     * @return the character's dialogue.
     */
    public String getDialogue(){
        return dialogue;
    }

    /**
     * Retrieves the attack points of this character, used for retaliatory damage.
     * @return the attack points.
     */
    public int getAttackpoints(){
        return attackPoints;
    }

    /**
     * Checks if the character has been defeated, defined by having 0 or fewer HP.
     * @return true if HP is 0 or less, false otherwise.
     */
    public boolean isDefeated(){
        return hp <= 0;
    }

    /**
     * Sets a new name for the character.
     * @param name the new name to assign to the character.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Updates the character's HP.
     * @param hp the new HP value for the character.
     */
    public void setHp(int hp){
        this.hp = hp;
    }

    /**
     * Updates the character's description.
     * @param description the new description for the character.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Updates the dialogue for the character.
     * @param dialogue the new dialogue for the character.
     */
    public void setDialogue (String dialogue){
        this.dialogue = dialogue;
    }

    /**
     * Outputs the character's dialogue to the console.
     */
    public void talk() {
        System.out.println(dialogue);
    }

    /**
     * Outputs information about the character's name and description to the console.
     */
    public void who(){
        System.out.println("The figure here is: " + name);
        System.out.println("They are a " + description);
    }

}
