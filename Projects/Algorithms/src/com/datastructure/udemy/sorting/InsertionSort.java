package com.datastructure.udemy.sorting;

import static com.datastructure.udemy.Main.printNumbers;

public class InsertionSort {

    public int[] sort(int[] x){
        printNumbers(x);

        int i,j;
        int temp;
        int n = x.length;
        for(i = 1 ; i<n ; i++)
        {
            j = i-1;
            temp = x[i];
//            for (j = i;  j-1>=0 ; j--) {
//                if(x[j-1] > temp)
//                {
//                    x[j] = x[j-1];
//                }
//                else
//                {
//                    break;
//                }
//            }
            while(j>=0 && x[j] > temp)
            {
                x[j+1] = x[j];
                j--;
            }
            x[j+1]=temp;
        }

        return x;
    }
}
