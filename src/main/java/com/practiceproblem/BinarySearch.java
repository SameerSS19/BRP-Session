package com.practiceproblem;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int counter,num,element,array[],first,last,middle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        num = sc.nextInt();

        array =new int[num];
        System.out.println("Enter the Elements ");
        for (counter=0;counter<num;counter++)
            array[counter] = sc.nextInt();
        System.out.println("Enter the search element:");
        element =sc.nextInt();
        first =0;
        last = num-1;
        middle = (first+last)/2;

        while (first<=last){
            if (array[middle]<element)
                first=middle-1;
            else if (array[middle] == element){
                System.out.println(element + " Found at index " + (middle+1)+"");
                break;
            }else {
                last =middle-1;
            }
            middle =(first+last)/2;
        }
        if (first>last)
            System.out.println(element+"Element not found");
    }
}
