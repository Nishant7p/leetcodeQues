1class Solution {
2    public  int jump(int[] nums) {
3        int min_s=0;
4        int max=0;
5        int temp=0;
6        int n=nums.length;
7        int c_e=0;
8        int[] arr=new int[n];
9        if(n==1){
10            return 0;
11        }
12        
13        for(int i=0;i<n;i++ ){
14
15            temp=i+nums[i];
16            if(temp>max){
17                max=temp;
18                
19            }
20            if(i==c_e){
21                min_s++;
22                c_e=max;
23
24            }
25
26            if(c_e>=n-1){
27                return min_s;
28            }
29
30
31
32
33
34        }
35        return min_s;
36
37    }
38}