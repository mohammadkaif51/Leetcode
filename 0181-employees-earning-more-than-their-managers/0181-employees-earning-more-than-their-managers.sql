# Write your MySQL query statement below
SELECT e.name as Employee
from Employee e
JOIN Employee m on e.managerId=m.Id
where e.salary>m.salary;