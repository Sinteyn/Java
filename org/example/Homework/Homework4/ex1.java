package org.example.Homework.Homework4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        int size = enterNumIntPositive("Введите кол-во чисел в строке");
        fillDequeRandom(list, size);
        System.out.println("Сгенерированный список : " + list);
        System.out.println("Перевернутый список : " + reverseDeque(list));
    }

    public static Integer enterNumIntPositive(String massage) {
        Scanner scan = new Scanner(System.in);

        System.out.println(massage);
        String value = scan.nextLine();
        while (value.isEmpty() || !isParsable(value) || Integer.parseInt(value) <= 0) {
            System.out.println("Неккоректный ввод.");
            System.out.println(massage);
            value = scan.nextLine();
        }
        scan.close();
        return Integer.parseInt(value);
    }

    public static boolean isParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static void fillDequeRandom(Deque<Integer> deque, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            deque.add(random.nextInt(0, 11));
        }
    }

    public static Deque<Integer> reverseDeque(Deque<Integer> deque) {
        int size = deque.size();
        Deque<Integer> reversedeque = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            reversedeque.add(deque.pollLast());
        }
        return reversedeque;
    }
}
