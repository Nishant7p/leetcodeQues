1# Write your MySQL query statement below
2select e.name,b.bonus
3from Employee as e
4left join Bonus as b
5on e.empId=b.empId
6where b.bonus<1000 or b.bonus is null;