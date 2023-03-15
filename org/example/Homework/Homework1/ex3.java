package org.example.Homework.Homework1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(sumOfBinaryNums());

    }

    public static String sumOfBinaryNums() {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Введите первое двоичное число");
        String a = scan.nextLine();

        System.out.println("Введите второе двоичное число");
        String b = scan.nextLine();

        scan.close();

        int difflen = searchDiffLen(a, b);

        if (difflen != 0) {
            if (a.length() < b.length()) {
                a = IncreasingStringLength(a, difflen);
            } else {
                b = IncreasingStringLength(b, difflen);
            }
        }

        int len = a.length();
        int discharge = 0;

        char one = '1';

        for (int i = len - 1; i >= 0; i--) {

            if (a.charAt(i) == one && b.charAt(i) == one) {

                if (discharge == 1) {
                    sb.append(1);
                    discharge = 1;
                } else {
                    sb.append(0);
                    discharge = 1;
                }
            } else if (a.charAt(i) == one || b.charAt(i) == one) {
                if (discharge == 1) {
                    sb.append(0);
                    discharge = 1;
                } else {
                    sb.append(1);
                    discharge = 0;
                }
            } else {
                if (discharge == 1) {
                    sb.append(1);
                    discharge = 0;
                } else {
                    sb.append(0);
                    discharge = 0;
                }
            }
        }
        if (discharge == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static String IncreasingStringLength(String str, int difflen) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < difflen; i++) {
            sb.append(0);
        }

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static int searchDiffLen(String strOne, String strTwo) {
        if (strOne.length() - strTwo.length() < 0) {
            return (strOne.length() - strTwo.length()) * -1;
        }
        return strOne.length() - strTwo.length();
    }
}
