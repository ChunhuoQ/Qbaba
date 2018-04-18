# 2.没有借阅信息的读者编号和读者姓名
SELECT a.rid AS 读者编号,a.`rname`AS 读者名字 FROM reader a WHERE NOT EXISTS(
	SELECT * FROM borrow WHERE a.rid=rid
);
#方法二
SELECT a.rid AS 读者编号,a.`rname`AS 读者名字 FROM reader a WHERE NOT EXISTS(
	SELECT * FROM borrow WHERE lennum!=0 
);

# 3.还未还书的读者姓名+书名+应还日期
SELECT rd.`rname`AS 读者姓名,bk.`bname` AS 书名,bw.`willdate` AS 应还日期 
FROM borrow bw LEFT JOIN reader rd ON rd.`rid`=bw.`rid` 
LEFT JOIN book bk ON bk.`bid`=bw.`nif` WHERE bk.bid IN(
 SELECT bw.`nif`  FROM borrow WHERE bw.`returndate` IS NULL)
 AND TIMEDIFF(willdate,NOW())<0 ORDER BY  willdate DESC;
 
# 4.查询各种图书未借出的本数 显示查询书名和本书 如果bcount 是未借出数量


SELECT bk.`bname` AS 书名,bk.`bcount` AS 未借出数量 FROM book bk;

#如果bcount 是进货数量
SELECT * FROM(
 SELECT a.`bname` AS 未借出过的书籍名称, a.`bcount` - COUNT(b.`nif`) AS 本数
 FROM book a 
	  LEFT OUTER JOIN borrow b 
	    ON a.`bid` = b.`nif` 
	GROUP BY b.`nif` )m ORDER BY 本数 DESC ;
	
# 5.从已完成借阅的记录中，统计每位读者的借书次数，并显示读者姓名和借书次数

SELECT rd.`rname`AS 读者姓名,COUNT(bw.`rid`) AS 借书次数
FROM borrow bw LEFT JOIN reader rd ON rd.`rid`=bw.`rid` WHERE bw.`returndate` IS NOT NULL
GROUP BY bw.rid



# 6.查询总罚款金额大于五块钱的读者姓名和总罚款金额。
SELECT rd.`rname`AS 读者姓名,SUM(py.amount) AS 罚款总金额
FROM penalty py LEFT JOIN reader rd ON py.rid= rd.rid
 WHERE amount>5 GROUP BY py.rid
 
# 7.从已完成借阅的记录中（归还日期不为空），统计每本书的借阅次数，显示 借阅次数的排名在前五位的图书名称和借阅次数

SELECT bk.bname AS 图书名称,COUNT(bw.nif)AS 借阅次数
FROM book bk 
RIGHT JOIN borrow bw ON bk.bid=bw.nif
WHERE bw.`returndate` IS NOT NULL
GROUP BY bw.nif ORDER BY COUNT(bw.nif) DESC
LIMIT 5;