//import java.util.ArrayList;
import java.util.*;
class printAllSequences {
    public static void printSequence(int arr[],int index, ArrayList<Integer> tempArr){
        //base case
        if(index==arr.length)
        {
            //print subsequence but not empty sequence
            if(tempArr.size()>0)
                System.out.println(tempArr);
            return;
        }
        //recursion 
        printSequence(arr, index+1, tempArr);
        //add value in tempArr
        tempArr.add(arr[index]);

        //do not include 
        printSequence(arr, index+1, tempArr);

        //remove last value
        tempArr.remove(tempArr.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println("All sequence : "+ Arrays.toString(arr));
        printSequence(arr, 0, new ArrayList<>());
    }
}
