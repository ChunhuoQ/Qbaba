SELECT * FROM book;
SELECT * FROM borrow;
SELECT * FROM penalty;
SELECT * FROM reader;

/*
  需求：查询 所有到今天为止 应还书但还未还书
  显示：读者姓名，所借书的书名，应归还日期
  要求：使用select子查询
  分析：
*/
SELECT rd.`rname`AS 读者姓名,bk.`bname`AS 所借书的书名,bw.`willdate`AS 应还日期 
FROM borrow bw LEFT JOIN book bk ON bw.`nif`=bk.`bid`
LEFT JOIN reader rd ON bw.`rid`=rd.`rid` WHERE bk.`bid`IN(
SELECT bw.`nif`FROM borrow WHERE bw.`returndate`IS NULL
)

/*
需求：查询各种图书 未借出 的本数，
显示：查询书名和本数
要求: 使用from子查询
*/

SELECT*FROM(
 SELECT bk.`bname` AS 书名,bk.`bcount`-COUNT(bw.`nif`)AS 本数 
 FROM book bk LEFT JOIN borrow bw ON bk.`bid`=bw.`nif` 
 GROUP BY bw.`nif`
) AS m 

/*
需求：从已完成借阅的记录（即图书归还日期不为空）中，统计每位读者的借书次数
显示：读者姓名（bname）和借书次数
*/

SELECT rd.`rname`AS 读者姓名,COUNT(bw.rid)AS 借书次数 FROM borrow bw 
LEFT JOIN reader rd ON rd.`rid`=bw.`rid` 
WHERE bw.`returndate`IS NOT NULL GROUP BY bw.`rid`

/*
需求：查询总罚款金额大于5元的
显示：读者姓名和总罚款金额
*/

SELECT rd.`rname`AS 读者姓名,SUM(py.amount) AS 总金额
FROM penalty py LEFT JOIN reader rd ON rd.`rid`=py.rid 
GROUP BY py.amount
HAVING 总金额 >5 

/*
需求：统计已完成借阅的记录(即图书归还日期不为空)中每本书的借阅次数，
显示：借阅次数在前5位的图书名称和借阅次数
*/

SELECT bk.`bname` AS 图书名称,COUNT(bw.`nif`)AS 借阅次数 FROM borrow bw 
LEFT JOIN book bk ON bk.`bid`=bw.`nif` 
WHERE bw.`returndate`IS NOT NULL
GROUP BY bw.`nif` ORDER BY COUNT(bw.`nif`)DESC LIMIT 5
