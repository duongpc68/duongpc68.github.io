### BTVN
1. 2356. Number of Unique Subjects Taught by Each Teacher
```sql
SELECT teacher_id, COUNT(distinct subject_id) AS cnt FROM Teacher 
GROUP BY teacher_id;
```
2. 1378. Replace Employee ID With The Unique Identifier
```sql
SELECT eu.unique_id , e.name     
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id
```
3. 1683. Invalid Tweets
```sql
SELECT tweet_id FROM Tweets 
WHERE LENGTH(content) > 15;
```
4. 1795. Rearrange Products Table
```sql
ELECT product_id, 'store1' AS store, store1 AS price 
FROM Products 
WHERE store1 IS NOT NULL
UNION 
SELECT product_id, 'store2' AS store, store2 AS price 
FROM Products 
WHERE store2 IS NOT NULL
UNION 
SELECT product_id, 'store3' AS store, store3 AS price 
FROM Products 
WHERE store3 IS NOT NULL
```
5. 1587. Bank Account Summary II
```sql
    SELECT u.name, SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t ON u.account = t.account
GROUP BY u.name
HAVING balance > 10000;
```
6.  627. Swap Salary
```sql
UPDATE Salary SET sex =
CASE
WHEN sex = 'm' THEN 'f'
ELSE 'm'
END;
```
7. 1068. Product Sales Analysis I
```sql
SELECT P.product_name, S.year, S.price FROM  Sales S
JOIN Product P
ON S.product_id = P.product_id;
```
8. 1581. Customer Who Visited but Did Not Make Any Transactions
```sql
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans from Visits v LEFT JOIN Transactions t ON v.visit_id = t.visit_id  WHERE t.transaction_id IS NULL GROUP BY v.customer_id; 
```
9. 1179. Reformat Department Table
```sql
    SELECT id,
SUM((CASE WHEN month = 'Jan' THEN revenue END)) as Jan_Revenue,
SUM((CASE WHEN month = 'Feb' THEN revenue END)) as Feb_Revenue,
SUM((CASE WHEN month = 'Mar' THEN revenue END)) as Mar_Revenue,
SUM((CASE WHEN month = 'Apr' THEN revenue END)) as Apr_Revenue,
SUM((CASE WHEN month = 'May' THEN revenue END)) as May_Revenue,
SUM((CASE WHEN month = 'Jun' THEN revenue END)) as Jun_Revenue,
SUM((CASE WHEN month = 'Jul' THEN revenue END)) as Jul_Revenue,
SUM((CASE WHEN month = 'Aug' THEN revenue END)) as Aug_Revenue,
SUM((CASE WHEN month = 'Sep' THEN revenue END)) as Sep_Revenue,
SUM((CASE WHEN month = 'Oct' THEN revenue END)) as Oct_Revenue,
SUM((CASE WHEN month = 'Nov' THEN revenue END)) as Nov_Revenue,
SUM((CASE WHEN month = 'Dec' THEN revenue END)) as Dec_Revenue
FROM Department
GROUP BY id
```
10. 1484. Group Sold Products By The Date
```sql
select sell_date, count( DISTINCT product ) as num_sold ,
    
    GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products
    
        FROM Activities GROUP BY sell_date order by sell_date ASC;
```
11. 1890. The Latest Login in 2020
```sql
select user_id, max(time_stamp) 'last_stamp'
from logins
where time_stamp like '2020%'
group by user_id ;             
```
12. 1251. Average Selling Price
```sql
ELECT p.product_id, ROUND(SUM(units*price)/SUM(units),2) AS average_price
FROM Prices p LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND
u.purchase_date BETWEEN start_date AND end_date
group by product_id
```
13. 1789. Primary Department for Each Employee
```sql
ELECT DISTINCT employee_id, department_id
FROM Employee
WHERE employee_id IN (
    SELECT employee_id
    FROM Employee
    GROUP BY employee_id
    HAVING COUNT(*) = 1
  )
  OR primary_flag = 'Y'
ORDER BY employee_id;
```