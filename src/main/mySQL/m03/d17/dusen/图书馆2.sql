SELECT a.`bid` AS 图书编号,a.`bname` AS 书名,a.`author` AS 作者,a.`pubcomp` AS 出版社,a.`pubDate` AS 出版时间,a.`bcount` AS 单价 FROM book a WHERE bid NOT IN(
    SELECT b.nif FROM borrow b WHERE  b.`returndate`
)


# work2 使用子查询获得今年的所有缴纳罚款的读者清单，
#要求输出的数 据包包括读者的姓名，图书名称，罚款日期和缴纳罚金等
#罚款日期  罚款金额
SELECT p.pdate AS 罚款日期,p.amount AS 罚款金额 FROM penalty p WHERE YEAR(p.pdate)=2018

#图书名
SELECT bname AS 图书名 FROM book WHERE bid IN(
   SELECT b.bid AS 图书编号 FROM penalty b WHERE b.pdate IN(
       SELECT a.pdate AS 罚款日期 FROM penalty a WHERE YEAR(a.pdate)=2018
)
)

#读者名

SELECT r.rName AS 读者姓名 FROM reader r WHERE r.rid IN(
SELECT b.rid AS 读者编号 FROM penalty b WHERE b.pdate IN(
       SELECT a.pdate AS 罚款日期 FROM penalty a WHERE YEAR(a.pdate)=2018
)
)

# work2 使用子查询获得今年的所有缴纳罚款的读者清单，
#要求输出的数 据包包括读者的姓名，图书名称，罚款日期和缴纳罚金等
SELECT bname AS 图书名,r.rName AS 读者姓名,p.pdate AS 罚款日期,p.amount AS 罚款金额 
FROM book b,reader r,penalty p WHERE r.rid=p.rid AND b.bid=p.bid AND p.bid IN(
    SELECT bid AS 图书编号 FROM penalty WHERE pdate IN(
    SELECT pdate AS 罚款日期 FROM penalty  WHERE YEAR(pdate)=2018
)
)

#使用子查询获得地址为空的所有读者尚未归还的图书清单
SELECT r.rid AS 读者编号,r.rname AS 读者姓名,b.bname AS 图书名称,br.lenddate AS 借阅日期,
br.willdate AS 应当归还日期 FROM reader r,book b,borrow br  
WHERE r.rid=br.rid AND b.bid=br.nif AND r.rid IN(
    SELECT rid FROM reader WHERE raddress IS NULL
)ORDER BY lenddate DESC