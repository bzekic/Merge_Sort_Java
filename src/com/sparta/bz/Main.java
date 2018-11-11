package com.sparta.bz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayToSort = {5,6,74,53,8,21};
        Merger sorter = new Merger();
        int[] sortedArray = sorter.mergeSort(arrayToSort);
        System.out.println(Arrays.toString(sortedArray));
    }
}
