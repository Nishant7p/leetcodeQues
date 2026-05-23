1class Solution {
2    public void sortColors(int[] nums) {
3        int n=nums.length;
4        int r=0;
5        int w=0;
6        int b=0;
7        for(int i:nums){
8            if(i==0){
9                r++;
10            }
11            else if(i==1){
12                w++;
13            }
14            else{
15                b++;
16            }
17        }
18        for(int i=0;i<r;i++){
19            nums[i]=0;
20        }
21        for(int i=0;i<w;i++){
22            nums[r+i]=1;
23        }
24        for(int i=0;i<b;i++){
25            nums[r+w+i]=2;
26        }
27
28        
29
30        
31    }
32}