1class RecentCounter {
2    Queue<Integer> q;
3
4    public RecentCounter() {
5        q=new LinkedList<>();
6        
7    }
8    
9    public int ping(int t) {
10        q.add(t);
11        while(q.peek()<t-3000){
12            q.remove();
13        }
14        return q.size();
15        
16    }
17}
18
19/**
20 * Your RecentCounter object will be instantiated and called as such:
21 * RecentCounter obj = new RecentCounter();
22 * int param_1 = obj.ping(t);
23 */