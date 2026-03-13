1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue();
4        for(int i=0;i<k;i++){
5            pq.add(nums[i]);
6        }
7        for(int i=k;i<nums.length;i++){
8            pq.add(nums[i]);
9            pq.remove();
10        }
11        return pq.peek();
12        
13    }
14}
15