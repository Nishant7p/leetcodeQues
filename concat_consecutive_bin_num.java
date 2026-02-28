class Solution {
    public int concatenatedBinary(int n) {
        long mod = 1000000007;
        long val = 0;
        int i = 1;

        while (i <= n) {

            String s = Integer.toBinaryString(i);

            for (int j = 0; j < s.length(); j++) {
                val = (val * 2) % mod;

                if (s.charAt(j) == '1') {
                    val = (val + 1) % mod;
                }
            }

            i++;
        }

        return (int) val;
    }
}
