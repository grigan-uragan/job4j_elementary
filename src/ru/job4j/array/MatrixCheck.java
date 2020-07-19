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

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        char[] diagonal = extractDiagonal(board);
        int point = -1;
        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] == 'X') {
                point = i;
            }
        }
        if (point >= 0) {
            return monoHorizontal(board, point) || monoVertical(board, point);
        } else {
            return false;
        }
    }
}
