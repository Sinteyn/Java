package org.example.Homework.Homework1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        System.out.println(reverseWords(scan.nextLine()));
        scan.close();
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitSentense = s.split(" ");
        int len = splitSentense.length;

        for (int i = len - 1; i > 0; i--) {
            if (!splitSentense[i].equals("")) {
                result.append(splitSentense[i]).append(" ");
            }

        }
        result.append(splitSentense[0]);
        return result.toString();
    }
}
