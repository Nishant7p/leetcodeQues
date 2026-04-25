1class Solution {
2    public boolean validDigit(int n, int x) {
3        int original = n;
4
5        while (n >= 10) {
6            n = n / 10;
7        }
8
9        if (n == x) {
10            return false;
11        }
12
13        n = original;
14
15        while (n > 0) {
16            if (n % 10 == x) {
17                return true;
18            }
19            n = n / 10;
20        }
21
22        return false;
23    }
24}