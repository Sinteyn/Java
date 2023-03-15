package org.example.Homework.Homework3.ex1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private Double price;
    private Integer grade;
}
