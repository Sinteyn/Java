package org.example.Lessons.lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            integerLinkedList.add(i);
        }
        System.out.println("peek = " + integerLinkedList.peek());
        System.out.println(integerLinkedList);
        System.out.println("pop = " + integerLinkedList.pop());
        System.out.println(integerLinkedList);
        integerLinkedList.addFirst(3);
        System.out.println("add first = " + integerLinkedList);
        integerLinkedList.addLast(7);
        System.out.println(integerLinkedList);
        integerLinkedList.remove(5);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.contains(2));
        integerLinkedList.remove((Integer)3);
        System.out.println(integerLinkedList);
    }
}
