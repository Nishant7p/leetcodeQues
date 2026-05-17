1class Solution {
2    public int helper(int[] nums,int s,int e){
3      
4        if(s==e){
5            return nums[e];
6        }
7        int mid=(s+e)/2;
8        int a_l=helper(nums,s,mid);//left maj
9        int a_r=helper(nums,mid+1,e);//right maj
10
11        if(a_l==a_r){
12            return a_l;
13        }
14        else{
15            int c=0;
16
17            for(int i=s;i<=e;i++){
18                if(nums[i]==a_l){
19                    c++;
20                }
21                else if(nums[i]==a_r){
22                    c--;
23                
24                }
25
26            }
27            if(c>0){
28                return a_l;
29            }
30            else{
31                return a_r;
32            }
33        }
34
35
36
37
38
39
40
41       
42    }
43    
44    public int majorityElement(int[] nums) {
45        return helper(nums,0,nums.length-1);
46        
47        
48    }
49}