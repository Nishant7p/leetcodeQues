1# Write your MySQL query statement below
2Select activity_date as day , Count(Distinct(user_id)) as active_users from Activity
3where activity_date<='2019-07-27' and activity_date>='2019-06-28'
4group by activity_date
5order  by activity_date;