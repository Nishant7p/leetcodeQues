1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11
12class Solution {
13    public ListNode rev(ListNode head){
14        if(head==null){
15            return null;
16        }
17        if(head.next==null){
18            return head;
19        }
20        ListNode r_h=rev(head.next);
21        head.next.next=head;
22        head.next=null;
23        return r_h;
24    }
25    public void reorderList(ListNode head) {
26        ListNode s=head;
27        ListNode f=head;
28
29        while(f!=null&&f.next!=null&&f.next.next!=null){
30            s=s.next;
31            f=f.next.next;
32
33        }
34        ListNode r_h=rev(s.next);
35        s.next=null;
36
37       //System.out.println(r_h.val);
38        f=head;
39        while(f!=null&&r_h!=null){
40            ListNode t=f.next;
41            f.next=r_h;
42            f=t;
43            t=r_h.next;
44            r_h.next=f;
45            r_h=t;
46
47        }
48
49
50
51        
52        
53    }
54}
55