//package Sorting;

public class desc_bubble {
    public static void bubbleSort(int arr[]){
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                //for every iteration we get biggest element at last no comparison for that
                if(arr[j]<arr[j+1]){
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,21,13,24,45,67,82,56};

        //function call
        bubbleSort(arr);
        System.out.println("Sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
