package com.datastructure.udemy.sorting;

import static com.datastructure.udemy.Main.getItself;
import static com.datastructure.udemy.Main.printNumbers;

public class BubbleSort {

    public int[] sort(int[] x) {

        printNumbers(x);

        int i,n=x.length;
        int j;

        for(i = 0 ; i < n-1 ; i++)
        {
            for(j = 0 ; j < n-1-i ; j++)
            {
                if(x[j] > x[j+1]) x[j] = getItself(x[j+1],x[j+1]=x[j]);
            }
        }
        return x;
    }
}
