package org.example.Lessons.lesson4;

import java.util.Deque;
import java.util.LinkedList;

public class ex5 {
    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        Deque<String> solution = new LinkedList<>();
        String[] text = path.split("/");
        for (String s : text) {
            if (s.equals("") || s.equals(".")) continue;
            else if (s.equals("..")) {
                if (!solution.isEmpty()) solution.removeLast();
            } else {
                solution.add(s);
            }
        }

        return "/" + String.join("/", solution);
    }
}
