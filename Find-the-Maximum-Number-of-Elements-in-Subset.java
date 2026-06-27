1class Solution {
2    public int maximumLength(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7
8        int ans=1;
9
10        for(int x:nums){
11            if(x==1){
12                if(map.get(1)%2==1){
13                    ans=Math.max(ans,map.get(1));
14                }
15                else{
16                    ans=Math.max(ans,map.get(1)-1);
17                }
18            }
19            else{
20                int cnt=0;
21                if(map.get(x)>=2){
22                    long curr=x;
23                    while(curr<=Integer.MAX_VALUE &&map.containsKey((int) curr)){
24                        if(map.get((int)curr)==1){
25                            cnt++;
26                            break;
27                        }
28                        cnt++;
29                        if(curr>Long.MAX_VALUE/curr){
30                            break;
31                        }
32                        curr*=curr;
33                    }
34                }
35                ans=Math.max(ans,cnt*2-1);
36            }
37        }
38
39
40
41
42
43
44        return ans;
45        
46    }
47}