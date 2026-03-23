1class Solution {
2    public int findMinArrowShots(int[][] points) {
3         Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
4        int ans=0;
5        int p=points[0][1];
6
7
8        for(int i=1;i<points.length;i++){
9            if(points[i][0]>p){
10                p=points[i][1];
11                ans++;}
12            // }else{
13            //     p=points[i][1];
14            // }
15
16        }
17
18
19
20        return ++ans;
21        
22    }
23}