package org.example.Homework.Homework2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во чисел в последовательности");
        int size = scanner.nextInt();

        int[] nums = EnterArray(size);
        printArray(nums);
        replaceNegativeElements(nums);
        printArray(nums);
        ;

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

    public static void replaceNegativeElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 9 && array[i] < 100) || (array[i] > -100 && array[i] < -9)) {
                sum += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sum;
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}
