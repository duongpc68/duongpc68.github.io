### Bài Tập Về Nhà Day 03
1. Hiển thị các bài viết của Person làm nghề Programmer được tạo sau ngày 01/01/2023
```sql
SELECT p.id, p.title, p.content, p.createdAt
FROM Post p
JOIN Person per ON p.authorId = per.id
WHERE per.job = 'Programmer' AND p.createdAt > '2023-01-01';
```
2. Tính tổng số lượng bài Post trong năm 2022
```sql
SELECT COUNT(*) AS total_posts_2022
FROM Post
WHERE createdAt >= '2022-01-01' AND createdAt <= '2022-12-31';
```
3.Hiển thị thông tin người dùng có bài Post trong năm 2022
```sql
SELECT pr.id, pr.fullname, pr.country, pr.job, pr.gender
FROM Person pr
JOIN Post p ON pr.id = p.authorId
WHERE YEAR(p.createdAt) = 2022;
```
4. Hiển thị thông tin người dùng và title bài Post của 3 bài post mới nhất
```sql
SELECT pr.id, pr.fullname, p.title
FROM Person pr
JOIN Post p ON pr.id = p.authorId
ORDER BY p.createdAt DESC
LIMIT 3;
```
5. Thống kê số lượng bài Post của từng người
```sql
SELECT authorId, COUNT(*) AS total_posts
FROM Post
GROUP BY authorId;
```
6. Thống kê số lượng bài Post của những người ở China
```sql
SELECT pr.id, pr.fullname, COUNT(p.id) AS total_posts
FROM Person pr
JOIN Post p ON pr.id = p.authorId
WHERE pr.country = 'China'
GROUP BY pr.id, pr.fullname;
```
7. Thống kê số lượng bài Post của những người có sở thích Swimming trong năm 2023
```sql
SELECT pr.id, pr.fullname, COUNT(p.id) AS total_posts
FROM Person pr
JOIN Post p ON pr.id = p.authorId
WHERE pr.hobbies = 'Swimming' AND YEAR(p.createdAt) = 2023
GROUP BY pr.id, pr.fullname;
```
8. Tìm kiếm tháng có nhiều bài post nhất trong năm 2023
```sql
SELECT MONTH(createdAt) AS month, COUNT(*) AS total_posts
FROM Post
WHERE YEAR(createdAt) = 2023
GROUP BY MONTH(createdAt)
ORDER BY total_posts DESC
LIMIT 1;
```
9. Tìm kiếm năm có ít bài post nhất
```sql
SELECT YEAR(createdAt) AS year, COUNT(*) AS total_posts
FROM Post
GROUP BY YEAR(createdAt)
ORDER BY total_posts
LIMIT 1;
```
10. Tìm kiếm năm có nhiều bài post nhất
```sql
SELECT YEAR(createdAt) AS year, COUNT(*) AS total_posts
FROM Post
GROUP BY YEAR(createdAt)
ORDER BY total_posts DESC
LIMIT 1;
```
11. Hiển thị thông tin người dùng có nhiều bài post nhất trong năm 2023
```sql
SELECT pr.id, pr.fullname, COUNT(p.id) AS total_posts
FROM Person pr
JOIN Post p ON pr.id = p.authorId
WHERE YEAR(p.createdAt) = 2023
GROUP BY pr.id, pr.fullname
ORDER BY total_posts DESC
LIMIT 1;
```
12. Hiển thị thông tin những người dùng có nhiều hơn 2 bài post trong năm 2022
```sql
SELECT pr.id, pr.fullname, COUNT(p.id) AS total_posts
FROM Person pr
JOIN Post p ON pr.id = p.authorId
WHERE YEAR(p.createdAt) = 2022
GROUP BY pr.id, pr.fullname
HAVING COUNT(p.id) > 2;
```
