package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                return false;
            }
        }
        return true;
    }
}