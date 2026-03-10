1class Solution {
2    class Pair2 {
3        public int dist;
4        public String word;
5
6        public Pair2(int dist, String word) {
7            this.dist = dist;
8            this.word = word;
9        }
10    }
11
12    public int ladderLength(String beginWord, String endWord, List<String> wordL) {
13        Set<String> wordList = new HashSet<>(wordL);
14        Queue<Pair2> Q = new LinkedList<>();
15        Q.add(new Pair2(1, beginWord));
16        wordList.remove(beginWord);
17
18        while (!Q.isEmpty()) {
19            Pair2 curr = Q.remove();
20            int dist = curr.dist;
21            String word = curr.word;
22
23            if (word.equals(endWord)) {
24                return dist;
25            }
26
27            char[] char_word = word.toCharArray();
28            int i = 0;
29
30            while (i < char_word.length) {
31                char originalChar = char_word[i];
32
33                for (char new_char = 'a'; new_char <= 'z'; new_char++) {
34                    if (new_char == originalChar)
35                        continue;
36                    char_word[i] = new_char;
37                    String new_word = new String(char_word);
38                    if (wordList.contains(new_word)) {
39                        wordList.remove(new_word);
40                        Q.add(new Pair2(dist + 1, new_word));
41
42                    }
43
44                }
45                char_word[i] = originalChar;
46
47                i++;
48
49            }
50
51        }
52        return 0;
53
54    }
55
56}