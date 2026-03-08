1
2
3class MinStack {
4    ArrayList<Integer> arr;
5    int min = Integer.MAX_VALUE;
6
7    public MinStack() {
8        arr = new ArrayList<>();
9    }
10    
11    public void push(int val) {
12        arr.add(val);
13        if(val < min){
14            min = val;
15        }
16    }
17    
18    public void pop() {
19        int removed = arr.remove(arr.size() - 1);
20        
21        if(removed == min){
22            min = Integer.MAX_VALUE;
23            for(int x : arr){
24                min = Math.min(min, x);
25            }
26        }
27    }
28    
29    public int top() {
30        return arr.get(arr.size() - 1);
31    }
32    
33    public int getMin() {
34        return min;
35    }
36}