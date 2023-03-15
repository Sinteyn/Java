package org.example.Lessons.lesson2;
import org.example.Lessons.lesson2.model.Vector;


public class ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector(1.0,4.0,1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длинна вектора = " +vector1.lenghtVector());
        System.out.println("скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println(vector1.vectorMulti(vector2));
        System.out.println(vector1.cosVector(vector2));
    }
}
