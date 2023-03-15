package org.example.Lessons.lesson3.cw3;

import org.example.Lessons.lesson3.cw3.model.Cube;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube("Зеленый", 13, "Деревянный");
        Cube cube2 = new Cube("Желтый", 73, "Металлический");
        Cube cube3 = new Cube("Красный", 23, "Картонный");
        Cube cube4 = new Cube("Желтый", 3, "Металлический");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);

        int countColor = 0;
        int sumVolume = 0;
        int countMaterial = 0;

        for (Cube cub: listCube) {
            if(cub.getColor().equals("Желтый")){
                countColor++;
                sumVolume += volumeCube(cub.getSize());
            }
            if(cub.getMaterial().equals("Деревянный") && cub.getSize() == 3){
                countMaterial++;
            }
        }
        System.out.println(countColor);
        System.out.println(sumVolume);
        System.out.println(countMaterial);
    }

    private static int volumeCube(Integer size) {
        return size * size *size;
    }
}
