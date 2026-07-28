# Write your MySQL query statement below
SELECT name , SUM(if(distance is NULL, 0, distance)) as travelled_distance
FROM Users as a
LEFT JOIN Rides as b
ON a.id = b.user_id
GROUP BY b.user_id
ORDER BY SUM(b.distance) DESC, name ASC