1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
4        for(int i:stones){
5            pq.add(i);
6        }
7        while(pq.size()>1){
8            int x=pq.remove();
9            int y=pq.remove();
10            if(x==y){
11                continue;
12            }
13            else{
14                pq.add(x-y);
15            }
16        }
17        if(pq.size()==0){
18            return 0;
19        }
20        return pq.peek();
21        
22    }
23}
24