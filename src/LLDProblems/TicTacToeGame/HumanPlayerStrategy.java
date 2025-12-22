package LLDProblems.TicTacToeGame;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy{
    @Override
    public Position makeMove(Board board) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please Enter the row and column of your move");
            int row = sc.nextInt();
            int column = sc.nextInt();

            if(board.isValidMove(row , column)) {
                return new Position(row , column);
            }
            System.out.println("Invalid Move! Please Try Again");
        }
    }
}
