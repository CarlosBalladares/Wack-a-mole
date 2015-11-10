package com.whackgregor.whackgregor.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by carlosballadares on 15-11-08.
 */
public class MoleManager {

    private static int MOLES=10;

    private Collection<AbstractMole> moles;

    private Collection<AbstractMole> peepingMoles;

    private Board board;

    public MoleManager(Board board){
        this.board= board;
        moles= new ArrayList<AbstractMole>();
        peepingMoles= new ArrayList<AbstractMole>();
    }

    private void generateMoles(){

        for (int i = 0; i < MOLES; i++) {

        }


    }
    public synchronized boolean hitMole(int x, int y){
        for (AbstractMole aMole: peepingMoles){
            if(aMole.getX()==x && aMole.getY()==y){
                aMole.hit();
                moleCleanUp(aMole);
                return true;
            }
        }

        return false;
    }

    private synchronized void moleCleanUp(AbstractMole aMole){
        if(aMole.isDead()){
            moles.remove(aMole);
            peepingMoles.remove(aMole);
        }
    }



}
