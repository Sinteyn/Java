package org.example.Homework.Homework3.ex2.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private Integer grade;
}
