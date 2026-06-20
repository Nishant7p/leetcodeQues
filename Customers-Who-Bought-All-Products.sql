1# Write your MySQL query statement below
2select customer_id 
3from customer
4group by customer_id
5having count(distinct(product_key))=(select count(product_key) from Product);