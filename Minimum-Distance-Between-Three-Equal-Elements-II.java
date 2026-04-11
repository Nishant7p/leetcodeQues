1
2class Solution {
3    public int minimumDistance(int[] nums) { 
4        int n = nums.length;
5        int ans = Integer.MAX_VALUE;
6
7        HashMap<Integer, int[]> map = new HashMap<>();
8
9        for(int i = 0; i < n; i++){
10
11            if(!map.containsKey(nums[i])){
12                map.put(nums[i], new int[]{-1, -1});
13            }
14
15            int[] arr = map.get(nums[i]);
16
17            if(arr[1] != -1){
18                int s = 2 * (i - arr[1]);
19                ans = Math.min(ans, s);
20            }
21
22            arr[1] = arr[0];
23            arr[0] = i;
24        }
25
26        if(ans == Integer.MAX_VALUE){
27            return -1;
28        }
29        return ans;
30    }
31}