1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n=nums.length;
4        int[] left=new int[n];
5        int[] right=new int[n];
6        int temp1=0;
7        int temp2=0;
8        int j=n-1;
9        for(int i=0;i<n;i++){
10            left[i]=temp1;
11            temp1=temp1+nums[i];
12            right[j]=temp2;
13            temp2=temp2+nums[j];
14            j--;
15
16        }
17
18        for(int i=0;i<n;i++){
19            right[i]=Math.abs(right[i]-left[i]);
20        }
21        return right;
22        
23    }
24}