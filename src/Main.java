import java.util.Scanner;

public class Main {
    static Player p1 = new Player(new EmpireDeck(), "A");
    static Player p2;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("\t\t\t---------( WELCOME TO KAIJI GAME!! )---------");
//        menu();
//        System.out.println("     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶\n");
//        startingMotion();


    }

    public static void menu() {
        System.out.println();
        System.out.println("player one info -> name and character ");
        System.out.print("\tEnter name: ");
        String firstPlayerName = input.next();
        System.out.println("what would you like to start with (Empire = 0, Slave = 1)");
        System.out.print("\tEnter option: ");
        int firstPlayerChose = input.nextInt();
        System.out.println();
        System.out.println("     ------------------------Player Two Turn------------------------");
        System.out.println();
        System.out.println("Player two info -> name");
        System.out.print("\tEnter name: ");
        String secondPlayerName = input.next();
        if (firstPlayerChose == 0) {
            System.out.println("You will start with Slave Deck");
            p1 = new Player(new EmpireDeck(), firstPlayerName);
            p2 = new Player(new SlaveDeck(), secondPlayerName);
        } else {
            System.out.println("You will start with Empire Deck");
            p1 = new Player(new SlaveDeck(), firstPlayerName);
            p2 = new Player(new EmpireDeck(), secondPlayerName);
        }
        System.out.println();
    }

    public static void startingMotion() {
        try {
            System.out.println("Game Will Start in ");
            Thread.sleep(1000);
            System.out.println(3);
            Thread.sleep(1000);
            System.out.println(2);
            Thread.sleep(1000);
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void PlayerTurn(Player p) {
        String player = "";
        if (p == p1)
            player = "First";
        else
            player = "Second";
        System.out.println(player + " Player turn");
        System.out.println(p.deck);
        System.out.print("Enter the first letter if a card you wanna play:");
        char choice = input.next().charAt(0);
        p1.deck.removeCard(choice);
    }

}


//        System.out.println("┌───────┐" + "\t" + "┌───────┐" + "\t" + "┌───────┐");
//        System.out.println("│     E │" + "\t" + "│     W │" + "\t" + "│     W │");
//        System.out.println("│  EMP  │" + "\t" + "│  War  │" + "\t" + "│  WAR  │");
//        System.out.println("│ E     │" + "\t" + "│ W     │" + "\t" + "│ W     │");
//        System.out.println("└───────┘" + "\t" + "└───────┘" + "\t" + "└───────┘");