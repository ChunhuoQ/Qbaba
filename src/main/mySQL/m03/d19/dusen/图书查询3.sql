#查询所有到今天为止应还书但还未还书的读者姓名

SELECT * FROM book;
SELECT * FROM borrow;
SELECT * FROM penalty;
SELECT * FROM reader;

SELECT (SELECT r.rname FROM reader r WHERE rid IN(
	SELECT b1.rid FROM borrow b1 WHERE returndate IS NULL AND willdate<NOW())
)AS 读者名称,
(SELECT willdate FROM borrow b1 WHERE returndate IS NULL AND willdate<NOW())
AS 应当归还的日期,
bname AS 书名 FROM book WHERE bid IN(
	SELECT nif FROM borrow WHERE returndate IS NULL AND willdate<NOW()
)

#查询各种图书未借出的本数 ，显示查询的书名和本数
SELECT b.bname AS 书名,COUNT(a.nif) AS 借出数量,b.bcount - COUNT(a.nif) AS 现存数量 FROM
book b LEFT OUTER JOIN borrow a ON b.bid=a.nif GROUP BY a.nif;


#从已完成借阅的记录中统计每位读者的借书次数，显示读者姓名和借书次数
SELECT r.`rname`AS 读者名,COUNT(b.rid)AS 次数 
FROM reader r LEFT OUTER JOIN borrow b ON r.`rid`=b.`rid` WHERE YEAR(returndate)=YEAR(returndate) GROUP BY b.`rid`,r.`rname`


#查询总罚款金额大于5元的读者姓名和总罚款金额
SELECT SUM(amount)AS 罚款,r.`rname` AS 读者姓名 FROM reader r LEFT OUTER JOIN penalty p ON p.rid=r.`rid` GROUP BY p.amount,r.`rname` HAVING SUM(amount)>5


#统计已完成借阅的记录中每本书的借阅次数，显示借阅次数排名在前5位的图书名称和借阅次数

SELECT COUNT(b.`nif`)AS 图书借阅次数,bname AS 图书名称
FROM book b1 LEFT OUTER JOIN borrow b ON b1.bid=b.nif WHERE YEAR(returndate)=YEAR(returndate) GROUP BY b.nif LIMIT 5
