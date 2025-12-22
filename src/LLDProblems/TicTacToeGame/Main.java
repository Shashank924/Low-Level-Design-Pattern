package LLDProblems.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        PlayerStrategy humanPlayerStrategy = new HumanPlayerStrategy();
        GameContext gameContext = new GameContext();

        TicTacToeGame game = new TicTacToeGame(humanPlayerStrategy , humanPlayerStrategy , gameContext);
        game.play();
    }
}
