1class Solution {
2    public int BS(int[] s_arr, int s,int e,int tar){
3        if(s>e){
4            return -1;
5        }
6        int mid=s+(e-s)/2;
7
8        if(tar==s_arr[mid]){
9            return mid;
10        }
11        if(tar<s_arr[mid]){
12          
13            return BS(s_arr,s,mid-1,tar);
14        }
15        else{
16           
17            return BS(s_arr,mid+1,e,tar);
18        }
19
20    }
21
22
23    public int search(int[] nums, int target) {
24        int n=nums.length;
25        int s=0;
26        int e=n-1;
27        int p_i=0;
28        while(s<=e){
29            int mid=s+(e-s)/2;
30
31            if(((mid-1>=0)&&(mid+1<n))&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
32                p_i=mid;
33                break;
34            }
35            else if(nums[s]<=nums[mid]){
36                s=mid+1;
37            }
38            else if(nums[s]>nums[mid]){
39                e=mid-1;
40            }
41
42
43        }
44        int l_s=BS(nums,0,p_i,target);
45        int r_s=BS(nums,p_i+1,n-1,target);
46        return Math.max(l_s,r_s);
47
48       
49       
50       
51    }
52}
53