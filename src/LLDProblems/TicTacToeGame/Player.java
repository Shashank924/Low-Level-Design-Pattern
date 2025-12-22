package LLDProblems.TicTacToeGame;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private PlayerStrategy playerStrategy;

    public Player(Symbol symbol , PlayerStrategy playerStrategy) {
        this.symbol = symbol;
        this.playerStrategy = playerStrategy;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }

    public Position makeMove(Board board) {
        return playerStrategy.makeMove(board);
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayerStrategy(PlayerStrategy playerStrategy) {
        this.playerStrategy = playerStrategy;
    }
}
