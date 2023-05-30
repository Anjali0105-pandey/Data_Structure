
public class Tiling_prblm {
    public static int getWays(int n){
        //Base Case
        if(n<=3)
            return n;
        else
            return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("For "+i+" board, no of ways : "+getWays(i));
        }
        
    }
}
