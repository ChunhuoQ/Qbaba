#事务存储过程
DELIMITER ;;
CREATE PROCEDURE pro_test_06(IN rnam VARCHAR(200),IN rbook VARCHAR(200),IN pt INT,IN am FLOAT)
BEGIN
	INSERT INTO penalty(rid,bid,pdate,ptype,amount) VALUE((SELECT rid FROM reader WHERE rname=rnam),(SELECT bid FROM book WHERE bname=rbook),NOW(),pt,am);
	UPDATE borrow SET returndate=NOW() WHERE rid=(SELECT rid FROM reader WHERE rname=rnam);
	UPDATE reader SET lennum=lennum-1 WHERE rname=rnam;
	UPDATE book SET bcount=bcount+1 WHERE bname=rbook;
END
;;
DELIMITER ;

CALL pro_test_06('刘冰冰','西游记',1,4.6);

SELECT * FROM reader;

SELECT * FROM penalty;

SELECT * FROM book;

SELECT * FROM borrow;
