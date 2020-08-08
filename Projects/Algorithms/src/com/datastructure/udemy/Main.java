package com.datastructure.udemy;

import com.datastructure.udemy.sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        MergeSort method = new MergeSort();
        int[] x = method.sort(new int[] {2,3,9,7,4,1}, 0, 5);
        System.out.println("\nAfter" + method);
        printNumbers(x);
    }

    public static int getItself(int itself, int dummy)
    {
        return itself;
    }


    public static void printNumbers(int[] a)
    {
        for (int i :a) {
            System.out.print(i + "\t");
        }
    }
}
