//hum sirf right jaa sakte hai and down jaa sakte hai
/* if n x m matrix hai toh jabtak i=n-1 and j=m-1 na hojaye tab 1 hi option bachega
_______
|_|_|_|
|_|_|_|
|_|_|_|

*/

public class maze {
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m)
            return 0;
        if(i==n-1 || j==m-1)
            return 1;
        //move downwards
        int downPaths=countPaths(i+1,j,n,m);

        //move right
        int rightPaths=countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalPaths=countPaths(0,0,n,m);
        System.out.println(totalPaths);
        
    }
}
