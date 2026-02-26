import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int ans = 0;
        
        BigInteger num = new BigInteger(s, 2);
        BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        
        while (!num.equals(one)) {
            if (num.mod(two).equals(one)) {
                num = num.add(one);
            } else {
                num = num.divide(two);
            }
            ans++;
        }
        
        return ans;
    }
}
