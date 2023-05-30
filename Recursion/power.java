import java.util.*;
public class power {
    public static int pow(int a,int b){
        //int res=0;
        if(b==1)
            return a;
        else
            return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int a=sc.nextInt();
        System.out.print("Enter the exponent : ");
        int b=sc.nextInt();

        int result=pow(a,b);
        System.out.println(a+"^"+b+" = "+result);
    }
}
