#刘冰冰
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `cha`(IN rnames VARCHAR(6),IN bnames VARCHAR(6),IN a INT, IN b DOUBLE(5,1))
BEGIN	
	INSERT INTO penalty VALUES((SELECT rid FROM reader WHERE rname=rnames),
	(SELECT bid FROM book WHERE bname=bnames),NOW(),a,b);
	UPDATE borrow SET returndate=NOW() WHERE rid IN (SELECT rid FROM reader WHERE rname=rnames);
	UPDATE reader SET lennum=lennum-1 WHERE rid IN(SELECT rid FROM borrow WHERE rname=rnames);
	UPDATE book SET bcount=bcount+1 WHERE bid IN(SELECT nif FROM borrow WHERE bname=bnames);
END ;;

DELIMITER ;

CALL cha('刘冰冰','西游记',1,4.6)

#销量
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

SELECT empid AS NO，,proid AS NO2,
SUM(CASE WHEN MONTH(sadate)=9 THEN num ELSE num=0 END)AS 九月份,
SUM(CASE WHEN MONTH(sadate)=10 THEN num ELSE num=0 END)AS 十月份,
SUM(CASE WHEN MONTH(sadate)=11 THEN num ELSE num=0 END)AS 十一月份,
SUM(CASE WHEN MONTH(sadate)=12 THEN num ELSE num=0 END)AS 十二月份
FROM sales GROUP BY proid
ORDER BY no，

#班级
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

SELECT A,SUM(CASE WHEN C='正' THEN B ELSE -B END)AS B,D 
FROM ABC 
GROUP BY A
ORDER BY b DESC



#考题
USE `question`
 #查询
DELIMITER ;;
CREATE PROCEDURE cha()
BEGIN 
	SELECT * FROM question_info;
END
;;
DELIMITER ;

CALL cha();

DELIMITER ;;
CREATE PROCEDURE mohu(IN ac VARCHAR(100))
BEGIN
	SELECT * FROM question_info WHERE question LIKE ac ;
END
;;
DELIMITER ;

CALL mohu('%变量%');