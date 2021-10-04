package com.practiceproblem;

public class GenericsExample {
    public <V>void printArray(V []s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
//    public void printArray(Integer []n){
//        for (int i = 0; i<n.length; i++) {
//            System.out.println(n[i]);
//        }
//    }
    public static void main(String[] args){
        GenericsExample gn = new GenericsExample();
        String names[]=new String[]{"Sameer","Avinas","Tushal"};
        Integer roll[]={12,34,45};
        gn.printArray(names);
        gn.printArray(roll);
    }
}
