
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        System.out.println(Config.printRules());

        Scanner scanner = new Scanner(System.in);


        System.out.print("Do you understand? Y/N:");
        Player pc = new Player(scanner.nextLine());
        Player npc = new Player("NPC");


        pc.setPlayerChoice();

        npc.setNpcChoice();
        System.out.println("NPC chose: " + Config.CHOICES[npc.getChoice()]);

        int result = Config.calculateWinner(pc.getChoice(), npc.getChoice());
        Config.printOutcome(result);
    }
}
