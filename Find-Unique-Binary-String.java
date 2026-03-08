1class Solution {
2    public int s_bin(String s){
3        int n=s.length();
4        int ans=0;
5        int i=0;
6        while(i<n){
7            char c=s.charAt(i);
8            if(c=='1'){
9                ans=ans+(int)Math.pow(2,n-i-1);
10
11            }
12            i++;
13           
14        }
15        return ans;
16    }
17    public String findDifferentBinaryString(String[] nums) {
18        HashSet<Integer> x=new HashSet<>();
19        int n=nums[0].length();
20        for(int i=0;i<nums.length;i++){
21            x.add(s_bin(nums[i]));
22           
23        }
24        StringBuilder sb=new StringBuilder();
25        for(int i=0;i<(int)Math.pow(2,n);i++){
26            if(x.contains(i)){
27                continue;
28            }
29            else{
30                String ans= Integer.toBinaryString(i);
31                while(ans.length()<n){
32                    ans="0"+ans;
33                }
34                return ans;
35
36            }
37        }
38
39
40        return Integer.toBinaryString((int)Math.pow(2,n));
41    }
42}