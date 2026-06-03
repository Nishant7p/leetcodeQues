1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5       
6        Set<List<Integer>> set=new HashSet();
7        for(int i=0;i<n;i++){
8            int a=nums[i];
9            int l=i+1;
10            int r=n-1;
11            while(l<r){
12                int b=nums[l];
13                int c=nums[r];
14                int sum=b+c+a;
15                if(sum==0){
16                    ArrayList<Integer> arr=new ArrayList<>();
17                    arr.add(a);
18                    arr.add(b);
19                    arr.add(c);
20                    set.add(arr);
21                    r--;
22                    l++;
23                }
24                else if(sum<0){
25                    l++;
26                }
27                else{
28                    r--;
29                }
30            }
31
32        }
33
34
35
36
37
38
39
40
41        return new ArrayList<>(set);
42
43    }
44
45}