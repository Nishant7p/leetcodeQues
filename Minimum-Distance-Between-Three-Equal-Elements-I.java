1class Solution {
2    public int minimumDistance(int[] nums) {
3        int n=nums.length;
4        int ans=Integer.MAX_VALUE;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                for(int k=j+1;k<n;k++){
8                    if(nums[i]==nums[j]&&nums[j]==nums[k]){
9                        int s=Math.abs(i-j)+Math.abs(i-k)+Math.abs(k-j);
10                        ans=Math.min(s,ans);
11                    }
12
13                }
14            }
15        }
16
17
18
19        if(ans==Integer.MAX_VALUE){
20            return -1;
21        }
22        return ans;
23    }
24}