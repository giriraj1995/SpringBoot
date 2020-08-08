package com.datastructure.udemy.sorting;

import static com.datastructure.udemy.Main.getItself;

public class QuickSort {

    public int[] sort(int[] x, int i, int j){
        if (j > i) {
            int p = partition(x,i,j);
            sort(x, i, p);
            sort(x, p + 1, j);
        }
        return x;
    }

    private int partition(int[] x, int l, int h) {
        int i = l;
        int j = h;
        int pivot = x[i];
        do{

            do{
                i++;
            }while (x[i] <= pivot);

            do{
                j--;
            }while (x[j] > pivot);

            if(j > i){
                x[i] = getItself(x[j],x[j]=x[i]);
            }

        }while(j > i);
        x[l] = getItself(x[j],x[j]=x[l]);
        return j;
    }
}
