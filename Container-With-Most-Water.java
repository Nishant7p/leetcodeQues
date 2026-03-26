1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int max=0;
6
7        while(l<r){
8            int h_l=height[l];
9            int h_r=height[r];
10            int max_h=Math.min(h_l,h_r);
11            int area=max_h*(r-l);
12            max=Math.max(max,area);
13            if(h_l<h_r){
14                l++;
15            }else{
16                r--;
17            }
18
19
20
21
22
23
24
25        }
26        return max;
27        
28    }
29}