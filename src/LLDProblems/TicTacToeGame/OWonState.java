package LLDProblems.TicTacToeGame;

public class OWonState implements GameState{
    @Override
    public void nextState(GameContext context) {
        context.setState(new GameOverState());
    }
}
