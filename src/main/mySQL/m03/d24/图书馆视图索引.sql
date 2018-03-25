CREATE DATABASE library4;

SELECT * FROM book;
SELECT * FROM borrow;
SELECT * FROM penalty;
SELECT * FROM reader;

#在图书馆日常工作中，图书管理员希望及时得到最新的到期图书清单，包括图书名称、到期日期和读者姓名等信息；
#而读者则关心各种图书信息，如图书名称、馆存量和 可借阅数量等。
#请按上面需求在图书名称字段创建索引，为图书管理员和读者分别创建不同的查询视图，并利用所创建的索引和视图获得相关的数据

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

