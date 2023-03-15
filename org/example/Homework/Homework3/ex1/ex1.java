package org.example.Homework.Homework3.ex1;

import org.example.Homework.Homework3.ex1.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        Item item1 = new Item("qwe высший", 12.3, 1);
        Item item2 = new Item("wer высший", 13.1, 2);
        Item item3 = new Item("ert высший", 100.3, 3);
        Item item4 = new Item("rty", 10.2, 1);
        Item item5 = new Item("tyu высший", 5.0, 2);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

        double maxPrice = 0.0;

        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().contains("высший")
                    && (itemList.get(i).getGrade().equals(1)
                    || itemList.get(i).getGrade().equals(2))
                    && itemList.get(i).getPrice() > maxPrice) {
                maxPrice = itemList.get(i).getPrice();
            }
        }
        System.out.println("Наибольшая цена товара 1го или 2го сорта среди товаров, название которых содержит «высший» = " + maxPrice);
    }
}
