package com.practiceproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sequence {
    public static void main(String[] args) {
        LinkedList< String > list = new LinkedList<>();
        list.add("Sameer");
        list.add("Tushal");
        list.add("Dhiraj");
        list.add("Rishi");
        for (String name : list) {
            System.out.println(name);
        }
        list.add(0,"Sairam");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        list.remove("Rishi");
//        System.out.println(list);
    }
}
