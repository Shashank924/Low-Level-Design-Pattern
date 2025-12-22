package LLDProblems.TicTacToeGame;

public class TicTacToeGame {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameContext gameContext;

    public TicTacToeGame(PlayerStrategy playerOStrategy, PlayerStrategy playerXStrategy, GameContext gameContext) {
        this.board = new Board(3);
        this.playerO = new Player(Symbol.O , playerOStrategy);
        this.playerX = new Player(Symbol.X , playerXStrategy);
        currentPlayer = playerX;
        this.gameContext = gameContext;
    }

    public void play() {
        do {
            board.printBoard();
            Position position = currentPlayer.makeMove(board);
            board.placeSymbol(currentPlayer.getSymbol() , position);

            board.checkGameState(gameContext , currentPlayer);
            switchPlayer();

        } while (!(gameContext.getCurrentState() instanceof GameOverState) && !(gameContext.getCurrentState() instanceof XWonState)
        && !(gameContext.getCurrentState() instanceof OWonState));
        announceResult();
    }

    private void switchPlayer() {
        if(currentPlayer.getSymbol() == Symbol.X) {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
