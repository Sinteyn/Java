package org.example.Lessons.lesson4;

import java.util.LinkedList;

public class ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            nums.add(i);
        }

        int sum = 0;

        for (Integer num : nums) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 3 == 0){
                nums.set(i, sum);
            }
        }
        System.out.println(nums);
    }
}
