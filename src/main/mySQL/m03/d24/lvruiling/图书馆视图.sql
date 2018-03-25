USE library;
CREATE VIEW view_book
AS
SELECT bid,bname FROM book;
SELECT * FROM view_book;
/*
1.为读者张无忌办理借阅红楼梦的手续
*/
USE library;
SELECT * FROM borrow;
SELECT * FROM book;
SELECT * FROM reader;

SELECT * FROM penalty;
INSERT INTO reader(rid,rname)VALUE(0010,'张无忌');

UPDATE reader SET lennum=lennum+1 WHERE rname='张无忌';
UPDATE book SET bcount=bcount-1 WHERE bname='红楼梦';
/*
2.编码实现读者“刘冰冰”缴纳罚金归还图书的手续，要求一次完成以下功能
在罚款记录表中增加刘冰冰延期归还西游记而缴纳罚金4.6元
在图书借阅表中修改归还日期为当前日期
将读者信息表中已借书数量减1
将图书信息表中现存数量加一
*/

INSERT INTO penalty(rid,bid,amount,pdate)VALUE('刘冰冰','西游记',4.6,'2018-3-24');
UPDATE reader SET lennum=lennum-1 WHERE rid=8;
UPDATE book SET bcount=bcount+1 WHERE bname='西游记';








/*
为图书管理员和读者分别创建不同的查询视图
图书管理员：到期图书清单，包括到期图书清单，到期日期和读者姓名
读者：图书信息，包括图书名称，馆存量和可借阅数量
*/

CREATE VIEW view_borrow
AS
	SELECT b.bName AS 图书名称, bw.willdate AS 到期时间,r.rName AS 读者姓名 FROM borrow AS bw
	INNER JOIN book AS b ON b.bid=bw.nif
	LEFT OUTER JOIN reader AS r ON r.rid=bw.rid
	ORDER BY 到期时间;
	
SELECT * FROM view_borrow;

CREATE VIEW view_book
AS
	SELECT b.bid,b.bName AS 图书名称,b.bcount AS 馆存量,(b.bcount-COUNT(*)) AS 可借阅数量,COUNT(*) FROM book AS b
	LEFT JOIN borrow AS bw ON bw.nif=b.bid
	GROUP BY bw.nif
	ORDER BY b.bid;	
	
SELECT * FROM view_book;

CREATE INDEX ix_book_01 ON book(bName);
