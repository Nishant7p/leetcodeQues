1# Write your MySQL query statement below
2select v.customer_id, count(v.customer_id) as count_no_trans
3from Visits as v 
4left join Transactions as t
5on v.visit_id=t.visit_id
6where t.transaction_id is NULL
7group by v.customer_id;
8
9
10