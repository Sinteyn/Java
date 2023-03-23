package org.example.Lessons.lesson6.ex4;

import org.example.Lessons.lesson6.ex4.model.Fahrenheit;
import org.example.Lessons.lesson6.ex4.model.Kelvin;

public class ex {
    public static void main(String[] args) {
        Double tCelsius = 100.0;
        Double tFahrenheit = new Fahrenheit().converValue(tCelsius);
        Double tKelvin = new Kelvin().converValue(tCelsius);

        System.out.println(tFahrenheit);
        System.out.println(tKelvin);
        System.out.println(tCelsius);
    }
}
