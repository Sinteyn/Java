package org.example.Lessons.lesson4;

import java.util.Arrays;
import java.util.LinkedList;

public class ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(-8, 1, -9, 5, -7, 5, 1));


        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) < 0 ){
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }
}
