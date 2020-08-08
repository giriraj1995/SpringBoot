package com.datastructure.udemy.sorting;

import static com.datastructure.udemy.Main.getItself;
import static com.datastructure.udemy.Main.printNumbers;

public class SelectionSort {

    public int[] sort(int[] n) {

        printNumbers(n);

        int i=0,j=0,k=0;

        for(i = 0 ; i < n.length; i++)
        {
            k=i;
            for(j = i ; j<n.length;j++)
            {
                if(n[i] > n[j] && n[k]>n[j]) {
                    k = j;
                }
            }
            n[i] = getItself(n[k],n[k]=n[i]);
        }
        return n;
    }
}
