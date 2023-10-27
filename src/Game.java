import java.util.Scanner;

public class Game {
    private static Player p1;
    private static Player p2;
    private static Card pickedCardForFirstPlayer;
    private static Card pickedCardForSecondPlayer;
    private static Scanner input = new Scanner(System.in);

    public Game() {

    }

    public static void gameMenu() {
        System.out.println();
        System.out.println("player one info -> name and character ");
        System.out.print("\tEnter name: ");
        String firstPlayerName = input.next();
        System.out.println("\nwhat would you like to start with (Empire = 0, Slave = 1)");
        System.out.print("\tEnter option: ");
        int firstPlayerChose = input.nextInt();
        System.out.println();
        System.out.println("     ------------------------Player Two Turn------------------------");
        System.out.println();
        System.out.println("Player two info -> name");
        System.out.print("\tEnter name: ");
        String secondPlayerName = input.next();
        System.out.println("\n     ------------------------Players Status------------------------\n");
        if (firstPlayerChose == 0) {
            p1 = new Player(new EmpireDeck(), firstPlayerName);
            p2 = new Player(new SlaveDeck(), secondPlayerName);
            System.out.println(p1.getName() + " will start with Empire deck\t\t " + p2.getName() + " will start with Slave deck");
        } else {
            p1 = new Player(new SlaveDeck(), firstPlayerName);
            p2 = new Player(new EmpireDeck(), secondPlayerName);
            System.out.println(p1.getName() + " will start with Slave deck\t\t " + p2.getName() + " will start with Empire deck");
        }
        System.out.println();
        startingMotion();
    }

    public static void firstPlayerTurn() {
        System.out.println("First player turn");
        p1.displayCurrentCards();

        //This loop if the user inputs a wrong letter
        do {
            System.out.print("Enter the first letter for the card you want to play(s = SLV, w = WAR, e = EMP): ");
            char playerChoice = input.next().charAt(0);
            pickedCardForFirstPlayer = p1.pickACard(playerChoice);
            input.nextLine(); //consumed line
        }while (pickedCardForFirstPlayer == null);
    }

    public static void secondPlayerTurn() {
        System.out.println("Second player turn");
        p2.displayCurrentCards();
        //This loop if the user inputs a wrong letter
        do {
            System.out.print("Enter the first letter for the card you want to play(s = SLV, w = WAR, e = EMP): ");
            char playerChoice = input.next().charAt(0);
            pickedCardForSecondPlayer = p2.pickACard(playerChoice);
            input.nextLine(); //consumed line
        }while (pickedCardForSecondPlayer == null);
    }


    public int comparison() {
            //first player wins
            if ((pickedCardForFirstPlayer instanceof SlaveCard && pickedCardForSecondPlayer instanceof EmpireCard)
                    || (pickedCardForFirstPlayer instanceof CitizenCard && pickedCardForSecondPlayer instanceof SlaveCard)
                    || (pickedCardForFirstPlayer instanceof EmpireCard && pickedCardForSecondPlayer instanceof CitizenCard)) {
                System.out.println(p1.getName() + " has won\n" + "congratulations!");
                return 1;
            }

            //second player wins
            if ((pickedCardForFirstPlayer instanceof SlaveCard && pickedCardForSecondPlayer instanceof CitizenCard)
                    || (pickedCardForFirstPlayer instanceof EmpireCard && pickedCardForSecondPlayer instanceof SlaveCard)
                    || (pickedCardForFirstPlayer instanceof CitizenCard && pickedCardForSecondPlayer instanceof EmpireCard)) {
                System.out.println(p2.getName() + "has won\n" + "congratulations!");
                return 2;
            }

            //no win yet
            System.out.println("Both of you have chosen Citizen");

            return 0;

    }

    private static void startingMotion() {
        try {
            System.out.println("The Game Will Start in ");
            Thread.sleep(1500);
            System.out.println(3);
            Thread.sleep(1500);
            System.out.println(2);
            Thread.sleep(1500);
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}