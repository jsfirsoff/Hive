package main.kotlin.game;

import main.kotlin.domain.GameBoard;
import main.kotlin.enums.GameType;
import main.kotlin.enums.Event;
import main.kotlin.players.Player;

//An object containing any info needed to make decision/check rules/etc
public class GameState {
    private GameBoard board;

    private Player[] players;
    private Player currentPlayer;
    private Event currentEvent;
    private int turn;
    private final GameType type;
    public GameState(GameType type) {
        this.turn = 1;
        this.type = type;
        this.currentEvent = Event.READY;
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
    public Event getEvent() {
        return currentEvent;
    }
    public void setEvent(Event status) {
        this.currentEvent = status;
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
