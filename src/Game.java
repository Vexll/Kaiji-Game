import java.util.Scanner;

public class Game {

    private static Player firstPlayer;
    private static Player secondPlayer;
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
            firstPlayer = new Player(new EmpireDeck(), firstPlayerName);
            secondPlayer = new Player(new SlaveDeck(), secondPlayerName);
            System.out.println(firstPlayer.getName() + " will start with Empire deck\t\t " + secondPlayer.getName() + " will start with Slave deck");
        } else {
            firstPlayer = new Player(new SlaveDeck(), firstPlayerName);
            secondPlayer = new Player(new EmpireDeck(), secondPlayerName);
            System.out.println(firstPlayer.getName() + " will start with Slave deck\t\t " + secondPlayer.getName() + " will start with Empire deck");
        }
        System.out.println();
        startingMotion();
    }

    public static void firstPlayerTurn() {
        System.out.println("\n     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶\n");
        System.out.println("First player turn");
        firstPlayer.displayCurrentCards();

        //This loop if the user inputs a wrong letter
        do {
            String playerOption = (firstPlayer.getDeck() instanceof EmpireDeck) ?
                    "Enter the first letter for the card you want to play(e = EMP, c = CIT): " :
                    "Enter the first letter for the card you want to play(s = SLV, c = CIT): ";
            System.out.print(playerOption);
            char playerChoice = input.next().charAt(0);
            pickedCardForFirstPlayer = firstPlayer.pickACard(playerChoice);
            input.nextLine(); //consumed line
        } while (pickedCardForFirstPlayer == null);
    }

    public static void secondPlayerTurn() {
        System.out.println("\n     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶\n");
        System.out.println("Second player turn");
        secondPlayer.displayCurrentCards();
        //This loop if the user inputs a wrong letter
        do {
            String playerOption = (firstPlayer.getDeck() instanceof EmpireDeck) ?
                    "Enter the first letter for the card you want to play(e = EMP, c = CIT): " :
                    "Enter the first letter for the card you want to play(s = SLV, c = CIT): ";
            System.out.print(playerOption);
            char playerChoice = input.next().charAt(0);
            pickedCardForSecondPlayer = secondPlayer.pickACard(playerChoice);
            input.nextLine(); //consumed line
        } while (pickedCardForSecondPlayer == null);
    }


    public int comparison() {
        int counter = 1;
        do {
            if(counter < 5) {
                firstPlayerTurn();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                secondPlayerTurn();
            }else{
                if(firstPlayer.getDeck() instanceof EmpireDeck){
                    pickedCardForFirstPlayer = firstPlayer.pickACard('e');
                    pickedCardForSecondPlayer = secondPlayer.pickACard('s');
                }else{
                    pickedCardForFirstPlayer = firstPlayer.pickACard('s');
                    pickedCardForSecondPlayer = secondPlayer.pickACard('e');
                }
            }

            //first player wins
            if ((pickedCardForFirstPlayer instanceof SlaveCard && pickedCardForSecondPlayer instanceof EmpireCard)
                    || (pickedCardForFirstPlayer instanceof CitizenCard && pickedCardForSecondPlayer instanceof SlaveCard)
                    || (pickedCardForFirstPlayer instanceof EmpireCard && pickedCardForSecondPlayer instanceof CitizenCard)) {
                return 1; // 1 refer to first player
            }

            //second player wins
            if ((pickedCardForFirstPlayer instanceof SlaveCard && pickedCardForSecondPlayer instanceof CitizenCard)
                    || (pickedCardForFirstPlayer instanceof EmpireCard && pickedCardForSecondPlayer instanceof SlaveCard)
                    || (pickedCardForFirstPlayer instanceof CitizenCard && pickedCardForSecondPlayer instanceof EmpireCard)) {
                return 2; // 2 refer to second player
            }

            //no win yet
            System.out.println("\nResult: ");
            System.out.println("\tBoth of you have chosen Citizen");
            counter++;
        } while (true);
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

    public static Player getFirstPlayer() {
        return firstPlayer;
    }

    public static Player getSecondPlayer() {
        return secondPlayer;
    }
}