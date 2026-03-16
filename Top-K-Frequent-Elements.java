1class Solution {
2    class Pair{
3        int a;
4        int b;
5        Pair(int a,int b){
6            this.a=a;
7            this.b=b;
8        }
9    }
10    public int[] topKFrequent(int[] nums, int k) {
11        HashMap<Integer , Integer> map=new HashMap();
12        for(int i:nums){
13            map.put(i,map.getOrDefault(i,0)+1);
14        }
15        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.a-b.a);
16        int i=0;
17        for(int key:map.keySet()){
18            if(i<k){
19            Pair p=new Pair(map.get(key),key);
20            pq.add(p);
21            }
22            else{
23                Pair p=new Pair(map.get(key),key);
24                pq.add(p);
25                pq.remove();
26
27            }
28            i++;
29
30        }
31        int[] ans=new int[k];
32        i=0;
33        while(!pq.isEmpty()){
34            ans[i]=pq.remove().b;
35            i++;
36
37        }
38       
39        return ans;
40        
41    }
42}
43