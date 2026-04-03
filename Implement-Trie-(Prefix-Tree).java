1class Trie {
2    HashSet<String> map;
3
4    public Trie() {
5        map = new HashSet<>();
6    }
7    
8    public void insert(String word) {
9        map.add(word);
10    }
11    
12    public boolean search(String word) {
13        return map.contains(word);
14    }
15    
16    public boolean startsWith(String prefix) {
17        for(String word : map){
18            if(word.startsWith(prefix)){
19                return true;
20            }
21        }
22        return false;
23    }
24}