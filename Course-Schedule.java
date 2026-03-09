1class Solution {
2    int c=0;
3    public boolean dfs(int node,int[] vis,int[] vis1,ArrayList<ArrayList<Integer>> adj){
4        vis[node]=1;
5        vis1[node]=1;
6        for(int neigh:adj.get(node)){
7            if(vis[neigh]==0){
8                if(dfs(neigh,vis,vis1,adj)){
9                    return true;
10                }
11            }
12            if(vis[neigh]==1&&vis1[neigh]==1){
13                return true;
14            }
15        }
16        c++;
17        vis1[node]=0;
18        return false;
19    }
20    public boolean canFinish(int numCourses, int[][] prerequisites) {
21        int n=numCourses;
22        ArrayList<ArrayList    <Integer>> adj=new ArrayList<>();
23        for(int i=0;i<n;i++){
24            adj.add(new ArrayList());
25        }
26        int[] vis=new int[n];
27        int[] vis1=new int[n];
28        for(int i=0;i<prerequisites.length;i++){
29            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
30        }
31       
32        for(int i=0;i<n;i++){
33            if(vis[i]==0){
34                if(dfs(i,vis,vis1,adj)==true){
35                    return false;
36                }
37            }
38        }
39        return (c==n);
40        
41    }
42}