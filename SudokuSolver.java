public class SudokuSolver {
    

    static int[][] board = {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};

    public static boolean isValid(int[][] board, int row, int col, int num) {
    // Check row
    for (int j = 0; j < 9; j++) {
        if (board[row][j] == num) {
            return false;
        }
    }

    // Check column
    for (int i = 0; i < 9; i++) {
        if (board[i][col] == num) {
            return false;
        }
    }

    // Check 3x3 grid
    int startRow = (row / 3) * 3;
    int startCol = (col / 3) * 3;
    for (int i = startRow; i < startRow + 3; i++) {
        for (int j = startCol; j < startCol + 3; j++) {
            if (board[i][j] == num) {
                return false;
            }
        }
    }
    return true;
}
public static boolean solve(int[][] board) {

    for (int row = 0; row < 9; row++) {
        for (int col = 0; col < 9; col++) {

            // find empty cell
            if (board[row][col] == 0) {

                // try 1 to 9
                for (int num = 1; num <= 9; num++) {

                    if (isValid(board, row, col, num)) {
                        board[row][col] = num; // place number

                        // continue solving
                        if (solve(board)) {
                            return true;
                        }
                        // undo - backtrack
                        board[row][col] = 0;
                    }
                }
                // no number fits, return false
                return false;
            }
        }
    }
    return true; // solved
}
public static void printBoard(int[][] board) {

    for (int row = 0; row < 9; row++) {
        for (int col = 0; col < 9; col++) {
            System.out.print(board[row][col] + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        if (solve(board)) {
          System.out.println("Solved Sudoku:");
          printBoard(board);
        } else {
           System.out.println("No solution exists.");
        }   
    }
}
