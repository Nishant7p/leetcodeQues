1# Write your MySQL query statement below
2select query_name , Round(SUM(rating/position)/Count(query_name),2) as quality, 
3Round(100*AVG(rating <3),2) as poor_query_percentage
4from Queries as q
5group by query_name
6