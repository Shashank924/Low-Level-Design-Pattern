package LLDProblems.TicTacToeGame;

public class Board {
    private int size;
    private Symbol[][] gameBoard;

    public Board(int size) {
        this.size = size;
        gameBoard = new Symbol[size][size];

        for(int row = 0 ; row < size ; row++) {
            for(int col = 0 ; col < size ; col++) {
                gameBoard[row][col] = Symbol.EMPTY;
            }
        }
    }

    public Position makeMove(Player currentPlayer , Board board) {
        return currentPlayer.getPlayerStrategy().makeMove(board);
    }

    public boolean isValidMove(int row , int column) {

        if(row >= 0 && row < size && column >= 0 && column < size && gameBoard[row][column] == Symbol.EMPTY) {
            return true;
        }
        return false;
    }

    public void placeSymbol(Symbol symbol , Position position)
    {
        gameBoard[position.getRow()][position.getColumn()] = symbol;
    }

    public void checkGameState(GameContext context , Player currentPlayer) {
        for (int i = 0; i < size; i++) {
            if (gameBoard[i][0] != Symbol.EMPTY && isWinningLine(gameBoard[i])) {
                context.currentState = currentPlayer.getSymbol() == Symbol.X ? new XWonState() : new OWonState();
                return;
            }
        }
        for (int i = 0; i < size; i++) {
            Symbol[] column = new Symbol[size];
            for (int j = 0; j < size; j++) {
                column[j] = gameBoard[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {
                context.currentState = currentPlayer.getSymbol() == Symbol.X ? new XWonState() : new OWonState();
                return;
            }
        }
        Symbol[] diagonal1 = new Symbol[size];
        Symbol[] diagonal2 = new Symbol[size];
        for (int i = 0; i < size; i++) {
            diagonal1[i] = gameBoard[i][i];
            diagonal2[i] = gameBoard[i][size - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            context.currentState = currentPlayer.getSymbol() == Symbol.X ? new XWonState() : new OWonState();
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {
            context.currentState = currentPlayer.getSymbol() == Symbol.X ? new XWonState() : new OWonState();
            return;
        }

        for(int r = 0 ; r < size ; r++) {
            for(int c = 0 ; c < size ; c++) {
                if(gameBoard[r][c] == Symbol.EMPTY) {
                    context.next();
                    return;
                }
            }
        }

        context.currentState = new GameOverState();
    }
    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
            if (s != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Symbol symbol = gameBoard[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}
