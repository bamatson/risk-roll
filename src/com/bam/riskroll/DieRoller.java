package com.bam.riskroll;

import java.util.Random;

public class DieRoller {
    
    private static Random roller = new Random();
    private static final int DIE_MAX = 6;
    
    public static int roll() {
        return roller.nextInt(DIE_MAX)+1;
    }
    
}
