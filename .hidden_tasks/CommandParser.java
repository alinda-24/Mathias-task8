public class CommandParser {
    public static void parse(String command, GameState state) {
        String[] parts = command.split(" ");
        switch (parts[0]) {
            case "go":
                if (parts.length > 1) {
                    Room nextRoom = state.getCurrentRoom().go(parts[1]);
                    if (nextRoom != null) {
                        state.setCurrentRoom(nextRoom);
                        state.getCurrentRoom().lookAround();
                    }
                } else {
                    System.out.println("Go where?");
                }
                break;
            case "help":
                printHelpMessage();
                break;
            default:
                System.out.println("I don't understand that command.");
                break;
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands:");
        System.out.println("go [direction] - move to the room in the specified direction.");
        System.out.println("help - show this help message.");
    }
}