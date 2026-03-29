1class Solution {
2    public int[] findArray(int[] arr) {
3        int n=arr.length;
4        
5        for(int i=n-1;i>0;i--){
6            arr[i]=arr[i]^arr[i-1];
7
8        }
9        return arr;
10        
11    }
12}