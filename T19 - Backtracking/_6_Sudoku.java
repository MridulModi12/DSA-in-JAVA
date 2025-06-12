public class _6_Sudoku {
  public static boolean SudokuSolver(int sudoku[][], int row, int col) {
    //base case
    if(row == 9) {
      return true;
    }

    int nextRow = row, nextCol = col+1;
    if(col+1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }

    if(sudoku[row][col] != 0) {
      return SudokuSolver(sudoku, nextRow, nextCol);
    }

    for(int digit=1; digit<=9; digit++) {
      if(isSafe(sudoku, row, col, digit)) {
        sudoku[row][col] = digit;
        if(SudokuSolver(sudoku, nextRow, nextCol)) {
          return true;
        }
        sudoku[row][col] = 0;
      }
    }
    return false;
  }

  public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
    //same row
    for(int j = 0; j < 9; j++) {
      if(sudoku[row][j] == digit) {
        return false;
      } 
    }
    //same col
    for(int i = 0; i < 9; i++) {
      if(sudoku[i][col] == digit) {
        return false;
      }
    }
    //same grid
    int startRow = (row/3) * 3;
    int startCol = (col/3) * 3;
    for(int i = startRow; i < startRow+3; i++) {
      for(int j = startCol; j < startCol+3; j++) {
        if(sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }

  public static void printSudoku(int sudoku[][]) {
    for(int i = 0; i < 9; i++) {
      if(i == 0) {
        System.out.print(" ");
        for(int k = 0; k < 8; k++)
          System.out.print("-- ");
        System.out.println();
      }
      for(int j = 0; j < 9; j++) {
        if(j == 0)
          System.out.print("| ");
        System.out.print(sudoku[i][j] + " ");
        if((j+1) % 3 == 0)
          System.out.print("| ");
      }
      System.out.println();
      if((i+1) % 3 == 0) {
        System.out.print(" ");
        for(int k = 0; k < 8; k++)
          System.out.print("-- ");
        System.out.println();
      }
    }
  }
  public static void main(String[] args) {
    int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
    {4, 9, 0, 1, 5, 7, 0, 0, 2},
    {0, 0, 3, 0, 0, 4, 1, 9, 0},
    {1, 8, 5, 0, 6, 0, 0, 2, 0},
    {0, 0, 0, 0, 2, 0, 0, 6, 0},
    {9, 6, 0, 4, 0, 5, 3, 0, 0},
    {0, 3, 0, 0, 7, 2, 0, 0, 4},
    {0, 4, 9, 0, 3, 0, 0, 5, 7},
    {8, 2, 7, 0, 0, 9, 0, 1, 3} };
    
    if(SudokuSolver(sudoku, 0, 0)) {
      System.out.println("Solution exists");
      System.out.println("Sudoku Board:-");
      printSudoku(sudoku);
    } else {
      System.out.println("Solution does not exists");
    }
  }
}