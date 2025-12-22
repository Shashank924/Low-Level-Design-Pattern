package LLDProblems.TicTacToeGame;

public class GameOverState implements GameState{
    @Override
    public void nextState(GameContext context) {
        context.setState(new GameOverState());
    }
}
