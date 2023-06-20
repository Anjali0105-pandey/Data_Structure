/*
 * 
 * Recurrence Relation : T(n/2)+n
 * Time Complexity : O(nlogn)
 * Space Complexity : O(n)
 * Outplace : Takes extra space for sorting-the two subarrays
 */
public class mergeSort {
    public static void printArr(int arr[], int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge(int arr[], int l, int mid,int r){
        int i,j,k;
        int n1=mid-l+1; //left sub array
        int n2=r-mid;   //right sub array
        int lsubarr[]=new int[n1];
        int rsubarr[]=new int[n2];

        //copy data from left and right subarray
        for (i = 0; i<n1; i++) {
            lsubarr[i]=arr[l+i];
        }

        for (j = 0; j<n2; j++) {
            rsubarr[j]=arr[mid+1+j];
        }

        i=0;j=0;k=l;

        //comparison between left and right subarray
        while(i<n1 && j<n2){
            if(lsubarr[i]<=rsubarr[j]){
                arr[k]=lsubarr[i];
                i++;
            }
            else{
                arr[k]=rsubarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=lsubarr[i];
            i++;k++;
        }

         while(j<n2){
            arr[k]=rsubarr[j];
            j++;k++;
        }
    }

    public static void merge_Sort(int arr[],int l,int r){
        if(l<r){
            //1.Divide array into subproblems
            int mid=l+(r-l)/2;
            //2.Conquer subarray using recursion
            //left subarray
            merge_Sort(arr, l, mid);

            //right subarray
            merge_Sort(arr, mid+1, r);

            //combine solution
            merge(arr, l, mid, r);
            
        }
    }

    public static void main(String[] args) {
        int arr[]={50,20,40,90,88,11,13,19,27};
        int n=arr.length;

        System.out.println("Before Sorting : ");
        printArr(arr, n);

        merge_Sort(arr, 0, n-1);

        System.out.println("\nAfter Sorting : ");
        printArr(arr, n);
    }
}
