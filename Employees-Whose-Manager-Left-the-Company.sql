1# Write your MySQL query statement below
2Select m.employee_id from Employees as m
3Left join Employees as e
4on m.manager_id=e.employee_id
5where m.salary <30000 and (e.employee_id is null) and (m.manager_id is not null)
6Order by employee_id;