1# Write your MySQL query statement below
2Select p.product_id, Round(ifnull(SUM(units*price)/SUM(units),0),2) as average_price 
3from Prices as p
4Left join UnitsSold as u
5on p.product_id=u.product_id
6and purchase_date  between start_date and end_date
7group by p.product_id;
8
9
10