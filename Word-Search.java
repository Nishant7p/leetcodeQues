1class Solution {
2    public boolean dfs(char[][] board, String word, int i, int j, int index) {
3        if(index == word.length()) return true;
4
5        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length 
6           || board[i][j] != word.charAt(index)) {
7            return false;
8        }
9
10        char temp = board[i][j];
11        board[i][j] = '#';
12
13        boolean found = dfs(board, word, i+1, j, index+1) ||
14                        dfs(board, word, i-1, j, index+1) ||
15                        dfs(board, word, i, j+1, index+1) ||
16                        dfs(board, word, i, j-1, index+1);
17
18        board[i][j] = temp;
19
20        return found;
21    }
22
23    public boolean exist(char[][] board, String word) {
24        int rows = board.length;
25        int cols = board[0].length;
26
27        for(int i = 0; i < rows; i++) {
28            for(int j = 0; j < cols; j++) {
29                if(dfs(board, word, i, j, 0)) {
30                    return true;
31                }
32            }
33        }
34
35        return false;
36    }
37}