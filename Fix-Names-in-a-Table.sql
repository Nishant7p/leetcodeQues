1# Write your MySQL query statement below
2Select user_id , Concat(Upper(substring(name,1,1)),Lower(substring(name,2))) as name
3from  Users
4Order by user_id;