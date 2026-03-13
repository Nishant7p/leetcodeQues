1class SmallestInfiniteSet {
2    int[] nums=new int[1001];
3    PriorityQueue<Integer> pq;
4
5    public SmallestInfiniteSet() {
6        pq=new PriorityQueue();
7        
8        for(int i=1;i<=1000;i++){
9            pq.add(i);
10            nums[i]=1;
11        }
12    }
13    
14    public int popSmallest() {
15        int ans=pq.remove();
16        nums[ans]=0;
17        
18        return ans;
19        
20    }
21    
22    public void addBack(int num) {
23        if(nums[num]==1){
24            return;
25        }
26        pq.add(num);
27        nums[num]=1;
28        
29    }
30}
31
32/**
33 * Your SmallestInfiniteSet object will be instantiated and called as such:
34 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
35 * int param_1 = obj.popSmallest();
36 * obj.addBack(num);
37 */