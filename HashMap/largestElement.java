import java.util.TreeMap;
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        TreeMap <Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],1);
        }
        System.out.println("Largest Element : "+map.lastEntry().getKey());
    }
}
