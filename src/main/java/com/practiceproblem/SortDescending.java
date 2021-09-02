package com.practiceproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortDecending {
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array:");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int n1 = size%2==0?(size/2):(size/2)+1;
        int n2 = size-n1;
        ArrayList<Integer> first=new ArrayList<>();
        ArrayList<Integer> second =new ArrayList<>();
        System.out.println("Enter the Element of Array:");
        for (int i=0;i<n1;i++)
            first.add(sc.nextInt());

        for (int i=0;i<n2;i++)
        second.add(sc.nextInt());
//        System.out.println("Choose the Element of Array:");
//        temp= sc.nextInt();
//        System.out.println(temp);


        Collections.sort(first,Collections.reverseOrder());
        Collections.sort(second,Collections.reverseOrder());

        for (int i=0;i<n1;i++)
            System.out.println(+first.get(i));

        for (int i=0;i<n2;i++)
            System.out.println(second.get(i));
}
}