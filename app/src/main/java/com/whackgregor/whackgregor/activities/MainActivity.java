package com.whackgregor.whackgregor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.whackgregor.whackgregor.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int[] holes ={R.id.hole1, R.id.hole2, R.id.hole3, R.id.hole4, R.id.hole5, R.id.hole6, R.id.hole7, R.id.hole8, R.id.hole9};

    public int[] moles ={R.drawable.holewithmole, R.drawable.holewithmole2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView hole = (ImageView) findViewById(holes[5]);
        hole.setImageResource(R.drawable.holewithmole2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public int getRandomItem(int[] array){
        Random rand= new Random();
        return rand.nextInt(array.length);
    }
}
