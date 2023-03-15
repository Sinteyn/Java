package org.example.Homework.Homework1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел, после которых идет отрицательное число --> " + sumOfNums());
    }

    public static int sumOfNums() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите одно число и нажмите Enter (для завершения ввода требуется ввести 0)");
        int num = scan.nextInt();
        int numRemember = 0;
        int sum = 0;

        while (num != 0) {
            numRemember = num;
            System.out.println("Введите одно число и нажмите Enter");
            num = scan.nextInt();

            if (num < 0) {
                sum += numRemember;
            }
        }
        scan.close();
        return sum;
    }
}
