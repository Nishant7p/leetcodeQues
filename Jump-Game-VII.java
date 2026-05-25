1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n = s.length();
4
5        if(s.charAt(n - 1) == '1'){
6            return false;
7        }
8
9        int[] vis = new int[n];
10        vis[0] = 1;
11
12        int far = 0;
13
14        for(int i = 0; i < n; i++){
15            if(vis[i] == 1){
16                int l = Math.max(i + minJump, far + 1);
17                int h = Math.min(i + maxJump, n - 1);
18
19                for(int j = l; j <= h; j++){
20                    if(s.charAt(j) == '0'){
21                        vis[j] = 1;
22
23                        if(j == n - 1){
24                            return true;
25                        }
26                    }
27                }
28
29                far = Math.max(far, h);
30            }
31        }
32
33        return vis[n - 1] == 1;
34    }
35}