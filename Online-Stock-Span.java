1class StockSpanner {
2    ArrayList<Integer> st;
3
4
5    public StockSpanner() {
6        st=new ArrayList();
7        
8    }
9    
10    public int next(int price) {
11        if(st.size()==0){
12            st.add(price);
13            return 1;
14        }
15        int ans=0;
16        st.add(price);
17        int r=st.size()-1;
18        while(r>=0){
19            int val=st.get(r);
20            if(val>price){
21                break;
22            }
23            ans++;
24            r--;
25           
26        }
27
28
29        return ans;
30        
31    }
32}
33
34/**
35 * Your StockSpanner object will be instantiated and called as such:
36 * StockSpanner obj = new StockSpanner();
37 * int param_1 = obj.next(price);
38 */