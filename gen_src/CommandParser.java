public class CommandParser {
    /**
     * Parses a command entered by the player. Based on the command, it calls the
     * appropriate method to execute the action in the game, such as moving to a new
     * room, talking to a character, or collecting an item.
     *
     * @param command the string entered by the player
     * @param state   the current game state, including the player's current room.
     */
    public static void parse(String command, GameState state) {
        // Perform some initial handling of the command, removing any whitespace before
        // and after, turning it to lower case and splitting the command
        // on one or more whitespace characters
        String[] splitCommand = command.trim().toLowerCase().split("\\s+");

        // Check so that the player has entered something
        if (splitCommand.length < 1) {
            printInvalidCommandMessage();
            return;
        }

        // Attempt to match the player input to a command and execute it
        switch (splitCommand[0]) {
            case "go":
                executeGoCommand(splitCommand, state);
                break;
            case "look":
                executeLookCommand(state);
                break;
            case "talk":
                executeTalkCommand(state);
                break;
            case "who":
                executeWhoCommand(state);
                break;
            case "punch":
                executePunchCommand(state, state.getCurrentRoom().getCharacter());
                break;
            case "collect":
                executeCollectCommand(state, state.getCurrentRoom().getItem());
                break;
            case "points":
                executePointsCommand(state);
                break;
            case "hp":
                executeHpCommand(state);
                break;
            case "item":
                executeItemCommand(state);
                break;
            case "help":
                printHelpMessage();
                break;
            default:
                printInvalidCommandMessage();
                break;
        }
    }

    /**
     * Attempts to move the player in the specified direction. If a room exists in the
     * specified direction, it changes the player's current room to that room.
     *
     * @param splitCommand the array containing the command and direction (e.g., "go north").
     * @param state        the current game state, including the player's current room.
     */
    private static void executeGoCommand(String[] splitCommand, GameState state) {
            // Check so that we have a direction word
            if (splitCommand.length < 2) {
                printMissingModifierMessage("go");
            } else {
                // Attempt to leave the current room in the given direction
                Room currentRoom = state.getCurrentRoom();
                Room newRoom = currentRoom.go(splitCommand[1]);
                if (newRoom != null) {
                    state.setCurrentRoom(newRoom);
                    newRoom.movingRooms();
                    state.resetPunchCount();
                }
            }
        }
    
    /**
     * Allows the player to look around the current room, showing descriptions of the
     * room's contents, including characters, items, and exits.
     *
     * @param state the current game state.
     */
    private static void executeLookCommand(GameState state) {
        state.getCurrentRoom().lookAround();
        }

    /**
     * Displays the character(s) present in the current room, if any. This command
     * gives players information about who or what is in the room with them and exits.
     *
     * @param state the current game state.
     */    
    private static void executeWhoCommand(GameState state){
        state.getCurrentRoom().whoIsHere();
    }

    /**
     * Displays the player's current point count, letting them see their progress toward
     * reaching 3 points, which is required to win the game.
     *
     * @param state the current game state.
     */
    private static void executePointsCommand(GameState state){
        state.checkPointCount();
    }

    /**
     * Displays the player's current HP (health points) so they can keep track of their
     * health status. If 0 is reached, game is over
     * @param state the current game state.
     */
    private static void executeHpCommand(GameState state){
        state.checkHpCount();
    }

    /**
     * Shows information about any item present in the current room. If an item is
     * available, the player will see the name of it.
     *
     * @param state the current game state.
     */
    private static void executeItemCommand(GameState state){
        if (state.getCurrentRoom().getItem() != null){
            state.getCurrentRoom().checkItem();
        } else {
            System.out.println("There is nothing here.");
        }
    }

    /**
     * Allows the player to talk to any character present in the room. If a character is
     * present, this command displays the character's dialogue.
     *
     * @param state the current game state.
     */
    private static void executeTalkCommand(GameState state){
        Room currentRoom = state.getCurrentRoom();
        
        Character character = currentRoom.getCharacter();
            
        if(character != null){
            character.talk();
        } else {
            System.out.println("There is no one to talk to here.");
        }
    }

    /**
     * Allows the player to punch a character in the current room if they are present
     * and have HP left. The punch reduces the character's HP and can eventually lead
     * to defeating the character, awarding or deducting points to/of the player.
     *
     * @param state  the current game state.
     * @param target the character being targeted by the punch action.
     */
    public static void executePunchCommand(GameState state, Character target) {
        if (target != null){
            if (target.getHp() > 0) {
                state.incrementPunchCount();
                target.setHp(target.getHp() - 1);
                
                if (!target.isDefeated()) {
                    System.out.println("You just punched me!");
                    System.out.println("Now I only have: " + target.getHp() + " hp left!");
                } else {
                    if (target.getRewardPoints() > 0){
                        System.out.println("You defeated the figure!");
                    } else {
                        System.out.println("You should not kill such a wonderful figure!");
                    }   
                        state.addPoints(target.getRewardPoints());
                        state.getCurrentRoom().removeCharacter();
                }


                if (target.getAttackpoints() > 0 && !target.isDefeated()) {
                    state.triggerPunchBack(target.getAttackpoints());
                }
            } else {
                System.out.println("The character has no hp left. You can't punch them anymore!");
            }
        } else {
            System.out.println("There is no one here to punch.");
        }
    }

    /**
     * Collects an item in the room, if available, and updates the player's points based
     * on the item's value. If collected, the item is removed from the room.
     *
     * @param state the current game state.
     * @param item  the item to be collected.
     */
    public static void executeCollectCommand(GameState state, Item item){
        if (item != null){
            System.out.println("You collected " + item.getName());
                if (item.getPointsValue() == 0){
                    System.out.println("This is useless.");
                }
            state.addPoints(item.getPointsValue());
            state.getCurrentRoom().removeItem();
        } else {
            System.out.println("There is nothing here to collect.");
        }
    }
    
    /**
     * Prints an error message for an invalid command, guiding the player to use "help"
     * for a list of valid commands.
     */
    private static void printInvalidCommandMessage() {
        System.out.println("I'm sorry, that's not a valid command. " +
                               "Type \"help\" for information about commands.");
        }

    /**
     * Prints a message indicating that a specific command requires additional input
     * (e.g., "go north" requires a direction).
     *
     * @param command the string entered by player.
     */
    private static void printMissingModifierMessage(String command) {
        System.out.println("I'm sorry, the \"" + command + "\" command requires one more command word. " +
                               "Type \"help\" for information about commands.");
        }

    /**
     * Displays a list of available commands and brief descriptions for each, guiding the
     * player in navigating and interacting with the game.
     */
     public static void printHelpMessage() {
        System.out.println("Your available commands are:");
        System.out.println("    \"go <direction>\" - Attempt to leave the current room in the given direction.");
        System.out.println("    \"look\" - Look around the current room.");            
        System.out.println("    \"help\" - Print this useful help message.");
        System.out.println("    \"who\" - Find out if who might be hiding.");
        System.out.println("    \"talk\" - Talk to a character in the room.");
        System.out.println("    \"item\"    - Look at potential items");
        System.out.println("    \"collect\" - Fill your bag with precious items.");
        System.out.println("    \"hp\"  Keep track of your HP.");
        System.out.println("    \"points\"   - Look how many points you have.");
        System.out.println("    \"punch\" - Do you dare?");
        System.out.println("To win: Reach 3 points by defeating characters or collecting items. But watch out some might punch back.");
    }
}
