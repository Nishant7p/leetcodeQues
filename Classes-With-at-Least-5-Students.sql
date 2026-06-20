1# Write your MySQL query statement below
2select class 
3from Courses
4Group by class
5having count(student) >=5;
6