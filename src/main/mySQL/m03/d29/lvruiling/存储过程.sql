CREATE DATABASE sale;
USE sale;
CREATE TABLE sales
(
	empid INT,
	proid INT,
	num   FLOAT,
	saDate DATETIME
)
INSERT INTO sales VALUES(1234,567890,33.5,'2004-12-21')
INSERT INTO sales VALUES(1234,598701,44.8,'2004-11-21')
INSERT INTO sales VALUES(1234,598701,45.2,'2004-10-01')
INSERT INTO sales VALUES(1234,567890,66.5,'2004-9-21')
INSERT INTO sales VALUES(3456,789065,22.5,'2004-10-01')
INSERT INTO sales VALUES(3456,789065,77.5,'2004-10-27')
INSERT INTO sales VALUES(3456,678901,48.5,'2004-12-21')
SELECT * FROM sales;
SELECT num  AS 九月 FROM sales WHERE MONTH(saDate)=9;
SELECT num  AS 十月 FROM sales WHERE MONTH(saDate)=10;
SELECT num  AS 十一月 FROM sales WHERE MONTH(saDate)=11;
SELECT num  AS 十二月 FROM sales WHERE MONTH(saDate)=12;


SELECT empid,proid,
SUM(CASE WHEN MONTH(saDate)=9 THEN num ELSE num=0 END)AS 九月,
SUM(CASE WHEN MONTH(saDate)=10 THEN num ELSE num=0 END)AS 十月,
SUM(CASE WHEN MONTH(saDate)=11 THEN num ELSE num=0 END)AS 十一月,
SUM(CASE WHEN MONTH(saDate)=12 THEN num ELSE num=0 END)AS 十二月
 
 FROM sales
 GROUP BY proid

;

  /*
  按月统计销售表中货物的销售量数
  */





















CREATE TABLE ABC
(
	A VARCHAR(10),
	B INT,
	C CHAR(2),
	D VARCHAR(10)
)
INSERT INTO ABC VALUES('王小',10,'正','二班')
INSERT INTO ABC VALUES('李大',20,'正','一班')
INSERT INTO ABC VALUES('张五',15,'负','一班')
INSERT INTO ABC VALUES('赵三',40,'负','二班')
INSERT INTO ABC VALUES('王小',5 ,'负','二班')
SELECT * FROM ABC;

/*
汇总时按字段D 和A分组,汇总字段B,C可以不显示,
如果C为'负'则对应的B为负数.
*/
SELECT A,
SUM(CASE WHEN C='正' THEN B ELSE -B END)AS B,D

 FROM ABC
 GROUP BY A;
























/*
刘冰冰缴纳罚金归还图书

*/
USE library;
SELECT * FROM borrow;
SELECT * FROM reader;
SELECT * FROM penalty;
SELECT * FROM book;

DELIMITER //
CREATE PROCEDURE apenalty(IN rna STRING,IN bn STRING,IN pda NOW(),IN pty INT,IN am FLOAT)
BEGIN
INSERT INTO penalty VALUES((SELECT rid FROM reader WHERE rname=rna),
(SELECT bid FROM book WHERE bname=bn),pda,pty,am);
UPDATE borrow SET returndate=pda WHERE rid=(SELECT rid FROM reader WHERE rname=rna);
UPDATE reader SET lennum=lennum-1 WHERE rname=rna;
UPDATE book SET bcount=bcount+1 WHERE bname=bn;  
END //
DELIMITER ;
/*
4.
*/

USE problemroot;
DELIMITER //
CREATE PROCEDURE sel_A()
BEGIN
SELECT * FROM question_info;


END //
DELIMITER ;
CALL sel_A();

DELIMITER //
CREATE PROCEDURE sel_B(IN que VARCHAR(20))
BEGIN
SELECT * FROM question_info WHERE question LIKE CONCAT('%',que,'%');


END //
DELIMITER ;
CALL sel_B('java');