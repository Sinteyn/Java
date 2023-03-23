package org.example.Lessons.lesson6.ex4.model;

public class Kelvin implements Converter{
    @Override
    public Double converValue(Double value) {
        return value + 273.15 ;
    }
}
