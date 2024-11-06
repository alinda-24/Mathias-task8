public class CommandParser {
    public static void parse(String command, GameState state) {
        if (command.startsWith("go ")) {
            String direction = command.replace("go ", "").trim();
            Room newRoom = state.getCurrentRoom().go(direction);
            if (newRoom != null) {
                state.setCurrentRoom(newRoom);
                newRoom.lookAround();
            }
        } else {
            System.out.println("I don't understand that command.");
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands are: 'go [direction]'");
    }
}