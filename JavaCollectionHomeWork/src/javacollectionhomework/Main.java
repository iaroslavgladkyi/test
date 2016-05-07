/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionhomework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author gaffs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList
        List<Integer> list1 = new ArrayList<>();
        //LinkedList
        List<Integer> list2 = new LinkedList<>();

        System.out.println("Size of collection #1 (ArrayList): " + list1.size());
        System.out.println("Size of collection #2 (LinkedList): " + list2.size());

        //Add 10 000 elements to ArrayList
        int listSize = 10000;
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            list1.add((int) (Math.random() * 10));
        }
        long spendTime1 = System.nanoTime() - startTime1;
        System.out.println(spendTime1);

        //Add 10 000 elements to LinkedList
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            list2.add((int) (Math.random() * 10));
        }
        long spendTime2 = System.nanoTime() - startTime2;
        System.out.println(spendTime2);

        System.out.println("Size of collection #1 (ArrayList): " + list1.size());
        System.out.println("Size of collection #2 (LinkedList): " + list2.size());

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            list1.get(i);
        }
        long spendTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Speed of getting the ArrayList's (10 000 el) value without output: " + spendTime3 + " ms");

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            list2.get(i);
        }
        long spendTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("Speed of getting the LinkedList's (10 000 el) value without output: " + spendTime4 + " ms");

        if (spendTime3 < spendTime4) {
            System.out.println("The ArrayList is faster");
        } else {
            System.out.println("The LinkedList is faster");
        }

        ListIterator iterator;
        long startTime5 = System.currentTimeMillis();
        for (iterator = list1.listIterator(); iterator.hasNext();) {
            iterator.next();
            iterator.remove();
        }
        long spendTime5 = System.currentTimeMillis() - startTime5;
        System.out.println("Speed of removing the ArrayList's (10 000 el): " + spendTime5 + " ms");

        iterator = list2.listIterator();
        long startTime6 = System.currentTimeMillis();
        for (iterator = list2.listIterator(); iterator.hasNext();) {
            iterator.next();
            iterator.remove();
        }
        long spendTime6 = System.currentTimeMillis() - startTime6;
        System.out.println("Speed of removing the LinkedList's (10 000 el): " + spendTime6 + " ms");

        if (spendTime5 < spendTime6) {
            System.out.println("The ArrayList is faster");
        } else {
            System.out.println("The LinkedList is faster");
        }

        System.out.println("Size of collection #1 (ArrayList): " + list1.size());
        System.out.println("Size of collection #2 (LinkedList): " + list2.size());

    }

}
