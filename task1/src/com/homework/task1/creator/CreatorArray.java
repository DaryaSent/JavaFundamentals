package com.homework.task1.creator;

import java.util.Random;

public class CreatorArray {
    public int[] create(int masSize, int min, int max){
            int masiveSize=masSize;
            int minVal=min;
            int maxminVal=max;
            Random rand=new Random();
            int randmass[]=rand.ints(masiveSize,minVal,maxminVal).toArray();

            return randmass;
        }
}
