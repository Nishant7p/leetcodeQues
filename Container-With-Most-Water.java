1class Solution {
2    public int maxArea(int[] arr) {
3        int n=arr.length;
4        int l=0;
5        int r=n-1;
6        int max=0;
7        while(l<r){
8            int a=arr[l];
9            int b=arr[r];
10            int h=Math.min(a,b);
11            int br=r-l;
12            int ar=h*br;
13            max=Math.max(ar,max);
14            if(arr[l]<arr[r]){
15                l++;
16            }
17            else{
18                r--;
19            }
20
21        }
22
23
24        return max;
25
26      
27        
28    }
29}