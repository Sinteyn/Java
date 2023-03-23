package org.example.Lessons.lesson6;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x", "v"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "v"));
        Set<String> set = new HashSet<>(mas1);
        set.retainAll(mas2);
        mas1.addAll(mas2);
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : mas1) {
            if (set.contains(s)) {
                map.putIfAbsent(s, 0);
                map.put(s, map.get(s) + 1);
            }

        }
        System.out.println(map);
    }
}
