1# Write your MySQL query statement below
2Select e.employee_id,e.name,count(e1.reports_to) as reports_count,Round(Avg(e1.age)) as average_age
3from Employees as e
4Left join Employees as e1
5on e.employee_id=e1.reports_to
6where e1.reports_to is not null
7group by e.employee_id
8order by e.employee_id;