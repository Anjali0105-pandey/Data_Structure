/*Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No */
// Java program to determine whether the number is
// Armstrong number or not
class armstrong {
    /* Function to calculate x raised to the
       power y */
    int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
 
    /* Function to calculate order of the number */
    int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
 
    // Function to check whether the given number is
    // Armstrong number or not
    boolean isArmstrong(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
 
        // If satisfies Armstrong condition
        return (sum == x);
    }
 
    // Driver Program
    public static void main(String[] args)
    {
        armstrong ob = new armstrong();
        int x = 153;
        System.out.println(ob.isArmstrong(x));
        x = 1253;
        System.out.println(ob.isArmstrong(x));
    }
}