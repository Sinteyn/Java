package org.example.Lessons.lesson5;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        Object[] arr = new Object[]{"f", "a", 'a', 'a'};
        System.out.println(dublicates(arr));
    }
    public static boolean dublicates(Object[] array){
        Map<Object, Integer> dict = new HashMap<>();

        for (Object object: array) {
            if(dict.containsKey(object)) return false;
            dict.put(object, null);
        }
        return true;
    }
}
