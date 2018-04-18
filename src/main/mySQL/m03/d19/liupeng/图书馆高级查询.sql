SELECT * FROM book;

SELECT * FROM borrow;

SELECT * FROM penalty;

SELECT * FROM reader;

#需求：查询没有借阅信息的读者编号和读者姓名。

SELECT rid,rname FROM reader AS r WHERE NOT EXISTS(
	SELECT rid FROM borrow AS b WHERE r.rid=rid
);

/*SELECT * FROM reader AS r WHERE rid NOT IN(
	SELECT rid FROM borrow AS b
);

SELECT COUNT(SELECT rid FROM reader AS r WHERE rid NOT IN(SELECT rid FROM borrow AS b)) AS 没借书的人数量 FROM reader ;

SELECT * FROM reader WHERE NOT EXISTS (
	COUNT(SELECT rid FROM reader AS r WHERE rid NOT IN(SELECT rid FROM borrow AS b))<1
)AND rid NOT IN(SELECT rid FROM borrow AS b);*/

SELECT * FROM book;

SELECT * FROM borrow;

SELECT * FROM penalty;

SELECT * FROM reader;

#查询所有到今天为止应还书但还未还书的读者姓名、所借书的书名、应归还日期
SELECT 
(SELECT rname FROM reader WHERE rid=bw.`rid`) AS 读者姓名,
(SELECT bname FROM book WHERE bid=bw.nif) AS 所借书的书名,
bw.`willdate` AS 应归还日期 FROM borrow AS bw WHERE bw.`returndate` IS NULL AND bw.`willdate`<NOW();

#查询各种图书未借出的本数，显示查询书名和本数。
SELECT rid,bName AS 书名, COUNT(bw.nif) AS 借出书的数量,b.`bcount`-COUNT(bw.nif) AS 未借出本数
FROM book AS b
LEFT JOIN borrow AS bw ON bw.`nif`=b.`bid` WHERE bw.`returndate` IS NULL
GROUP BY bw.`nif`;

#从已完成借阅的记录（即图书归还日期不为空）中，统计每位读者的借书次数，显示读者姓名和借书次数
SELECT COUNT(bw.rid) AS 借书次数,
(SELECT rName FROM reader WHERE bw.rid=rid) AS 读者姓名
FROM borrow AS bw WHERE returndate IS NOT NULL
GROUP BY bw.rid;

#查询总罚款金额大于五元的读者姓名和总罚款金额
SELECT (SELECT rName FROM reader WHERE rid=p.rid) AS 读者姓名,
SUM(amount) AS 罚款总金额
FROM penalty AS p GROUP BY rid HAVING 罚款总金额>5;

#统计已完成借阅的记录（即图书归还日期不为空）中每本书的借阅次数，显示借阅次数排名在前五位的图书名称和借阅次数
SELECT b.`nif` AS 图书编号,
(SELECT bName FROM book WHERE bid=b.nif) AS 图书名称,
COUNT(b.`nif`) AS 图书借阅次数
FROM borrow AS b 
WHERE returndate IS NOT NULL 
GROUP BY b.`nif`
ORDER BY 图书借阅次数 DESC
LIMIT 5;
