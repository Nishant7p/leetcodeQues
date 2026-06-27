1SELECT
2    r.contest_id,
3    ROUND(
4        100 * COUNT(r.user_id) / (SELECT COUNT(*) FROM Users),
5        2
6    ) AS percentage
7FROM Register r
8GROUP BY r.contest_id
9ORDER BY percentage DESC, r.contest_id;