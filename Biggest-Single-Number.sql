1# Write your MySQL query statement below
2select (
3    select num
4
5from MyNumbers
6group by num
7having count(num)=1
8order by num desc
9limit 1) as num;
10