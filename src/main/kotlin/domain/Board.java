package domain;

public class Board {
    private final int ROW_COUNT = 20;
    private Tile[][] tiles = new Tile[ROW_COUNT][];

    public Board() {
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

    public Tile getTile(int row, int col) {
        return tiles[col][row];
    }
}
