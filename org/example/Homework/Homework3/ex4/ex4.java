package org.example.Homework.Homework3.ex4;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int n = nums.length;
        int size = factorial(n);
        int[][] swapNums = new int[size][n];
        int[] control = new int[n + 1];

        for (int i = 0; i < control.length; i++) {
            control[i] = i;
        }

        System.arraycopy(nums, 0, swapNums[size - 1], 0, n);


        int i = 1;
        int j = 0;
        int k = -1;

        while (i < n) {
            control[i]--;
            k++;
            if (i % 2 != 0) j = control[i];
            else j = 0;
            swapElements(nums, j, i);
            i = 1;
            System.arraycopy(nums, 0, swapNums[k], 0, n);
            while (control[i] == 0) {
                control[i] = i;
                i++;
            }
        }

        System.out.println(Arrays.deepToString(swapNums));
    }


    public static void swapElements(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
