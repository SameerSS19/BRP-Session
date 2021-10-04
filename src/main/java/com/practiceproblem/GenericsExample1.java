package com.practiceproblem;

public class GenericsExample1 {
    public <E> void printArray(E []s)
    {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
//    public <E> void printArray(E []s)
//    {
//        for (E x:s) {
//            System.out.println(x);
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
