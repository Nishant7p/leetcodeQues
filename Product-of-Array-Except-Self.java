1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] pre=new int[n];
5        int[] suff=new int[n];
6
7       int[] ans=new int[n];
8       pre[0]=1;
9       for(int i=1;i<n;i++){
10        pre[i]=nums[i-1]*pre[i-1];
11       }
12       suff[n-1]=1;
13       for(int i=n-2;i>=0;i--){
14
15        suff[i]=nums[i+1]*suff[i+1];
16
17       }
18       for(int i=0;i<n;i++){
19        ans[i]=pre[i]*suff[i];
20       }
21
22
23
24
25
26
27
28
29       return ans;
30        
31    }
32}