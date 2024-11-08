public class Config {
    public static final String[] CHOICES = {"ROCK", "PAPER", "SCISSORS"};
    public static final String[] OUTCOMES = {"Tie", "You Win!", "You Lose"};

    public static String printRules() {
        return "Welcome to Rock-Paper-Scissors!\n" +
               "1. Rock crushes Scissors.\n" +
               "2. Scissors cuts Paper.\n" +
               "3. Paper covers Rock.\n" +
               "4. If both players choose the same weapons, it's a tie.";
    }

    public static int calculateWinner(int playerChoice, int npcChoice) {
        if (playerChoice == npcChoice) {
            return 0;
        } else if ((playerChoice == 0 && npcChoice == 2) ||
                   (playerChoice == 1 && npcChoice == 0) ||
                   (playerChoice == 2 && npcChoice == 1)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void printOutcome(int result) {
        switch (result) {
            case 0:
                System.out.println("It's a tie!");
                break;
            case 1:
                System.out.println("You win!");
                break;
            case 2:
                System.out.println("You lose. Loser");
                break;
        }
    }
}

