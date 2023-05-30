import java.util.*;
public class count_Stairs {
    public static int fib(int n){
        //Base Case
        int res=0;
        if(n==0 || n==1)
            return n;
        else{
            res=fib(n-1)+fib(n-2);
            
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int result=0;
        //functionn calling
        result=fib(n+1);
        System.out.println("No. of ways to go "+n+" steps: "+result);
        
    }
}
