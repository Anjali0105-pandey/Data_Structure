import java.util.*;
public class duplicateInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of array : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        boolean duplicate=false;

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                duplicate=true;
                System.out.println("Yes");
                break;
            }
            map.put(arr[i],1);
        }
        if(duplicate==false)
            System.out.println("No");
    }
}
