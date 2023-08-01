### LeetCode Homework
1. 1741. Find Total Time Spent by Each Employee
```sql
SELECt event_day AS day,
emp_id, 
SUM(out_time - in_time) AS total_time 
FROM Employees
GROUP BY event_day, emp_id;
```
2. 2356. Number of Unique Subjects Taught by Each Teacher
```sql
SELECT teacher_id, COUNT(distinct subject_id) AS cnt FROM Teacher 
GROUP BY teacher_id;
```
3. 1693. Daily Leads and Partners
```sql
SELECT date_id,make_name,
COUNT(DISTINCT lead_id) AS unique_leads,
COUNT(DISTINCT partner_id) AS unique_partners
FROM DailySales 
GROUP BY date_id,make_name;
```
4. 1179. Reformat Department Table
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
5. 1350. Students With Invalid Departments
```sql
SELECT s.id, s.name
FROM Students s
LEFT JOIN Departments d ON s.department_id = d.id
WHERE d.id IS NULL;
```
6. 1777. Product’s Price for Each Store
```sql
SELECT
    product_id,
    SUM(CASE WHEN store = 'store1' THEN price ELSE NULL END) AS store1,
    SUM(CASE WHEN store = 'store2' THEN price ELSE NULL END) AS store2,
    SUM(CASE WHEN store = 'store3' THEN price ELSE NULL END) AS store3
FROM Products
GROUP BY product_id;
```
7. 1565. Unique Orders and Customers Per Month
```sql
SELECT
    EXTRACT(MONTH FROM order_date) AS month,
    COUNT(DISTINCT order_id) AS unique_orders,
    COUNT(DISTINCT customer_id) AS unique_customers
FROM
    Orders
WHERE
    invoice > 20
GROUP BY
    EXTRACT(MONTH FROM order_date);
```
8. 1173. Immediate Food Delivery I
```sql
SELECT
    CAST(COUNT(CASE WHEN order_date = customer_pref_delivery_date THEN 1 END) * 100.0 / COUNT(*) AS DECIMAL(10, 2)) AS immediate_delivery_ratio
FROM
    Delivery;
```