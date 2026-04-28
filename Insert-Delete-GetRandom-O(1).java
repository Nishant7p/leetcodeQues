1class RandomizedSet {
2    HashMap<Integer, Integer> map;
3    ArrayList<Integer> list;
4    Random random;
5
6    public RandomizedSet() {
7        map = new HashMap<>();
8        list = new ArrayList<>();
9        random = new Random();
10    }
11    
12    public boolean insert(int val) {
13        if (map.containsKey(val)) {
14            return false;
15        }
16
17        map.put(val, list.size());
18        list.add(val);
19        return true;
20    }
21    
22    public boolean remove(int val) {
23        if (!map.containsKey(val)) {
24            return false;
25        }
26
27        int index = map.get(val);
28        int lastValue = list.get(list.size() - 1);
29
30        list.set(index, lastValue);
31        map.put(lastValue, index);
32
33        list.remove(list.size() - 1);
34        map.remove(val);
35
36        return true;
37    }
38    
39    public int getRandom() {
40        int randomIndex = random.nextInt(list.size());
41        return list.get(randomIndex);
42    }
43}