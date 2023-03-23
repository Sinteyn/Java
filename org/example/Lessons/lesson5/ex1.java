package org.example.Lessons.lesson5;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        Map<Character, Integer> dict = new HashMap<>();
        String str = "gggggyyyyttt";
        for (int i = 0; i < str.length(); i++){
            dict.putIfAbsent(str.charAt(i), 0);
            dict.put(str.charAt(i), dict.get(str.charAt(i)) + 1);
        }
        System.out.println(dict);
    }
}
