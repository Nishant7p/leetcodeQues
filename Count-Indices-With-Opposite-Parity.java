1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n=nums.length;
4        int[] ans=new int[n];
5        int o=0;
6        int e=0;
7
8
9
10        for(int i=n-1;i>=0;i--){
11            if(nums[i]%2==0){
12                e++;
13                ans[i]=o;
14            }
15            else{
16                o++;
17                ans[i]=e;
18            }
19
20        }
21        return ans;
22        
23    }
24}