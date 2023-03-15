package org.example.Homework.Homework2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во чисел в последовательности");
        int size = scanner.nextInt();
        int[] nums = EnterArray(size);
        System.out.println(isArrIncreasing(nums));

        scanner.close();
    }

    public static int[] EnterArray(int size) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите число и нажмите Enter");
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }

    public static Boolean isArrIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
