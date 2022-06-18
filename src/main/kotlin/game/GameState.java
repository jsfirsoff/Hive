package game;

import domain.GameBoard;
import enums.TileColour;
import enums.TurnStatus;
import players.Player;

//An object containing any info needed to make decision/check rules/etc
public class GameState {
    private GameBoard board;
    private Player currentPlayer;
    private TurnStatus status;
    private int turn;
    public GameState() {
        this.turn = 1;
    }

    public GameBoard getBoard() {
        return board;
    }
    public void setBoard(GameBoard board) {
        this.board = board;
    }
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    public int getTurn() {
        return turn;
    }
    public void nextTurn() {
        this.turn = ++turn;
    }
    public TurnStatus getStatus() {
        return status;
    }
    public void setStatus(TurnStatus status) {
        this.status = status;
    }
}
