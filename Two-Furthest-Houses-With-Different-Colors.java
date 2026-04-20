1class Solution {
2    public int maxDistance(int[] arr) {
3        int n=arr.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            if(arr[i]!=arr[n-1]){
7                ans=Math.max(ans,Math.abs(n-1-i));
8                break;
9            }
10        }
11
12
13        for(int i=n-1;i>=0;i--){
14            if(arr[i]!=arr[0]){
15                ans=Math.max(ans,Math.abs(i));
16                break;
17            }
18        }
19
20
21
22
23
24        return ans;
25
26        
27    }
28}