package org.example.Lessons.lesson6;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
        Set<Integer> unicNums = new HashSet<>(nums);
        System.out.println(unicNums.size()* 100 / nums.size());
    }
}
