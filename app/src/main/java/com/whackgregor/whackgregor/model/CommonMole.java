package com.whackgregor.whackgregor.model;

/**
 * Created by carlosballadares on 15-11-08.
 */
public class CommonMole extends AbstractMole {

    public CommonMole(int x, int y){
        super(x, y, 1);
    }

    @Override
    public void hit(){
        assert (health>0);

        super.health--;

        assert (health>=0);

    }
}
