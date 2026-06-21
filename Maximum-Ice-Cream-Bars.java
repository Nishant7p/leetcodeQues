1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int n=costs.length;
5        int ans=0;
6        
7        for(int i=0;i<n;i++){
8            if(costs[i]<=coins){
9                coins=coins-costs[i];
10                ans++;
11            }else{
12                break;
13
14            }
15        }
16        return ans;
17
18        
19    }
20}