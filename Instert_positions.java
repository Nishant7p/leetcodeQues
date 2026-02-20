class Solution {
    public int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        double f=target-0.5;
        while (start<=end){
            mid=(end-start)/2 +start;
            if(arr[mid]>f){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
        
    }
}
