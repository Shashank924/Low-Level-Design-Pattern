package LLDProblems.TicTacToeGame;

public class XWonState implements GameState{
    @Override
    public void nextState(GameContext context) {
        context.setState(new GameOverState());
    }
}
