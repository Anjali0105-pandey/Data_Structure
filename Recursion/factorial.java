
import java.util.*;
class factorial{
    public static int fact(int n){
        //Base Case
        int res=0;
        if(n==0 || n==1)
            return 1;
        else{
            res=(n*fact(n-1));
            
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int result=0;
        //functionn calling
        result=fact(n);
        System.out.println("The facorial of "+n+" is : "+result);
    }
}
