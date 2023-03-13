package Homework.Homework2;

import java.util.ArrayList;
import java.util.List;

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

    public static Boolean isValidSudoku(char[][] board) {
        List<Character> cell = new ArrayList<Character>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (cell.contains(board[i][j]))
                    return false;
                cell.add(board[i][j]);
            }
            cell.clear();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == '.')
                    continue;
                if (cell.contains(board[j][i]))
                    return false;
                cell.add(board[j][i]);
            }
            cell.clear();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[3 * i + k][3 * j + l] == '.')
                            continue;
                        if (cell.contains(board[3 * i + k][3 * j + l]))
                            return false;
                        cell.add(board[3 * i + k][3 * j + l]);
                    }
                }
                cell.clear();
            }
        }
        return true;
    }
}
