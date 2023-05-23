//package Sorting;

public class desc_selection {
    public static void selectionSort(int arr[]){
        int j;
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for(j=i+1;j<arr.length;j++) {
                    if(arr[j]>arr[min_idx])
                        min_idx=j;
            }
            if(min_idx!=i){
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,34,19,45,-21,-55,23,55};
        //function calling
        selectionSort(arr);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
