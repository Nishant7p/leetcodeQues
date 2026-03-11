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
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        int c1=0;
15        int c2=0;
16        ListNode l1=headA;
17        ListNode l2=headB;
18        while(l1!=null){
19            c1++;
20            l1=l1.next;
21        }
22        while(l2!=null){
23            c2++;
24            l2=l2.next;
25        }
26
27        int a_s=0;
28        if(c1<c2){
29            a_s=1;
30        }
31        if(a_s==1){
32            l1=headA;
33            l2=headB;
34            for(int i=0;i<c2-c1;i++){
35                l2=l2.next;
36            }
37
38
39        }
40        else{
41            l2=headB;
42            l1=headA;
43            for(int i=0;i<c1-c2;i++){
44                l1=l1.next;
45            }
46
47
48        }
49        while(l1!=null&&l2!=null){
50            if(l1==l2){
51                return l1;
52            }
53            l1=l1.next;
54            l2=l2.next;
55        }
56        return null;
57
58
59        
60    }
61}