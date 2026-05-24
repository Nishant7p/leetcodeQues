1class Solution {
2    public int help(int[] arr,int[] dp,int d,int i){
3        if(dp[i]!=-1){
4            return dp[i];
5        }
6        int ans=1;
7        int n=arr.length;
8        for(int j=i+1;j<=Math.min(n-1,i+d);j++){
9            if(arr[j]>=arr[i]){
10                break;
11
12            }
13            ans=Math.max(ans,1+help(arr,dp,d,j));
14
15
16        }
17         for(int j=i-1;j>=Math.max(0,i-d);j--){
18            if(arr[j]>=arr[i]){
19                break;
20
21            }
22            ans=Math.max(ans,1+help(arr,dp,d,j));
23
24
25        }
26        return dp[i]=ans;
27
28
29    }
30    public int maxJumps(int[] arr, int d) {
31        int n=arr.length;
32        int[] dp=new int[n];
33
34        for(int i=0;i<n;i++){
35            dp[i]=-1;
36        }
37        int ans=1;
38        for(int i=0;i<n;i++){
39            ans=Math.max(ans,help(arr,dp,d,i));
40        }
41        return ans;
42
43        
44        
45    }
46}