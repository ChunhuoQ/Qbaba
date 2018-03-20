USE library;
INSERT  INTO `borrow`(`rid`,`nif`,`lenddate`,`willdate`,`returndate`) VALUES ('0001','0001','2017-08-12 09:10:48','2017-08-08 00:00:00','2017-08-15 00:00:00'),('0001','0004','2017-08-12 09:11:19','2017-08-18 00:00:00','2017-08-15 00:00:00'),('0002','0002','2017-08-12 09:11:19','2017-08-08 00:00:00','2017-08-20 00:00:00'),('0003','0003','2017-08-12 09:11:19','2017-08-08 00:00:00','2017-08-21 00:00:00'),('0004','0004','2017-08-12 09:11:19','2017-09-22 09:18:01','2017-08-25 00:00:00'),('0005','0001','2017-08-12 09:11:19','2017-08-08 00:00:00','2017-08-16 09:12:16'),('0006','0002','2017-08-12 09:11:19','2018-09-22 09:20:06',NULL),('0007','0006','2017-10-06 17:27:35','2018-10-09 17:27:35',NULL),('0009','0007','2017-09-22 09:13:00','2017-09-30 09:13:07',NULL);
SELECT * FROM borrow;
SELECT * FROM reader;
SELECT * FROM book;
SELECT * FROM penalty;

/*
1.查阅没有借阅信息的读者编号和读者姓名，
要求：使用 not exists子查询。
*/
SELECT a.rid AS 读者编号,a.rname AS 读者姓名 FROM reader a WHERE NOT EXISTS(
SELECT rid,rname FROM borrow WHERE lennum!=0
);
/*
2.查询所有到今天为止应还书但是未还书的读者姓名，所借的书名，应归还日期。
要求，使用select子查询，from子查询。
*/

SELECT (SELECT r.rname FROM reader r WHERE rid IN(
	SELECT b1.rid FROM borrow b1 WHERE returndate IS NULL AND willdate<NOW())
)AS 读者名称,
(SELECT willdate FROM borrow b1 WHERE returndate IS NULL AND willdate<NOW())
AS 应当归还的日期,
bname AS 书名 FROM book WHERE bid IN(
	SELECT nif FROM borrow WHERE returndate IS NULL AND willdate<NOW()
)
/*
3.查询各种图书未借出的本数，显示查询的书名和本数。
要求：使用select子查询，from子查询。
*/

SELECT 
  a.`bname` AS 书名,
  a.`bcount` - COUNT(b.`nif`) AS 剩余数量
 FROM
  book a 
  LEFT OUTER JOIN borrow b 
    ON a.`bid` = b.`nif` 
GROUP BY b.`nif` ;
/*
4.从已完成借阅的记录(即图书归还日期不为空)中，统计每位读者的借书次数
显示读者姓名和借书次数
*/
SELECT * FROM borrow WHERE returndate IS NOT NULL;

SELECT rd.`rname`AS 读者姓名,COUNT(bw.`rid`) AS 借书次数
FROM borrow bw LEFT JOIN reader rd ON rd.`rid`=bw.`rid` WHERE bw.`returndate` IS NOT NULL
GROUP BY bw.rid

/*
5.查询总罚款金额大于五元的读者姓名和总罚款金额
*/

SELECT SUM(amount)AS 罚款,r.`rname` AS 读者姓名 FROM reader r LEFT OUTER JOIN penalty p ON p.rid=r.`rid` GROUP BY p.amount,r.`rname` HAVING SUM(amount)>5


 #6.统计已完成借阅的记录中每本书的借阅次数，显示借阅次数排名在前5位的图书名称和借阅次数

SELECT COUNT(b.`nif`)AS 图书借阅次数,bname AS 图书名称
FROM book b1 LEFT OUTER JOIN borrow b ON b1.bid=b.nif WHERE YEAR(returndate)=YEAR(returndate) GROUP BY b.nif LIMIT 5

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
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
 SELECT bw.`nif`  FROM borrow WHERE bw.`returndate` IS NULL) ORDER BY  willdate DESC;
 
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