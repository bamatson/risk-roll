package com.bam.riskroll.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;

import com.bam.riskroll.R;

public class DieSelectorView extends CheckBox {
    
    private int dieValue;
    private boolean isAttacker;
    
    private static final int[] attackerDieBgResources = {
        R.drawable.die_bg_attacker1,
        R.drawable.die_bg_attacker2,
        R.drawable.die_bg_attacker3,
        R.drawable.die_bg_attacker4,
        R.drawable.die_bg_attacker5,
        R.drawable.die_bg_attacker6
    };
    
    private static final int[] defenderDieBgResources = {
        R.drawable.die_bg_defender1,
        R.drawable.die_bg_defender2,
        R.drawable.die_bg_defender3,
        R.drawable.die_bg_defender4,
        R.drawable.die_bg_defender5,
        R.drawable.die_bg_defender6
    };
    
    public DieSelectorView(Context context) {
        super(context);
        
    }

    public DieSelectorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public DieSelectorView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }
    
    private void init(Context context, AttributeSet attrs) {
        
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.DieSelectorView);
        
        setIsAttacker(a.getBoolean(R.styleable.DieSelectorView_isAttacker, false));
        setDieValue(a.getInt(R.styleable.DieSelectorView_dieInitialValue, 1));
        setButtonDrawable(R.drawable.bg_die_checkbox);
        setChecked(false);
    }
    
    public void setIsAttacker(boolean isAttacker) {
        this.isAttacker = isAttacker;
        
        updateBackgroundResource();
    }
    
    public void setDieValue(int dieValue) {
        this.dieValue = dieValue;
        
        updateBackgroundResource();
    }
    
    private void updateBackgroundResource() {
        setBackgroundResource(getBackgroundResource(dieValue, isAttacker));
    }
    
    private int getBackgroundResource(int dieValue, boolean isAttacker) {
        int[] bgResources = isAttacker ? attackerDieBgResources : defenderDieBgResources;
        
        if(dieValue < 1) return bgResources[0];
        if(dieValue > 6) return bgResources[5];
        
        return bgResources[dieValue-1];
    }

}
