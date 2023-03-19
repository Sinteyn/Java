package org.example.Homework.Homework4;

import java.util.Map;
import java.util.Stack;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> check = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (check.containsKey(s.charAt(i))) stack.add(s.charAt(i));
            else {
                if (stack.size() == 0) return false;
                char k = stack.pop();
                if (s.charAt(i) != check.get(k)) return false;
            }
        }
        return stack.isEmpty();
    }
}
