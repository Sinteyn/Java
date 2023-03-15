package org.example.Lessons.lesson2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(summ());

    }

    public static int summ() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = scan.nextInt();
        int lastnum = scan.nextInt();
        for (int i = 0; i < num - 1; i++) {
            int currentNum = scan.nextInt();
            if (currentNum % 10 == 5 && lastnum % 2 == 0) {
                sum += currentNum;
            }
            lastnum = currentNum;
        }
        scan.close();
        return sum;
    }

}
