import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {

        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append("#");
            }
            String rowKey = sb.toString();
            map.put(rowKey, map.getOrDefault(rowKey, 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append("#");
            }
            String colKey = sb.toString();

            if (map.containsKey(colKey)) {
                count += map.get(colKey);
            }
        }

        return count;
    }
}
