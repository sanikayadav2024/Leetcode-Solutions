# Write your MySQL query statement below
SELECT user_id, COUNT(user_id) as prompt_count, ROUND(AVG(tokens), 2) as avg_tokens
FROM prompts
GROUP BY user_id
HAVING COUNT(user_id) >= 3 AND MAX(tokens) > AVG(tokens)
ORDER BY AVG(tokens) DESC, user_id ASC;