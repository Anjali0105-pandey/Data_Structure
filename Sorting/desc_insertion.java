//package Sorting;

public class desc_insertion {
    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]>arr[j-1]) {
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;        
                
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,34,19,45,-21,-55,23,55};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
