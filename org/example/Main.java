package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(subtractProductAndSum(scanner.nextInt()));

    }

    public static int subtractProductAndSum(int n) {
        if (n / 10 == 0)
            return n;
        return (n % 10 * subtractProductAndSum(n / 10)) - (n % 10 + subtractProductAndSum(n / 10));
    }

}

//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.printf("result : %d",subtractProductAndSum(n));
//        }
//
//
//public static int subtractProductAndSum(int n) {
//        int multi = 1, sum = 0;
//        while (n != 0) {
//        sum += n % 10;
//        multi *= n % 10;
//        n /= 10;
//        }
//        return multi - sum;
//        }