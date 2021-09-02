package com.practiceproblem;

import java.util.Arrays;

public class LongestPrefixElement {
    public static void main(String args[]) {
        String[] arr = {"flower", "flow", "fly"};
        int size = arr.length;

        if (size == 0){
            System.out.println("Longest common prefix: ");
        }

        else if (size == 1){
            System.out.println("Longest common prefix: " + arr[0]);
        }
        else{

            Arrays.sort(arr);
            int length = arr[0].length();
            StringBuilder res = new StringBuilder();

            for(int i = 0; i < length; i++){
                if(arr[0].charAt(i) == arr[size - 1].charAt(i)){
                    res.append(arr[0].charAt(i));
                }
                else{
                    break;
                }
            }
            String result = res.toString();
            System.out.println("Longest common prefix: " + result);
        }
    }
}
