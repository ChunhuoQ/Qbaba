#为读者“”张无忌 办理借阅《红楼梦》书籍的手续，要求编码实现。



BEGIN;
	INSERT INTO reader (rid,rname,lennum,raddress) VALUES('0010','张无忌',0,'明教');
	INSERT INTO borrow (rid,nif,lenddate,willdate) VALUES('0010','0006',NOW(),'2018-10-09 17:27:35');
	UPDATE book SET bcount=bcount-1 WHERE bname='红楼梦';
	UPDATE reader SET lennum=lennum+1 WHERE rname='张无忌';
COMMIT;



#编码实现读者‘刘冰冰’缴纳罚金归还图书馆的手续，
#在罚款记录表中增加一条记录‘刘冰冰’因延期归还《西游记》一书而而缴纳滞纳金4.6元
BEGIN;
	INSERT INTO borrow SET rid='0008',nif='0007',lenddate='2018-01-05 09:13:00',willdate='2018-02-01 09:13:07';
	UPDATE book SET bcount=bcount-1 WHERE bid='0007';
	UPDATE reader SET lennum=lennum+1 WHERE rid='0008';
COMMIT;

BEGIN;
	INSERT INTO penalty SET rid='0008',bid='0007',pdate=NOW(),ptype=1,amount=4.6; 
	UPDATE borrow SET returndate=NOW() WHERE rid='0008';
	UPDATE reader SET lennum=lennum-1 WHERE rid IN(SELECT rid FROM borrow WHERE rid='0008');
	UPDATE book SET bcount=bcount+1 WHERE bid IN(SELECT nif FROM borrow WHERE nif='0007');
COMMIT;


#5创建视图
CREATE VIEW checklist AS (
SELECT b.bname AS 图书名称,bo.willdate AS 应归还日期,r.rname AS 作者姓名
FROM  borrow bo
INNER JOIN book b ON b.bid=bo.nif
LEFT OUTER JOIN reader r ON bo.rid=r.rid
WHERE willdate<NOW() AND returndate IS NULL
)
#读者关心图书信息
CREATE VIEW checkl AS (
SELECT b.bname AS 图书名称,b.bcount AS 馆存量,b.bcount-COUNT(bo.nif)AS 可借阅数量
FROM book b 
INNER JOIN borrow bo ON b.bid=bo.nif 
GROUP BY bo.nif
)
# 添加索引
CREATE INDEX index_book_bname
ON book(bname)


