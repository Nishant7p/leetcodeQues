1class Solution {
2    public int pivotIndex(int[] nums) {
3        
4        int[] left=new int[nums.length];
5        int[] right=new int[nums.length];
6        int temp=0;
7        int ans=0;
8        left[0]=0;
9        for(int i=1;i<nums.length;i++){
10            left[i]=left[i-1]+nums[i-1];
11        }
12        right[nums.length-1]=0;
13        for(int i=nums.length-2;i>=0;i--){
14            right[i]=right[i+1]+nums[i+1];
15        }
16        for(int i=0;i<nums.length;i++){
17            if(left[i]==right[i]){
18                return i;
19            }
20        }
21        return -1;
22    }
23}