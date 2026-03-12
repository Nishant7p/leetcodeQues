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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null||head.next==null){
14            return head;
15        }
16        int c=0;
17        ListNode temp=head;
18        ListNode e=new ListNode(head.next.val);
19        ListNode t_e=e;
20        ListNode o=new ListNode(head.val);
21        ListNode t_o=o;
22        while(temp!=null){
23            ListNode x =new ListNode(temp.val);
24            if(c%2==0){
25                
26                t_e.next=x;
27                t_e=t_e.next;
28            }
29            else{
30                t_o.next=x;
31                t_o=t_o.next;
32
33            }
34            c++;
35
36
37
38
39            temp=temp.next;
40
41        }
42        o=o.next;
43        t_e.next=o;
44
45        
46        return e.next;
47
48       
49}
50}