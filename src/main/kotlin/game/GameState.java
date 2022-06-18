package game;

import domain.GameBoard;
import enums.Player;
import kotlin.random.Random;

//An object containing any info needed to make decision/check rules/etc
public class GameState {
    private GameBoard board;
    private Player currentPlayer;
    private int turn;
    public GameState() {
        this.turn = 1;
        this.currentPlayer = Player.getRandom();
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
}
