package com.bam.riskroll;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class DiceRollActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_dice_roll, menu);
        return true;
    }
    
    public void onRollButtonClicked(View v) {
        Log.d(DiceRollActivity.class.getSimpleName(), "Roll dat sheeit!");
        
        
    }

}
