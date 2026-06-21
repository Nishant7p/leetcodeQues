1# Write your MySQL query statement below
2select t1.id from Weather as t1
3cross join Weather as t2
4where datediff(t1.recordDate,t2.recordDate)=1
5and t1.temperature > t2.temperature;
6