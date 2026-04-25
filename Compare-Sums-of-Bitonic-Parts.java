1class Solution {
2    public int compareBitonicSums(int[] nums) {
3        int n=nums.length;
4        int x=0;
5        int max=0;
6        for(int i=0;i<n;i++){
7            if(nums[i]>max){
8                max=nums[i];
9                x=i;
10            }
11
12        }
13        long y=0;
14        long z=0;
15        for(int i=0;i<=x;i++){
16            y=y+nums[i];
17        }
18
19        for(int i=x;i<n;i++){
20            z=z+nums[i];
21        }
22        if(y>z){
23            return 0;
24        }
25        if(z>y){
26            return 1;
27        }
28
29
30
31        return -1;
32        
33    }
34}