1class Solution {
2    public List<List<Integer>> findMatrix(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        List<List<Integer>> ans=new ArrayList<>();
5
6        int max=1;
7        for(int i:nums){
8            if(map.containsKey(i)){
9                max=Math.max(map.get(i)+1,max);
10                map.put(i,map.get(i)+1);
11            }
12            else{
13                map.put(i,1);
14            }
15        }
16        int i=0;
17        while(i!=max){
18            ans.add(new ArrayList<>());
19       for(int k:map.keySet()){
20        int f=map.get(k);
21        if(f>0){
22            ans.get(i).add(k);
23            map.put(k,f-1);
24        }
25        else{
26            
27        }
28
29
30
31       }
32       i++;
33        }
34        return ans;
35
36        
37    }
38}