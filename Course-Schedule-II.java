1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<Integer>());
6
7
8        }
9        //add nodes
10        for (int i=0;i<prerequisites.length;i++){
11            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
12        }
13        
14        int[] vis=new int[numCourses];
15        int[] ind=new int[numCourses];
16
17        for(int i=0;i<numCourses;i++){
18            for(int neigh:adj.get(i)){
19                ind[neigh]++;
20            }
21        }
22        Queue<Integer> q=new  LinkedList<>();
23        ArrayList<Integer> ts=new ArrayList<>();
24        for(int i=0;i<numCourses;i++){
25            if(ind[i]==0){
26                q.add(i);
27            }
28        }
29
30        while(!q.isEmpty()){
31            int node=q.poll();
32            ts.add(node);
33            for(int i:adj.get(node)){
34                
35                if(vis[i]==0){
36                    ind[i]--;
37                    if(ind[i]==0){
38                        q.add(i);
39                    }
40
41                }
42            }
43
44
45        }
46        if(ts.size()!=numCourses){
47            return new int[]{};
48        }
49        int[] ans=new int[numCourses];
50        for(int i=0;i<numCourses;i++){
51            ans[i]=ts.get(i);
52        }
53        return ans;
54        
55
56
57    }
58        
59
60
61}