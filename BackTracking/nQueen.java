public class nQueen {
    //print the matrix
    public static void print(int board[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    //is placing a queen at a position safe or not
    public static boolean isSafe(int board[][],int row,int col,int n){
        int i,j;
        //Check the left row
        for (i= 0; i <col;i++) {
            if(board[row][i]==1)
                return false;
        }

        //Check for upper diagonal in left direction
        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }

        //Check for lower diagonal in left direction
        for(i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]==1)
                return false;
        }
        return true;

    }
    public static boolean solveQueen(int board[][], int col,int n){
        //base case if all queen placed
        if(col>=n)
            return true;
        
        //consider this column and try to place all queens in all rows
        for (int i = 0; i < n; i++) {
            //check if safe then place
            if(isSafe(board, i, col, n))
            {
                    board[i][col]=1;

                //recursive call to place queen
                if(solveQueen(board, col+1, n))
                    return true;

                //if placingqueen does not lead to solution then backtrack
                board[i][col]=0;
            }
        }
        //if not possible to place queen in any row
        return false;
    }

    
    public static void main(String[] args) {
        int board[][]={{0,0,0,0},
                      {0,0,0,0},
                      {0,0,0,0},
                      {0,0,0,0}};
        
        if(solveQueen(board, 0, board.length)==true)
        {
            print(board, board.length);
        }
        else{
            System.out.println("No solution exists.");
        }
    }
}
