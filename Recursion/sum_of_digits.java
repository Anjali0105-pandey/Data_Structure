
public class sum_of_digits {
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        else{
            return n%10+sum(n/10);

        }
    }
    public static void main(String[] args) {
        int n =56;
        System.out.println(sum(n));
    }
}
