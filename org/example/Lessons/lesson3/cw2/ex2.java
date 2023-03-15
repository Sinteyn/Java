package org.example.Lessons.lesson3.cw2;

import org.example.Lessons.lesson3.cw2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 237, List.of(6, 4, 5));
        Student student2 = new Student("Машков", 3, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 234, List.of(3, 4, 5));
        Student student4 = new Student("ИМихин", 5, 234, List.of(3, 4, 5));

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (Student el : studentList) {
            double sum = 0;
            for (double mark: el.getMarks()) {
                sum += mark;
            }
            if(el.getSurName().endsWith("ова") && sum % 2 == 0){
                System.out.println(el.getMoney());
            }
        }
    }
}
