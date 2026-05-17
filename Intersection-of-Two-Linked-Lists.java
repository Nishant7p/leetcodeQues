1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
14        int l1=0;
15        int l2=0;
16        ListNode t1=hA;
17        ListNode t2=hB;
18        while(t1!=null){
19            l1++;
20            t1=t1.next;
21        }
22
23        while(t2!=null){
24            l2++;
25            t2=t2.next;
26        }
27        int d=Math.abs(l1-l2);
28        t1=hA;
29        t2=hB;
30
31        if(l1>l2){
32
33            
34            for(int i=0;i<d;i++){
35                t1=t1.next;
36            }
37
38
39
40
41        }
42        else{
43            for(int i=0;i<d;i++){
44                t2=t2.next;
45            }
46
47        }
48
49        while(t1!=null&&t2!=null){
50            if(t1==t2){
51                return t1;
52            }
53            t1=t1.next;
54            t2=t2.next;
55        }
56
57
58
59
60
61
62        return null;
63
64
65       
66        
67    }
68}