/*
为读者”张无忌“办理借阅《红楼梦》书籍的手续，要求编码实现

提示：在图书借阅表中增加一条图书借阅的同时，
      将图书信息表中此书的当前数量减1，
      在读者信息表中为“张无忌”记录已借书数量列加1
*/

INSERT INTO borrow (rid,nif,lenddate,willdate,returndate)
VALUES('0010','0006','2018-03-24 14:10:48','2018-03-29 00:00:00','2018-03-28 00:00:00'
    )
    INSERT INTO reader (rid,rname,lennum,raddress)VALUES('0010','张无忌','0','')
    
    SELECT*FROM borrow;
    SELECT*FROM book;
    SELECT*FROM reader;
    
    BEGIN;  
    UPDATE book SET bcount=bcount-1 WHERE bname='红楼梦';   
    UPDATE reader SET lennum=lennum+1 WHERE rname='张无忌';       
    COMMIT;
    
       /*
    编码实现读者“刘冰冰”缴纳罚金归还图书的手续，要求编码实现。
       在罚款记录表中增加一条记录，记录“刘冰冰”因延期归还《西游记》一书而缴纳滞纳金4.6元
       在图书借阅表中修改归还日期为当前日期
       将读者信息表中已借书数量减1
       将图书信息表中现存数量加1
    */
    SELECT*FROM borrow;
    SELECT*FROM book;
    SELECT*FROM reader;
    SELECT*FROM penalty;
BEGIN;
INSERT INTO penalty (rid,bid,pdate,ptype,amount) VALUES ('0008','0007','2018-10-29','1','4.6');
UPDATE reader SET lennum=lennum+1 WHERE rid=0008
UPDATE borrow SET returndate=NOW()WHERE rid=0008
UPDATE reader SET lennum=lennum-1 WHERE rid=0008
UPDATE book SET bcount=bcount+1 WHERE bid=0007

  COMMIT;  
  
  
  /*在图书馆日常工作中，
  图书馆管理员希望及时得到最新的到期图书清单，
  包括图书名称，到期日期和读者姓名等信息；
  而读者则关心各种图书信息，如图书名称，馆存量和可借阅数量等
  请编写代码按上面的需求
  在图书名称字段创建索引，
  为图书馆管理员和读者分别创建不同的查询视图
  
  并利用所创建的索引和视图获得相关的数据*/
  
  CREATE VIEW vw_book
  AS
     SELECT book.`bname`AS 图书名称,borrow.`willdate`AS 到期日期,reader.`rname`AS 读者姓名 
     FROM book
     INNER JOIN borrow  ON borrow.`rid`=book.`bid`
     INNER JOIN reader ON book.`bid`=reader.`rid`
     
     SELECT 图书名称,到期日期,读者姓名 
     FROM vw_book
     #添加索引
     CREATE INDEX index_book_bname
     ON book(bname)
     
     SHOW INDEX FROM book ;
     
     
     CREATE VIEW vw_reader
     AS
        SELECT
         book.`bname` AS 图书名称,
         book.`bcount` AS 管存量,
         book.`bcount`-COUNT(borrow.`nif`)AS 可借阅数量
        FROM book
        INNER JOIN borrow ON book.`bid`=borrow.`nif`
        GROUP BY borrow.`nif`
        
        SELECT*FROM vw_reader;
    