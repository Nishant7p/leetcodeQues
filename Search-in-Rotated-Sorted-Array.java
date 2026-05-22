1class Solution {
2     public int binS(int[] arr,int target,int start,int end){
3        int mid=0;
4
5       while (start<=end){
6           mid=start+(end-start)/2;
7
8        if(target==arr[mid]){
9            return mid;
10        }
11        if(arr[mid]>target){
12            end=mid-1;
13        }
14        else {
15            start=mid+1;
16        }
17        }
18       return -1;
19
20    }
21
22
23    public int search(int[] nums, int target) {
24        int start=0;
25        int end=nums.length-1;
26        int mid=0;
27        int p_i=0;
28        while(start<=end){
29            mid=start+(end-start)/2;
30            if(mid+1<nums.length&&mid-1>=0&&nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
31                p_i=mid;
32                break;
33            }
34            else if(nums[start]>nums[mid]){
35                end=mid-1;}
36            else{
37                start=mid+1;
38            }
39
40            
41            }
42            System.out.println(p_i);
43            if(binS(nums,target,0,p_i)!=-1){
44                return binS(nums,target,0,p_i);
45            }
46            return binS(nums,target,p_i+1,nums.length-1);
47            
48        }
49    }
50