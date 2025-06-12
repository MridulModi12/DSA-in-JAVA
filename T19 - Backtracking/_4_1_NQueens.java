public class _4_1_NQueens {
  public static void nQueens(char board[][], int row) {
    //base case
    if(row == board.length) {
      printBoard(board);
      return;
    }
    for(int i = 0; i < board[0].length; i++) { //we get one config of board with each loop
      board[row][i] = 'Q';
      nQueens(board, row+1); //recursion step to fill remaining rows
      board[row][i] = 'X';  //backtracking step(removing the queen of already printed config of board)
    }
  }
  public static void printBoard(char board[][]) {
    System.out.println("-----------chess board------------");
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    char board[][] = new char[2][2];
    //initialize
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++) {
        board[i][j] = 'X';
      }
    }
    nQueens(board, 0);
  }
}