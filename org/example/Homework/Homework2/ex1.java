package org.example.Homework.Homework2;

import java.util.Scanner;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        int size = enterIntValue("Введите кол-во чисел в последовательности");
        int[] nums = creatreArray(size);
        int[] minMax = enterMinMax();
        fillArrayRandom(nums, minMax);
        printArray(nums);
        System.out.println("Cумма простых чисел = " + summPrime(nums));
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fillArrayRandom(int[] arr, int[] minMax) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(minMax[0], minMax[1] + 1);
        }
    }

    public static int[] creatreArray(int size) {
        return new int[size];
    }

    public static int[] enterMinMax() {

        int[] minMax = creatreArray(2);

        minMax[0] = enterIntValue("Введите минимальное значение в последовательности");
        minMax[1] = enterIntValue("Введите максимальное значение в последовательности");

        while (minMax[0] > minMax[1]) {
            System.out.println("Неккоректный ввод");
            minMax[0] = enterIntValue("Введите минимальное значение в последовательности");
            minMax[1] = enterIntValue("Введите максимальное значение в последовательности");
        }
        return minMax;
    }

    public static int enterIntValue(String massage) {
        Scanner scan = new Scanner(System.in);

        System.out.println(massage);
        int num = scan.nextInt();

        return num;

    }

    public static int summPrime(int[] arr) {

        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                for (int j = 2; j * j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        arr[i] = 0;
                    }
                }
            }
        }

        for (int i : arr) {
            summ += i;
        }

        return summ;
    }
}
