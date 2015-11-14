package com.whackgregor.whackgregor.ui;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.whackgregor.whackgregor.R;


/**
 * Created by carlosballadgares on 15-11-11.
 */
public class HoleView extends ImageView {

    public static final int HOLE=       R.drawable.hole;

    public static final int HOLE_MOLE=  R.drawable.holewithmole2;

    private boolean mole=false;

    public HoleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(hasMole())
                    hideMole();
                else
                    showMole();
            }
        });
        setImageResource(HOLE);
    }

    public void showMole(){
        setImageResource(HOLE_MOLE);
        mole=true;
    }

    public void hideMole(){
        setImageResource(HOLE);
        mole=false;
    }

    public boolean hasMole(){
        return mole;
    }




}
