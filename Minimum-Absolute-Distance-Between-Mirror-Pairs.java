1class Solution {
2    public int reverse(int num){
3        //System.out.println("hi");
4        
5        
6        int rev=0;
7        int t=num;
8        int check=0;
9        while(t>0){
10             
11            int ld=t%10;
12            if(ld==0&&check==0){
13                t=t/10;
14                continue;
15            }
16            else{
17                check=1;
18                rev=rev*10+ld;
19                
20
21
22
23            }
24            t=t/10;
25
26        }
27        return rev;
28
29    }
30    public int minMirrorPairDistance(int[] nums) {
31        int n = nums.length;
32        int ans = Integer.MAX_VALUE;
33
34        HashMap<Integer,Integer> map = new HashMap<>();
35
36        for(int i = 0; i < n; i++){
37            if(map.containsKey(nums[i])){
38                ans = Math.min(ans, i - map.get(nums[i]));
39            }
40
41            int rev_value = reverse(nums[i]);
42            map.put(rev_value, i);
43        }
44
45        if(ans == Integer.MAX_VALUE){
46            return -1;
47        }
48
49        return ans;
50    }
51
52}