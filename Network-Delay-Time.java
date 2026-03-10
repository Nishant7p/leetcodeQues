1class Solution {
2    public class Pair implements Comparable<Pair>{
3    public int first;
4    public int second;
5    public Pair(int first,int second){
6        this.first=first;
7        this.second=second;
8    }
9    @Override
10    public int compareTo(Pair other) {
11        return Integer.compare(this.first, other.first); // Min-heap based on distance
12    }
13}
14
15       public int networkDelayTime(int[][] times, int n, int k) {
16        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
17        for (int i = 0; i <= n; i++) {
18            adj.add(new ArrayList<>());
19
20
21        }
22        for (int i = 0; i < times.length ; i++) {
23            adj.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
24        }
25        int[] distance=new int[n+1];
26        for (int i=1;i<=n;i++){
27            distance[i]=Integer.MAX_VALUE;
28
29        }
30        distance[k]=0;
31        PriorityQueue<Pair> PQ=new PriorityQueue<>();
32        PQ.add(new Pair(0,k));
33        while (!PQ.isEmpty()){
34            Pair curr=PQ.remove();
35            int u=curr.second;
36            int dist=curr.first;
37
38
39            for (Pair p: adj.get(u)){
40                int v=p.first;
41                int weigh= p.second;
42
43                if(weigh+dist<distance[v]){
44                    distance[v]=weigh+dist;
45                    PQ.add(new Pair(distance[v],v));
46                }
47
48
49
50
51
52            }
53
54
55
56
57
58
59
60
61        }
62        int max=Integer.MIN_VALUE;
63
64        for (int i = 1; i <=n ; i++) {
65            if(distance[i]==Integer.MAX_VALUE){
66                return -1;
67            }
68            else{
69                if (distance[i]>max){
70                    max=distance[i];
71                }
72            }
73            
74
75        }
76        return max;
77        
78        
79    }
80}