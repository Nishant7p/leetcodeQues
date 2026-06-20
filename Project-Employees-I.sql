1# Write your MySQL query statement below
2select project_id , Round(avg(e.experience_years),2) as average_years
3from Project as p
4left join Employee as e
5on p.employee_id=e.employee_id
6group by project_id;
7 