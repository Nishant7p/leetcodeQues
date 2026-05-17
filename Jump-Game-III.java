1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        Queue<Integer> q=new LinkedList<>();
4        int n=arr.length;
5        q.add(start);
6        int[] vis=new int[n];
7        while(!q.isEmpty()){
8            int c_i=q.remove();
9            if(arr[c_i]==0){
10                return true;
11            }
12
13            if(c_i+arr[c_i]<n&&vis[c_i+arr[c_i]]==0){
14                q.add(c_i+arr[c_i]);
15                vis[c_i+arr[c_i]]=1;
16
17
18            }
19             if(c_i-arr[c_i]>=0&&vis[c_i-arr[c_i]]==0){
20                q.add(c_i-arr[c_i]);
21                vis[c_i-arr[c_i]]=1;
22
23
24            }
25
26
27
28
29        }
30        return false;
31    }
32}