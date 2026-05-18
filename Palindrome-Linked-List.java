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
11class Solution {
12     public ListNode reverseList(ListNode head) {
13        if(head==null){
14            return head;
15        }
16        if(head.next==null){
17            return head;
18        }
19        ListNode n_h=reverseList(head.next);
20        head.next.next=head;
21        head.next=null;
22
23        return n_h;
24        
25    }
26    public boolean isPalindrome(ListNode head) {
27         ListNode head1=new ListNode(-1);
28         ListNode x=head;
29         ListNode t=head1;
30
31         while(x!=null){
32            ListNode j=new ListNode(x.val);
33            head1.next=j;
34            x=x.next;
35            head1=head1.next;
36         }
37
38
39
40         ListNode n_h=reverseList(t.next);
41
42        
43        while(n_h!=null){
44            if(n_h.val!=head.val){
45                return false;
46            }
47            n_h=n_h.next;
48            head=head.next;
49        }
50
51
52
53
54        return true;
55
56        
57    }
58}