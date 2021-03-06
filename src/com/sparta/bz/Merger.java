package com.sparta.bz;

import java.util.Arrays;

public class Merger {

    public int[] mergeSort(int[] arrayToSort) {
        if (arrayToSort.length == 1) {
            return arrayToSort;
        }

        int[] leftArray = Arrays.copyOfRange(arrayToSort,0, arrayToSort.length/2);
        int[] rightArray = Arrays.copyOfRange(arrayToSort, arrayToSort.length/2, arrayToSort.length);
        int[] newLeftArray = mergeSort(leftArray);
        int[] newRightArray = mergeSort(rightArray);
        return merge(newLeftArray, newRightArray);
    }

    private int[] merge(int[] firstArray, int[] secondArray) {
        int leftLength = firstArray.length;
        int rightLength = secondArray.length;
        int[] combinedArray = new int[leftLength + rightLength];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < leftLength + rightLength; i++) {
            if (leftIndex == firstArray.length) {
                combinedArray[i] = secondArray[rightIndex];
                rightIndex++;
            } else if (rightIndex == firstArray.length) {
                combinedArray[i] = firstArray[leftIndex];
                leftIndex++;
            } else if (firstArray[leftIndex] >= secondArray[rightIndex]) {
                combinedArray[i] = secondArray[rightIndex];
                rightIndex++;
            } else if (firstArray[leftIndex] <= secondArray[rightIndex]) {
                combinedArray[i] = firstArray[leftIndex];
                leftIndex++;
            }
        }
        return combinedArray;
    }
}

