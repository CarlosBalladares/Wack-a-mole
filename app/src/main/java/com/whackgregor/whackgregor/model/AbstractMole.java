package com.whackgregor.whackgregor.model;

/**
 * Created by carlosballadares on 15-11-08.
 */
public abstract class AbstractMole {

    protected int x;
    protected int y;
    protected int health;

    public AbstractMole(int x, int y, int health){
        setX(x);
        setY(y);
        setHealth(health);
    }

    public abstract void hit();

    public boolean isDead(){
        return health==0;
    }


    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getHealth(){
        return this.health;
    }

    protected void setX(int x){
        this.x=x;
    }

    protected void setY(int y){
        this.y=y;
    }

    protected void setHealth(int health){
        this.health=health;
    }



}
