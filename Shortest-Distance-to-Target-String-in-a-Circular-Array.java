1class Solution {
2    public int closestTarget(String[] words, String target, int s) {
3        int n = words.length;
4        int ans = Integer.MAX_VALUE;
5
6        for(int i = 0; i < n; i++){
7            if(target.equals(words[i])){
8                int c1 = (i - s + n) % n;
9                int c2 = (s - i + n) % n;
10                ans = Math.min(ans, Math.min(c1, c2));
11            }
12        }
13
14        if(ans == Integer.MAX_VALUE){
15            return -1;
16        }
17
18        return ans;
19    }
20}