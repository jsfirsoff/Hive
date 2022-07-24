package main.kotlin.players;

import main.kotlin.domain.Bug;
import main.kotlin.enums.BugColour;

import java.util.List;

public class Player {
    private final BugColour colour;
    private List<Bug> unplayedBugs;

    public Player(BugColour colour) {
        this.colour = colour;
    }
    public List<Bug> getUnplayedBugs() {
        return unplayedBugs;
    }
    public void setUnplayedBugs(List<Bug> unplayedBugs) {
        this.unplayedBugs = unplayedBugs;
    }
    public Bug playBug(Bug bugToPlay) {
        this.unplayedBugs.remove(bugToPlay);
        return bugToPlay;
    }
    public BugColour getColour() {
        return colour;
    }
}
