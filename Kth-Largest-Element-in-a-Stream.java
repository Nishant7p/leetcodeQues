1class KthLargest {
2
3    int k;
4    PriorityQueue<Integer> pq;
5
6    public KthLargest(int k, int[] nums) {
7
8        this.k = k;
9        pq = new PriorityQueue<>();
10
11        for(int i = 0; i < nums.length; i++){
12            pq.add(nums[i]);
13
14            if(pq.size() > k){
15                pq.poll();
16            }
17        }
18    }
19
20    public int add(int val) {
21
22        pq.add(val);
23
24        if(pq.size() > k){
25            pq.poll();
26        }
27
28        return pq.peek();
29    }
30}
31
32/**
33 * Your KthLargest object will be instantiated and called as such:
34 * KthLargest obj = new KthLargest(k, nums);
35 * int param_1 = obj.add(val);
36 */