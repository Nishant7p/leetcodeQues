class Solution {
     public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = arr[s.charAt(i) - 'a'] + 1;
        }

        int odd_mid = -1;
        if (s.length() % 2 == 1) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] % 2 == 1) {
                    odd_mid = i; 
                    arr[i]--;    
                    break;      
                }
            }
        }

        char[] ans = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / 2;
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                ans[j] = (char) ('a' + i);
                ans[ans.length - j - 1] = (char) ('a' + i);
                j++;
                arr[i]--;
            }
        }

        if (odd_mid != -1) {
            ans[ans.length / 2] = (char) ('a' + odd_mid); 
        }

        return new String(ans);
    }
}