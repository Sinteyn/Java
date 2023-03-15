package org.example.Lessons.lesson2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(pow(scan.nextDouble(), scan.nextInt()));
        scan.close();
    }


    private static double pow(double x, int y)
    {
        if(y < 0)
        {
            return 1 / (x * pow(x, -y - 1));
        }
        if(y == 0)
        {
            return 1;
        }
        return x * pow(x, y - 1);
    }
}
