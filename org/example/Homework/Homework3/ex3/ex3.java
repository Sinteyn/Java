package org.example.Homework.Homework3.ex3;

import org.example.Homework.Homework3.ex3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Девушка с татуировкой дракона", "Ларссон", 569.5, 2005, 653);
        Book book2 = new Book("Исчезнувшая", "Флинн", 370.9, 2013, 541);
        Book book3 = new Book("Думай медленно… Решай быстро", "Канеман", 279.0, 2011, 331);
        Book book4 = new Book("Sapiens. Краткая история человечества", "Харари", 399.0, 2011, 881);
        Book book5 = new Book("История твоей жизни", "Чан", 270.9, 2002, 331);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);


        for (Book book : bookList) {
            if (book.getAuthor().toUpperCase().contains("А")
                    && book.getYear() >= 2010
                    && primeNumberTest(book.getPages())) {
                System.out.println(book.getName());
            }
        }
    }

    public static Boolean primeNumberTest(int pages) {
        if (pages == 1 || pages == 0) return false;
        for (int i = 2; i * i <= pages; i++) {
            if (pages % i == 0) return false;
        }
        return true;
    }
}
