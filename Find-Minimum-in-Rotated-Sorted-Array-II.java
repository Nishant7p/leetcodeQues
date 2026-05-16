1class Solution {
2    public int findMin(int[] nums) {
3        int start=0;
4        int end=nums.length-1;
5        int mid=0;
6        int p_i=-1;
7       
8        while(start<end){
9            mid=start+(end-start)/2;
10            if(mid+1<nums.length&&nums[mid]>nums[mid+1]){
11                p_i=mid;
12                break;
13            }
14            if(mid-1>=0&&nums[mid]<nums[mid-1]){
15                p_i=mid-1;
16                break;
17            }
18            else if(nums[start]==nums[mid]&& nums[end]==nums[mid]){
19                if(nums[start]>nums[start+1]){
20                    p_i=start;
21                    break;
22                }
23                if(nums[end]<nums[end-1]){
24                    p_i=end-1;
25                    break;
26                }
27            
28                    end--;
29                    start++;
30                
31            }
32            else if(nums[start]<=nums[mid]){
33                start=mid+1;
34            }
35            else{
36               end=mid-1;
37            }
38
39        }
40if(p_i==-1){
41    return nums[0];
42
43}
44else{
45    return nums[p_i+1];
46}
47
48
49        
50    }
51}