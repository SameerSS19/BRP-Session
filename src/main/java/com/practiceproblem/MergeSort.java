package com.practiceproblem;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr1 = new int[] {50, 22, 15, 40, 65, 75};
        int[] arr2 = new int[] {60, 45, 10, 20, 35, 56};
        System.out.println("1st Array = "+Arrays.toString(arr1));
        System.out.println("2nd Array = "+Arrays.toString(arr2));
        int count1 = arr1.length;
        int count2 = arr2.length;
        int [] resArr = new int[count1 + count2];
        int i=0, j=0, k=0;
        while (i < arr1.length) {
            resArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            resArr[k] = arr2[j];
            j++;
            k++;
        }
        Arrays.sort(resArr);
        System.out.println("Sorted Merged Array = "+Arrays.toString(resArr));
    }
}
