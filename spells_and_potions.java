class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] arr = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            int index = potions.length;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long x = (long) spells[i] * potions[mid];

                if (x >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            arr[i] = potions.length - index;
        }

        return arr;
    }
}
