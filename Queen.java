public class Queen {
 

    public static void isRun(String str,int ans){

    }
    public static void nQueen(char board[][],int row){
        if(row==board.length){

        }
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueen(board,row+1);
            board[row][j]='x'; 

        }
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("hii sandesh");

        
        int n=2;
         char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
                
            }System.out.println();
        }
        nQueen(board,0);

    }
}   

