1class Solution {
2    public void sortColors(int[] nums) {
3        int c_0=0;
4        int c_1=0;
5        int c_2=0;
6
7        for(int i:nums){
8            if(i==0){
9                c_0++;
10            }else if(i==1){
11                c_1++;
12            }
13            else{
14                c_2++;
15            }
16        }
17        
18        int n=nums.length;
19        for(int i=0;i<c_0;i++){
20            nums[i]=0;
21
22        }
23        for(int i=0;i<c_1;i++){
24            nums[i+c_0]=1;
25        }
26        for(int i=0;i<c_2;i++){
27            nums[i+c_1+c_0]=2;
28        }
29
30       
31        
32
33        
34    }
35}