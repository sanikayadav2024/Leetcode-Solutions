# Write your MySQL query statement below
SELECT b.name as Employee
FROM Employee as a
INNER JOIN Employee as b
ON a.id = b.managerId 
WHERE a.salary < b.salary