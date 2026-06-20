1# Write your MySQL query statement below
2Select user_id, Count(follower_id) as followers_count
3from Followers 
4Group by user_id
5order by user_id;