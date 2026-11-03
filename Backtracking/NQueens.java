// Basic code no attack will consider

 public class Nqueens {

    public static void NQueens(char board[][],int row){

        if( row == board.length){
           
            PrintBoard(board);
            return;
        }
        for(int j = 0; j<board.length; j++){
            board[row][j] = 'Q';
            NQueens(board, row+1);
            board[row][j] = '.';
        }
    }

    public static void PrintBoard(char board[][]){
        System.out.println("--------Chess Board---------");
        for(int i =0 ;i<board.length; i++){
            for(int j =0 ;j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 2;
        char board[][] = new char[n][n];

        for(int i =0 ;i<board.length; i++){
            for(int j =0 ;j<board.length; j++){
                board[i][j] = '.';
            }
        }
        NQueens(board, 0);
    }
}
