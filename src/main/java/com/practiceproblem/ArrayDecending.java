package com.practiceproblem;

import java.util.Scanner;

public class ArrayDecending {
    public static int getElementOfPartition(int inputArray[], int threshold) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] <= threshold) {
                count++;
            }
        }

        return count;
    }
    public static int[] traveseNShuffle(int inputArray[], int threshold) {

        int rightHalfStartIndex = getElementOfPartition(inputArray, threshold);
        int j = rightHalfStartIndex;
        int temp;
        for (int i = 0; i < getElementOfPartition(inputArray, threshold); i++) {

            System.out.println("i:" + i);
            if (inputArray[i] > threshold) {

                while (j < inputArray.length) {
                    System.out.println("j:" + j);
                    if (inputArray[j] < threshold) {
                        temp = inputArray[i];
                        inputArray[i] = inputArray[j];
                        inputArray[j] = temp;
                        break;
                    }
                    j++;
                }

            }
        }
        return inputArray;
    }
    public static int[] sortInDesc(int inputArray[], int start, int end) {
        int temp;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (inputArray[i] < inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrayLength,threshold;
        System.out.println("Enter the array length:");
        arrayLength = sc.nextInt();
        int[] inputArray = new int[arrayLength];
        for (int i=0; i<arrayLength; i++){
            System.out.println("Enter the array element:"+(i+1));
            inputArray[i]=sc.nextInt();
        }
        System.out.println("Enter the Threshold value :");
        threshold = sc.nextInt();

       System.out.println("Element Left half: "+(getElementOfPartition(inputArray,threshold)-1));
       System.out.println("Element Right half: " + (getElementOfPartition(inputArray,threshold)+";"+(arrayLength -1)));

       inputArray =  traveseNShuffle(inputArray,threshold);
       sortInDesc(inputArray,getElementOfPartition(inputArray,threshold),arrayLength);

    }

}
