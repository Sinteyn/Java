package org.example.Lessons.lesson2;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 5, 7, 3, 9, 4, 2, 1}));
    }

    public static int solution(int[] array)
    {
        int count = 0;

        for(int i = 1; i < array.length; i++)
        {
            if(array[i - 1] == array[i] * 2)
            {
                count++;
            }
        }
        return count;
    }
}
