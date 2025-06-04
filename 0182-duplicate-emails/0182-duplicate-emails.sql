# Write your MySQL query statement below
select email
From Person
Group by email
Having count(*)>1;