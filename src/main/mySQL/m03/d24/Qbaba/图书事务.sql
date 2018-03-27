#为读者办理借阅《红楼梦》书籍的手续;
USE controllby;
USE book;
START TRANSACTION;
INSERT INTO borrow(rid,nif,lenddate,willdate) VALUE('0011','0006','2018-03-25 10:41:50','2018-03-26 10:42:50');
UPDATE book SET bcount=bcount+1 WHERE bname='红楼梦';
UPDATE reader SET lennum=lennum+1 WHERE rname='张无忌';
COMMIT;


#编码实现读者‘刘冰冰’缴纳罚金归还图书馆的手续;
START TRANSACTION;
INSERT INTO penalty(rid,bid,pdate,ptype,amount) VALUE('0008','0007','2018-03-25 10:41:50',1,4.6);
UPDATE borrow SET returndate=NOW() WHERE rid='0008' AND nif='0007';
UPDATE reader SET lennum=lennum-1 WHERE rid='刘冰冰';
UPDATE book SET bcount=bcount+1 WHERE bname='西游记';
COMMIT;

#创建不同权限的视图
#管理员视图
CREATE VIEW root
AS
SELECT bk.bname AS 图书名称,bw.willdate AS 到期日期,rd.rname AS 读者姓名
FROM borrow bw LEFT JOIN book bk ON bk.bid=bw.nif
LEFT JOIN reader rd ON rd.rid=bw.rid
WHERE bw.returndate IS NULL 
ORDER BY willdate DESC;
#读者视图
CREATE VIEW reader_look
AS
SELECT bk.bname AS 图书名称,bk.bcount AS 馆存量,bk.bcount-COUNT(bw.nif) 可借阅数
FROM book bk RIGHT JOIN borrow bw ON bw.nif=bk.bid
GROUP BY bw.nif

#恢复
CREATE DATABASE controllby;
USE myschoolDB2;
source E:\git\Qbaba\src\main\mySQL\m03\d24\Qbaba