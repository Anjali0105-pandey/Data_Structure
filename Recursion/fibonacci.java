import java.util.*;
public class fibonacci {
    public static int fib(int n){
        //Base Case
        int res=0;
        if(n<=1)
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
        result=fib(n);
        System.out.println("The sum of fibonacci till "+n+"th element is : "+result);
        System.out.println("The fibonacci series is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+ " ");
        }
    }
}
