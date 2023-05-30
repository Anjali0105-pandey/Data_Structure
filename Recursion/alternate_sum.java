import java.util.*;

public class alternate_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0,sum1=0,sum2=0;
        System.out.println("Enter n:");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum1-=i;
            } else {
                sum2+=i;
            }
        }
        sum=sum1+sum2;
        System.out.println("The total sum is:" +sum );
    }
}
