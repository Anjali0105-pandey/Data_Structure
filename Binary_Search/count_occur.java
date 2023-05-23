import java.util.*;
public class count_occur {
    public static int countOcur(int arr[],int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
          arr[i]=sc.nextInt(); 
        }
        System.out.println("Enter the target : ");
        int target =sc.nextInt();

        int count=countOcur(arr,target);
        System.out.println("target "+target+" occurs "+count+" times.");
    }
}
