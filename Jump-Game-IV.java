1class Solution {
2    public int minJumps(int[] arr) {
3        ArrayList<HashSet<Integer>> adj = new ArrayList<>();
4        int n = arr.length;
5
6        for(int i = 0; i < n; i++){
7            adj.add(new HashSet<>());
8        }
9
10        for(int i = 0; i < n; i++){
11            if(i == 0){
12                if(i + 1 < n){
13                    adj.get(i).add(i + 1);
14                }
15            }
16            else if(i == n - 1){
17                if(i - 1 >= 0){
18                    adj.get(i).add(i - 1);
19                }
20            }
21            else{
22                adj.get(i).add(i + 1);
23                adj.get(i).add(i - 1);
24            }
25        }
26
27        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
28
29        for(int i = 0; i < n; i++){
30            if(map.containsKey(arr[i])){
31                map.get(arr[i]).add(i);
32            }
33            else{
34                ArrayList<Integer> lis = new ArrayList<>();
35                lis.add(i);
36                map.put(arr[i], lis);
37            }
38        }
39
40        int[] vis = new int[n];
41        Queue<int[]> q = new LinkedList<>();
42
43        q.add(new int[]{0, 0});
44        vis[0] = 1;
45
46        while(!q.isEmpty()){
47            int[] x = q.remove();
48            int u = x[0];
49            int d = x[1];
50
51            if(u == n - 1){
52                return d;
53            }
54
55            for(int v : adj.get(u)){
56                if(vis[v] == 0){
57                    vis[v] = 1;
58                    q.add(new int[]{v, d + 1});
59                }
60            }
61
62            if(map.containsKey(arr[u])){
63                for(int v : map.get(arr[u])){
64                    if(vis[v] == 0){
65                        vis[v] = 1;
66                        q.add(new int[]{v, d + 1});
67                    }
68                }
69
70                map.remove(arr[u]);
71            }
72        }
73
74        return -1;
75    }
76}