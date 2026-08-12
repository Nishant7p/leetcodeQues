class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, int[]> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int max = 0;

        while (r < nums.length) {
            int curr = nums[r];

            if (!map.containsKey(curr)) {
                map.put(curr, new int[]{r, 1});
            } else {
                int[] curr_data = map.get(curr);
                curr_data[1]++;
            }

            if (map.get(curr)[1] > k) {
                while (nums[l] != curr) {
                    int[] data = map.get(nums[l]);
                    data[1]--;

                    if (data[1] == 0) {
                        map.remove(nums[l]);
                    } else {
                        data[0] = l + 1;
                    }

                    l++;
                }

                int[] data = map.get(curr);
                data[1]--;
                data[0] = l + 1;
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}