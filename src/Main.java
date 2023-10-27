import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t---------( WELCOME TO KAIJI GAME!! )---------\n");
        System.out.println("     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶");
        Game game = new Game();
        game.gameMenu();
        System.out.println("\n     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶\n");
        game.firstPlayerTurn();
        System.out.println("\n     ︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶︵︶\n");
        game.secondPlayerTurn();

        int winner = game.comparison();





    }


}


//        System.out.println("┌───────┐" + "\t" + "┌───────┐" + "\t" + "┌───────┐");
//        System.out.println("│     E │" + "\t" + "│     W │" + "\t" + "│     W │");
//        System.out.println("│  EMP  │" + "\t" + "│  War  │" + "\t" + "│  WAR  │");
//        System.out.println("│ E     │" + "\t" + "│ W     │" + "\t" + "│ W     │");
//        System.out.println("└───────┘" + "\t" + "└───────┘" + "\t" + "└───────┘");