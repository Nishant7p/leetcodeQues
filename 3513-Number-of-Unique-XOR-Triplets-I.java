

class Solution {
    public int uniqueXorTriplets(int[] nums) {
         int n = nums.length;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int x = n + 1;
            x--;
            x |= x >> 1;
            x |= x >> 2;
            x |= x >> 4;
            x |= x >> 8;
            x |= x >> 16;
            x++;
            return x;
        }
    }
}