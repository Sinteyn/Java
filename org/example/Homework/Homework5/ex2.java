package org.example.Homework.Homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ex2 {
    public static void main(String[] args) {
        String word = "Турка";
        String text = "Турка курит трубку, курка клюёт крупку. Не кури турка трубку, не клюй курка крупку.";
        countNumberSearchWord(text, word);
    }

    public static void countNumberSearchWord(String text, String word) {
        word = word.toLowerCase();
        Map<String, Integer> counter = new HashMap<>(Map.of(word, 0));
        String[] resText = text.toLowerCase().split("[-.?!)_(,:— /']");
        for (String wd : resText) {
            if (!Objects.equals(wd, word)) continue;
            counter.put(wd, counter.get(wd) + 1);
        }
        System.out.printf("Слово \"%s\" встречается %d раз(а)", word, counter.get(word));

    }
}
