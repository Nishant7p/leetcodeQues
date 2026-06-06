1class Solution {
2    public void nextPermutation(int[] nums) {
3       int n=nums.length;
4       int b_i=-1;
5       for(int i=0;i<n-1;i++){
6        if(nums[i]<nums[i+1]){
7            b_i=i;
8
9        }
10       }
11       
12       if(b_i==-1){
13        Arrays.sort(nums);
14        return;
15
16       }
17       int p_v=nums[b_i];
18       int rep_v=Integer.MAX_VALUE;
19       int rep_i=0;
20
21       for(int i=b_i+1;i<n;i++){
22        if(nums[i]>p_v){
23            if(nums[i]<rep_v){
24                rep_v=nums[i];
25                rep_i=i;
26            }
27            
28        }
29       }
30       int t=nums[b_i];
31       nums[b_i]=nums[rep_i];
32       nums[rep_i]=t;
33
34       Arrays.sort(nums,b_i+1,n);
35      
36
37
38
39
40
41       return;
42       
43
44       
45
46    }
47}