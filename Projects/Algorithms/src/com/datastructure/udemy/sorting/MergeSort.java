package com.datastructure.udemy.sorting;

public class MergeSort {

    public int[] sort(int[] x, int l, int h) {
        int m = (l+h)/2;
        if(l < h){
            sort(x,l,m);
            sort(x,m+1,h);
            merge(x,l,m,h);
        }
        return x;
    }

    private void merge(int[] x, int l, int m, int h) {
        int i = l;
        int k = l;
        int j = m+1;
        int y[] = new int[x.length];
        while(i <= m-1 && j <= h)
        {
            if(x[i] < x[j]){
                y[k++] = x[i++];
            }
            if(x[j] < x[i]){
                y[k++] = x[j++];
            }
        }

        while(i <= m-1){
            y[k++] = x[i++];
        }

        while(j <= h){
            y[k++] = x[j++];
        }

        for(int t = 0 ; t<x.length ; t++)
        {
            x[t] = y[t];
        }

        return;
    }
}
