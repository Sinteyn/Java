package org.example.Homework.Homework3.ex2;

import org.example.Homework.Homework3.ex2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Product product1 = new Product("qwe", "ewq", 12.4, 0.8, 1);
        Product product2 = new Product("wer", "rew", 0.4, 0.2, 2);
        Product product3 = new Product("ert", "tre", 15.4, 38.2, 3);
        Product product4 = new Product("rty", "ytr", 1.4, 0.2, 2);
        Product product5 = new Product("tyu", "uyt", 11.4, 0.4, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сорт");
        int givenGrade = scan.nextInt();
        scan.close();

        double minPrise = 0;

        for (Product product : productList) {
            if (product.getGrade().equals(givenGrade)) {
                minPrise = product.getPrice();
                break;
            }
        }

        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).getGrade().equals(givenGrade) && productList.get(i).getPrice() < minPrise) {
                minPrise = productList.get(i).getPrice();
            }
        }

        System.out.printf("Наименования товаров %d сорта с наименьшей ценой:%n", givenGrade);

        for (Product product : productList) {
            if (product.getGrade().equals(givenGrade) && product.getPrice().equals(minPrise)) {
                System.out.println(product.getName());
            }
        }
    }
}
