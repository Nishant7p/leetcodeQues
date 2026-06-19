1# Write your MySQL query statement below
2
3select * from Cinema
4where id%2=1 and description !="boring"
5Order by rating desc;