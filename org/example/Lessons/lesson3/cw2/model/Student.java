package org.example.Lessons.lesson3.cw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surName;
    private int groupName;
    private double money;
    private List<Integer> marks;
}
