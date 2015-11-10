package com.whackgregor.whackgregor.model;

/**
 * Created by carlosballadares on 15-11-09.
 */
public class Board {

    private int x;
    private int y;

    private MoleManager moleManager;

    public Board(int width, int height){
        moleManager= new MoleManager(this);
        setX(width);
        setY(height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    public void whack(int x, int y){
        moleManager.hitMole(x, y);
    }
}
