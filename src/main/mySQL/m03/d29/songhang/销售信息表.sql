#pro 1 

SELECT*FROM sales;

#按月统计销售表中货物的销售量数

SELECT s.`empid` AS NO,s.`proid` AS No1,
SUM(CASE WHEN MONTH(sadate)=9 THEN num ELSE num=0 END)AS 九月,
SUM(CASE WHEN MONTH(sadate)=10 THEN num ELSE num=0 END)AS 十月,
SUM(CASE WHEN MONTH(sadate)=11 THEN num ELSE num=0 END)AS 十一月,
SUM(CASE WHEN MONTH(sadate)=12 THEN num ELSE num=0 END)AS 十二月
FROM sales s 
GROUP BY proid
ORDER BY s.`empid` ASC

#汇总时按字段D和A分组,汇总字段B,C可以不显示,如果C为'负'则对应的B为负数.

DROP TABLE IF EXISTS abc;
#创建数据表ABC，
CREATE TABLE ABC
(
	A VARCHAR(10),
	B INT,
	C CHAR(2),
	D VARCHAR(10)
)
#添加
INSERT INTO ABC VALUES('王小',10,'正','二班');
INSERT INTO ABC VALUES('李大',20,'正','一班');
INSERT INTO ABC VALUES('张五',15,'负','一班');
INSERT INTO ABC VALUES('赵三',40,'负','二班');
INSERT INTO ABC VALUES('王小',5 ,'负','二班')
#查询
SELECT*FROM abc;

SELECT A,SUM(CASE WHEN c='正' THEN b ELSE -b END)AS B,D
FROM abc
GROUP BY A
ORDER BY C ASC,A ASC, D DESC


# 编码实现'刘冰冰'缴纳罚金归还的手续

DELIMITER ;;
CREATE PROCEDURE ups_liu_01()
BEGIN
INSERT INTO penalty(rid,bid,pdate,ptype,amount)
VALUE('0008','0007','2018-03-25 10:42:50',1,4.6);
UPDATE borrow SET returndate=NOW() WHERE rid='0008' AND nif='0007';
UPDATE reader SET lennum=lennum-1 WHERE rid='刘冰冰';
UPDATE book SET bcount=bcount+1 WHERE bname='西游记';
END
;;
DELIMITER ;

CALL ups_liu_01;








