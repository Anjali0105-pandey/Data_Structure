class ratInMaze{
    public static int countPaths(int maze[][],int n){

        //if source or destination is bocked
        if( maze[0][0] == -1 || maze[n-1][n-1] == -1)
            return 0;

        //initialize topmost column
        for (int i = 0; i < n; i++) {
            if(maze[i][0]==0)
                maze[i][0]=1;
            else//if there is blockage then break
                break;
        }

        //initialize topmost row
        for (int i = 1; i < n; i++) {
            if(maze[0][i]==0)
                maze[0][i]=1;
            else//if there is blockage then break
                break;
        }

        //if maze[i][j]==-1 then ignore otherwise compute recursively
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                //check for blockage
                if(maze[i][j]==-1)
                    continue;

                //if we can reach maze[i][j] from maze[i-1][j] then increment the count
                if(maze[i-1][j]>0)
                    maze[i][j]=maze[i][j]+maze[i-1][j];

                //if we can reach maze[i][j] from maze[i][j-1] then increment the count
                if(maze[i][j-1]>0)
                    maze[i][j]=maze[i][j]+maze[i][j-1];

            }
        }
        return maze[n-1][n-1];
    }
    public static void main(String[] args) {
        int maze[][]={{0,0,0,0},
                      {0,-1,0,0},
                      {-1,0,0,0},
                      {0,0,0,0}};
        System.out.println("Counts : "+countPaths(maze, maze.length));
    }
    
}
