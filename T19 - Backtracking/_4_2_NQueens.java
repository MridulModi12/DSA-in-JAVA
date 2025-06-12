public class _4_2_NQueens {
  static int count = 1;
  public static boolean isSafe(char board[][], int row, int col) {
    //vertically up
    for(int i=row-1; i>=0; i--) {
      if(board[i][col] == 'Q') {
        return false;
      }
    }
    //left diagonal upwards
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }
    //right diagonal upwards
    for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static void nQueens(char board[][], int row) {
    //base case
    if(row == board.length) {
      printBoard(board);
      return;
    }

    for(int j=0; j<board.length; j++) { //we get one config of board with each loop
      if(isSafe(board, row, j)) {
        board[row][j] = 'Q';
        nQueens(board, row+1); //recursion step to fill remaining rows
        board[row][j] = 'X';  //backtracking step(removing the queen of already printed config of board)
      }
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("----------- chess board "+(count++)+" ------------");
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];
    //initialize
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board.length; j++) {
        board[i][j] = 'X';
      }
    }
    nQueens(board, 0);
    System.out.println("\nTotal no. of solutions = " + (count-1));
  }
}