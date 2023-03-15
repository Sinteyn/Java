package org.example.Homework.Homework3.ex3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pages;
}
