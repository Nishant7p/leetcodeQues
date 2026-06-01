1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int ans=0;
5        int n=cost.length;
6        if(n==0){
7            return 0;
8
9        }
10        if (n==1){
11            return cost[0];
12        }
13        if(n==2){
14            return cost[0]+cost[1];
15        }
16        int i=n-1;
17        while(i>0){
18            ans=ans+cost[i]+cost[i-1];
19            i--;
20            i--;
21            i--;
22
23        }
24        if(i==0){
25            ans=ans+cost[0];
26        }
27        return ans;
28    }
29}