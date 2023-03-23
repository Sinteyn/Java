package org.example.Lessons.lesson6.ex4.model;

public class Fahrenheit implements Converter{
    @Override
    public Double converValue(Double value) {
        return value*1.8+32;
    }
}
