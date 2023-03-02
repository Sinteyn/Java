package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(substractProductAndSum(243));

    }

    public static int substractProductAndSum(int n){
        if (n % 10 == 0)
            return n;
        return n % 10 + substractProductAndSum(n/10);
    }
}