# Write your MySQL query statement below
select distinct p.email from person p inner join person aux on aux.email = p.email and not p.id = aux.id;