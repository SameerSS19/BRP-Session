package com.practiceproblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestStringBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line = "";
        String longString = "";
        int max=0;
        while ((line = in.readLine()) != null) {
            if(line.length()>max){
                max=line.length();
                longString=line;
            }
        }
        System.out.println(longString);
    }
}
