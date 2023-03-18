class linear_Search{
    public static void main(String args[]) {
        int arr[]={12,34,11,8,-3,-156};
        int target=15;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr.length==0)
                return -1;
            if(arr[i]==target)
                return target;
        }
        return -1;
    }
}