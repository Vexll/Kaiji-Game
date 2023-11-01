import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean result;
        do {
            System.out.println("\t\t\t---------( WELCOME TO KAIJI GAME!! )---------\n");
            System.out.println("     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶");
            Game game = new Game();
            boolean answerChecker;
            game.gameMenu();

            int winner = game.comparison();

            // game result part
            if (winner == 1) {
                System.out.println("\n" + game.getFirstPlayer().getName() + " has won\n" + "congratulations!");
            } else {
                System.out.println("\n" + game.getSecondPlayer().getName() + " has won\n" + "congratulations!");
            }

            // rep part
            do {
                System.out.print("do you want to play again? (yes/no): ");
                String playAgainOption = input.next();

                answerChecker = (playAgainOption.equalsIgnoreCase("yes") || playAgainOption.equalsIgnoreCase("no"));
                if (!answerChecker)
                    System.out.println("invalid input, please enter a correct input");

                if (playAgainOption.equalsIgnoreCase("yes"))
                    result = true;
                else
                    result = false;

            } while (!answerChecker);

        } while (result);
    }
}
