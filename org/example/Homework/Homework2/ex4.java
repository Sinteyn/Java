package org.example.Homework.Homework2;

public class ex4 {
    public static void main(String[] args) {

        char[][] board = {

                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },

                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },

                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },

                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },

                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },

                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },

                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },

                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },

                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println("Validete:" + isValidSudoku(board));
    }

    private static Boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
            }
        }
        return null;
    }
}