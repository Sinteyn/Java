package org.example.Lessons.lesson3.cw4;

import org.example.Lessons.lesson3.cw3.model.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube("Зеленый", 13, "Деревянный");
        Cube cube2 = new Cube("Желтый", 73, "Металлический");
        Cube cube3 = new Cube("Красный", 23, "Картонный");
        Cube cube4 = new Cube("Желтый", 3, "Металлический");
        Cube cube5 = new Cube("Желтый", 3, "Металлический");
        Cube cube6 = new Cube("Желтый", 3, "Металлический");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);
        listCube.add(cube5);
        listCube.add(cube6);

        System.out.println("Коллекция : " + listCube);
        System.out.println("Уникальная коллекция : " + unicumCollection(listCube));
    }

    private static Collection<Cube> unicumCollection(List<Cube> listCube) {
        return new HashSet<>(listCube);
    }
}
