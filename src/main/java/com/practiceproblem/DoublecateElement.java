package com.practiceproblem;

import java.util.*;

public class DoublecateElement {
    public static void main(String[] args) {
        String[] stringsArr = {"Avi","Sameer","Avi","Sairam"};
        String[] outArr = removeDuplicatesUsingSet(stringsArr);
        System.out.println("Original array");
        for(String i : stringsArr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("after removing");
        for( String i : outArr){
            System.out.print(i+" ");
        }
    }

    public static String[] removeDuplicatesUsingSet(String[] input){
        // Adding array elements to a list
        List<String> tempList = new ArrayList<>();
        for(String i : input){
            tempList.add(i);
        }
        // creating a set using list
        Set<String> set = new HashSet<>(tempList);
        String[] output = new String[set.size()];
        String[] arrOut = new String[output.length];
        set.toArray(output);
        int j =0;
        for(String i : output){
            arrOut[j++] = i;
        }
        return arrOut;
    }
}
