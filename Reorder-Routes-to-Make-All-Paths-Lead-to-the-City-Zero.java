1class Solution {
2    public int minReorder(int n, int[][] connections) {
3        List<List<int[]>> graph = new ArrayList<>();
4        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
5
6        for(int[] e : connections){
7            int u = e[0], v = e[1];
8            graph.get(u).add(new int[]{v, 1}); // original direction
9            graph.get(v).add(new int[]{u, 0}); // reverse direction
10        }
11
12        boolean[] vis = new boolean[n];
13        return dfs(0, graph, vis);
14    }
15
16    private int dfs(int node, List<List<int[]>> graph, boolean[] vis){
17        vis[node] = true;
18        int changes = 0;
19
20        for(int[] nei : graph.get(node)){
21            int next = nei[0], cost = nei[1];
22            if(!vis[next]){
23                changes += cost + dfs(next, graph, vis);
24            }
25        }
26        return changes;
27    }
28}