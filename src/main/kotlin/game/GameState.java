package game;

import domain.GameBoard;
import enums.GameType;
import enums.TurnStatus;
import players.Player;

//An object containing any info needed to make decision/check rules/etc
public class GameState {
    private GameBoard board;

    private Player[] players;
    private Player currentPlayer;
    private TurnStatus status;
    private int turn;
    private final GameType type;
    public GameState(GameType type) {
        this.turn = 1;
        this.type = type;
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
    public GameType getGameType() { return this.type; }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    public Player switchPlayers() {
        if (currentPlayer.equals(players[0])) {
            this.currentPlayer = players[1];
            return players[1];
        }
        this.currentPlayer = players[0];
        return players[0];
    }
}
