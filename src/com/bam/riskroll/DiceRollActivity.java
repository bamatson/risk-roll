package com.bam.riskroll;

import com.bam.riskroll.view.DieSelectorView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class DiceRollActivity extends Activity {
    
    private static final int[] attackerDieViews = {
        R.id.dieAttacker1,
        R.id.dieAttacker2,
        R.id.dieAttacker3
    };
    
    private static final int[] defenderDieViews = {
        R.id.dieDefender1,
        R.id.dieDefender2
    };

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
        
        for(int i = 0; i < attackerDieViews.length; i++) {
            ((DieSelectorView) (findViewById(attackerDieViews[i]))).setDieValue(DieRoller.roll());
        }
        
        for(int i = 0; i < defenderDieViews.length; i++) {
            ((DieSelectorView) (findViewById(defenderDieViews[i]))).setDieValue(DieRoller.roll());
        }
    }

}
