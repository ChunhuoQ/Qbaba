#测试数据
CREATE TABLE sales
(
	empid INT,
	proid INT,
	num   FLOAT,
	saDate DATETIME
)
INSERT INTO sales VALUES(1234,567890,33.5,'2004-12-21');
INSERT INTO sales VALUES(1234,598701,44.8,'2004-11-21');
INSERT INTO sales VALUES(1234,598701,45.2,'2004-10-01');
INSERT INTO sales VALUES(1234,567890,66.5,'2004-9-21');
INSERT INTO sales VALUES(3456,789065,22.5,'2004-10-01');
INSERT INTO sales VALUES(3456,789065,77.5,'2004-10-27');
INSERT INTO sales VALUES(3456,678901,48.5,'2004-12-21');

SELECT * FROM sales;
 
 #使用表连接
SELECT s.empid AS NO,s.proid AS NO2,IFNULL(a.九月,0) AS 九月,IFNULL(b.十月,0) AS 十月,IFNULL(c.十一月,0) AS 十一月,IFNULL(d.十二月,0) AS 十二月 FROM sales AS s
LEFT JOIN (SELECT proid AS aa,ROUND(SUM(s.num),1) AS 九月 FROM sales AS s WHERE MONTH(saDate)=9 GROUP BY proid) AS a ON a.aa=s.proid
LEFT JOIN (SELECT proid AS bb,ROUND(SUM(s.num),1) AS 十月 FROM sales AS s WHERE MONTH(saDate)=10 GROUP BY proid) AS b ON b.bb=s.proid
LEFT JOIN (SELECT proid AS cc,ROUND(SUM(s.num),1) AS 十一月 FROM sales AS s WHERE MONTH(saDate)=11 GROUP BY proid) AS c ON c.cc=s.proid
LEFT JOIN (SELECT proid AS dd,ROUND(SUM(s.num),1) AS 十二月 FROM sales AS s WHERE MONTH(saDate)=12 GROUP BY proid) AS d ON d.dd=s.proid
GROUP BY proid;

#使用case when表查询
SELECT empid AS NO,proid AS NO2,
ROUND(SUM(CASE WHEN MONTH(saDate)=9 THEN num ELSE 0 END),1) AS 九月,
ROUND(SUM(CASE WHEN MONTH(saDate)=10 THEN num ELSE 0 END),1) AS 十月,
ROUND(SUM(CASE WHEN MONTH(saDate)=11 THEN num ELSE 0 END),1) AS 十一月,
ROUND(SUM(CASE WHEN MONTH(saDate)=12 THEN num ELSE 0 END),1) AS 十二月
FROM sales AS s GROUP BY proid;

CREATE TABLE ABC
(
	A VARCHAR(10),
	B INT,
	C CHAR(2),
	D VARCHAR(10)
)

INSERT INTO ABC VALUES('王小',10,'正','二班');
INSERT INTO ABC VALUES('李大',20,'正','一班');
INSERT INTO ABC VALUES('张五',15,'负','一班');
INSERT INTO ABC VALUES('赵三',40,'负','二班');
INSERT INTO ABC VALUES('王小',5 ,'负','二班');

SELECT * FROM ABC;

SELECT A, 
CASE C WHEN '负' THEN -B ELSE B END AS B,
D
FROM ABC;