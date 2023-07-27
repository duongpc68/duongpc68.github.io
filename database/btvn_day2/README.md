### Bài Tập Về Nhà Day 2
1. Find Customer Referee
```sql
SELECT name FROM customer
WHERE referee_id != 2 OR referee_id IS NULL;
```

2. Recyclable and Low Fat Products

```sql
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
```
3. Invalid Tweets
```sql
SELECT tweet_id FROM Tweets 
WHERE LENGTH(content) > 15;
```
4. Swap Salary
```sql
UPDATE Salary SET sex =
CASE
WHEN sex = 'm' THEN 'f'
ELSE 'm'
END;
```
5. Product Sales Analysis I
```sql
SELECT P.product_name, S.year, S.price FROM  Sales S
JOIN Product P
ON S.product_id = P.product_id;
```
6. Article Views I
```sql
SELECT DISTINCT author_id as id FROM Views
WHERE author_id = viewer_id
ORDER BY id ASC;
```
7. Convert Date Format
```sql
SELECT
    DATE_FORMAT(day, '%W, %M %e, %Y') AS formatted_date
FROM Days;
```
8. Find Customers With Positive Revenue this Year
```sql
SELECT DISTINCT customer_id FROM Customers
WHERE revenue > 0 AND year = 2021;
```
9. Low-Quality Problems
```sql
SELECT problem_id FROM Problems
WHERE (likes / (likes + dislikes)) < 0.6
 ORDER BY problem_id  ASC;
```
10. The Number of Rich Customers
```sql
SELECT COUNT(DISTINCT customer_id) AS rich_count FROM Store
WHERE customer_id IN (
SELECT customer_id FROM Store WHERE amount > 500);
```
11. Sort the Olympic Table
```sql
SELECT * FROM Olympic
ORDER BY gold_medals DESC, silver_medals DESC, bronze_medals DESC, country ;
```