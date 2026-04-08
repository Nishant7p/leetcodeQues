1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] arr) {
3        int mod=1000000007;
4        int n=nums.length;
5        int m=arr.length;
6
7        for(int i=0;i<m;i++){
8            int l=arr[i][0];
9            int r=arr[i][1];
10            int k=arr[i][2];
11            long v=arr[i][3];
12            for(int j=l;j<=r;j=j+k){
13                nums[j]=(int)((nums[j]*v)%mod);
14
15            }
16
17
18
19
20
21        }
22        int ans=0;
23        for(int i:nums){
24            ans=ans^i;
25        }
26
27
28
29        return ans;
30        
31    }
32}