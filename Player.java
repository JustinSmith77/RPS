import java.util.Scanner;

public class Player {
    private String name;
    private int choice;

    public Player(String name) {
        this.name = name;
    }

    public void setPlayerChoice() {
        System.out.println("Pick your weapon (ROCK, PAPER, SCISSORS):");
        Scanner askChoice = new Scanner(System.in);
        String pcChoice = askChoice.nextLine();

        for (int i = 0; i < Config.CHOICES.length; i++) {
            if (pcChoice.equalsIgnoreCase(Config.CHOICES[i])) {
                this.choice = i;
                return;
            }
        }
        System.out.println("Invalid choice. Please try again.");
        setPlayerChoice();
        askChoice.close();
    }

    public void setNpcChoice() {
        double rand = Math.random();
        if (rand < 0.333) {
            this.choice = 0;
        } else if (rand < 0.666) {
            this.choice = 1; 
        } else {
            this.choice = 2;
        }
    }

    public int getChoice() {
        return this.choice;
    }

    public String getName() {
        return name;
    }
}
