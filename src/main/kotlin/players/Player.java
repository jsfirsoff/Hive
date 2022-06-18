package players;

import domain.Tile;
import enums.TileColour;

import java.util.List;

public class Player {
    private final TileColour tileColour;
    private List<Tile> tilesInHand;

    public Player(TileColour tileColour) {
        this.tileColour = tileColour;
    }

    public List<Tile> getTilesInHand() {
        return tilesInHand;
    }

    public void setTilesInHand(List<Tile> tilesInHand) {
        this.tilesInHand = tilesInHand;
    }
}
