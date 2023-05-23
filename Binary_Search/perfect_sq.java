public class perfect_sq {
    public static boolean perfectSq(int num){
        int low=0,high=num;
        
        boolean perfect_sq=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            int value=mid*mid;
            if(value==num){
                //perfect square
                perfect_sq=true;
                return perfect_sq;
                
            }
            else if(value<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return perfect_sq;
    }
    public static void main(String[] args) {
        
         int num=14;
        boolean result=perfectSq(num);
        System.out.println(result);
    }
}

