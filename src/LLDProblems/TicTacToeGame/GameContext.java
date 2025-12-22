package LLDProblems.TicTacToeGame;

public class GameContext {
    GameState currentState;

    public GameContext() {
        currentState = new XTurnState();
    }

    public void next() {
        currentState.nextState(this);
    }

    public void setState(GameState state) {
        this.currentState = state;
    }

    public GameState getCurrentState() {
        return currentState;
    }
}
