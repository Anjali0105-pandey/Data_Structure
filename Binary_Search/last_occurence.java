/*Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
not present return -1.
Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6
Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1*/



public class last_occurence {
    public static int lastOcur(int arr[],int target){
        int low=0,high=arr.length-1;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result= mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return result;
    }
    public static void main(String[] args) {
       // int arr[]={1,1,1,2,3,4,4,5,6,6,6,6};
       int arr[]={2,2,2,6,6,18,29,30,30};

       // int target=4;
       int target=15;
        int result=lastOcur(arr,target);
        if(result==0)
            System.out.println("Not present");
        else
            System.out.println(result);
    }
}
