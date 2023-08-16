### BTVN 05
1. 1378. Replace Employee ID With The Unique Identifier
```sql
SELECT eu.unique_id , e.name     
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id
```
2. 1795. Rearrange Products Table
```sql
SELECT product_id, 'store1' AS store, store1 AS price 
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
3. 1587. Bank Account Summary II
```sql
 SELECT u.name, SUM(t.amount) AS balance
  FROM Users u
  JOIN Transactions t ON u.account = t.account
  GROUP BY u.name
  HAVING balance > 10000;
```
4. 1581. Customer Who Visited but Did Not Make Any Transactions
```sql
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans from Visits v LEFT JOIN Transactions t ON v.visit_id = t.visit_id  WHERE t.transaction_id IS NULL GROUP BY v.customer_id; 
```
5. 1251. Average Selling Price
```sql
SELECT p.product_id, ROUND(SUM(units*price)/SUM(units),2) AS average_price
FROM Prices p LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND
u.purchase_date BETWEEN start_date AND end_date
group by product_id
```
6. 1303. Find the Team Size
```sql
SELECT employee_id, 
(SELECT COUNT(1)
FROM Employee e2 WHERE e2.employee_id = e.employee_id AS team_size 
FROM Employee e
```
7 .1571. Warehouse Manager
```sql
SELECT name as warehouse_name, SUM(units*dimension) as volume FROM
(
     SELECT product_id, Width*Length*Height as dimension FROM Products
) a
JOIN Warehouse as b
ON a.product_id=b.product_id
GROUP BY name;
```
8. 2339. All the Matches of the League
```sql
SELECT a.team_name home_team, b.team_name away_team
FROM Teams a JOIN Teams b
ON a.team_name != b.team_name;
```
9. 1623. All Valid Triplets That Can Represent a Country
```sql
SELECT sa.student_name AS member_a
    , sb.student_name AS member_b
    , sc.student_name AS member_c
FROM schoola sa CROSS JOIN schoolb sb 
    CROSS JOIN schoolc sc
        WHERE sa.student_name != sb.student_name 
            AND sa.student_name != sc.student_name
            AND sb.student_name != sc.student_name
            AND sa.student_id != sc.student_id
            AND sb.student_id != sc.student_id
            AND sa.student_id != sb.student_id
```
10. 1421. NPV Queries
```sql
select a.id, a.year, isnull(npv, 0) as npv
from queries a left join npv b on a.id = b.id and a.year = b.year
```
11. 1069. Product Sales Analysis II
```sql
select product_id, sum(quantity) as total_quantity
from Sales
group by product_id
```