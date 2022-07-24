package main.kotlin.domain;

public class GameBoard {
    private final int ROW_COUNT = 20;
    private Tile[][] tiles = new Tile[ROW_COUNT][];

    public GameBoard() {
        createBoard();
    }
    private void createBoard() {
        int rowSize = ROW_COUNT;
        for (int i = ROW_COUNT /2; i < ROW_COUNT; rowSize--) {
            tiles[i] = new Tile[rowSize];
        }
        for (int i = 0; i < ROW_COUNT /2; rowSize++) {
            tiles[i] = new Tile[rowSize];
        }
    }

    private Tile getTile(int row, int col) {
        return tiles[col][row];
    }

    public Tile getTile(Tile tile) {
        //odd-r offset ?-->is this even needed with this implementation?
        // translate coordinates to x, y
        return getTile(tile.getCoordQ(), tile.getCoordR());
    }

    private void setTile(int row, int col, Tile tile) {
        tiles[col][row] = tile;
    }

    public void updateTile(Tile tile) {
        setTile(tile.getCoordQ(), tile.getCoordR(), tile); //swap?
    }
}
