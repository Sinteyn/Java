package org.example.Homework.Homework5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        countNumOccurrencesWords("Россия идет вперед всей планеты. Планета — это не Россия.");
    }

    public static void countNumOccurrencesWords(String text){
        Map<String, Integer> counter = new HashMap<>();
        String[] resText = text.toLowerCase().split("[-.?!)_(,:— /']");
        for (String str:resText) {
            if(str == "") continue;
            counter.putIfAbsent(str, 0);
            counter.put(str, counter.get(str) + 1);
        }
        for (Map.Entry<String, Integer> entry: counter.entrySet())
            System.out.println("Слово \"" + entry.getKey() +
                    "\", встречается --> " + entry.getValue() + " раз(а)");
    }
}
