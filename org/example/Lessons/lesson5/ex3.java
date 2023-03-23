package org.example.Lessons.lesson5;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(translationRomanNum("LVIIX"));
    }
    public static Integer translationRomanNum(String num){
        Map<Character, Integer> dict = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int size = num.length() - 1;
        int res = 0;
        int temp = dict.get(num.charAt(size));
        for (int i = 0; i <= size; i++) {
            if(dict.get(num.charAt(size - i)) < temp){
                res-= dict.get(num.charAt(size - i));
            }
            else res+= dict.get(num.charAt(size - i));
            temp = dict.get(num.charAt(size - i));
        }
        return res;
    }
}
