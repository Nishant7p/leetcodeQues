class Solution {
    public int countBinarySubstrings(String s) {
        int total_ans = 0;
        int str_len = s.length();
        for (int i = 0; i < str_len; i++) {
            int x_count = 0;
            int y_count = 0;
            char initial_char = s.charAt(i);
            y_count++;
            int r_ptr = i + 1;
            int change_flag = 0;
            while (r_ptr < str_len) {
                if (s.charAt(r_ptr) == initial_char && change_flag == 0) {
                    y_count++;
                    r_ptr++;
                } else if (s.charAt(r_ptr) != initial_char) {
                    change_flag = 1;
                    x_count++;
                    r_ptr++;
                    if (x_count == y_count) {
                        total_ans++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return total_ans;
    }
}
