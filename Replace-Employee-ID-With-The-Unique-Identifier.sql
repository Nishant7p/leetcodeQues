1# Write your MySQL query statement below
2
3Select t2.unique_id,name
4from Employees as t1
5Left join EmployeeUNI as t2
6on t1.id=t2.id
7
8
9