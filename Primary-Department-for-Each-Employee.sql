1# Write your MySQL query statement below
2Select employee_id,department_id
3from Employee
4where primary_flag='Y' OR employee_id in(Select employee_id from Employee group by employee_id having Count(department_id)=1);