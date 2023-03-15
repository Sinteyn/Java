package org.example.Homework.Homework2;

import org.example.Homework.Homework2.model.Vector;

public class ex0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 4.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора = " + vector1.lenghtVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение с другим вектором" + vector1.vectorMulti(vector2));
        System.out.println("Угол между векторами (или косинус угла)" + vector1.cosVector(vector2));
        System.out.println("Сумма векторов = " + vector1.vectorSumm(vector2));
        System.out.println("Разность векторов = " + vector1.vectorDifference(vector2));
    }
}