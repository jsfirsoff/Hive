package main.kotlin.domain;

import java.util.Stack;

public class Tile {
    private int coordQ;
    private int coordR;
    private Stack<Bug> bugs;

    public Tile(int coordQ, int coordR) {
        this.coordQ = coordQ;
        this.coordR = coordR;
        this.bugs = new Stack<>();
    }
    public int getCoordQ() {
        return coordQ;
    }
    public void setCoordQ(int coordQ) {
        this.coordQ = coordQ;
    }
    public int getCoordR() {
        return coordR;
    }
    public void setCoordR(int coordR) {
        this.coordR = coordR;
    }
    public boolean isOccupied() {
        return !bugs.empty();
    }
    public Bug placeBug(Bug bug) {
        return this.bugs.push(bug);
    }
    public Bug removeBug() {
        return this.bugs.pop();
    }
    public Bug topBug() {
        return this.bugs.peek();
    }
}
