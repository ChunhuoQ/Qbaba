
SELECT * FROM book;
SELECT * FROM borrow;
SELECT * FROM penalty;
SELECT * FROM reader;

#当前没有被读者借阅的图书信息：
SELECT * FROM book WHERE bid NOT IN(
SELECT nif FROM borrow
);

SELECT * FROM book WHERE bid IN(
 SELECT bid FROM borrow WHERE returndate IS NULL
);

#今年的所有缴纳罚款的读者清单
SELECT reader.`rname` AS '读者',book.`bname`AS'书名',
penalty.`pdate`AS '罚款时间',penalty.`amount`AS'罚款金'FROM
book INNER JOIN penalty ON book.`bid`=penalty.`bid`
INNER JOIN reader ON reader.`rid`=penalty.`bid`;

#地址为空的所有读者尚未归还的图书清单
SELECT borrow.`rid`AS'读者编号',reader.`rname`AS'读者姓名'
,book.`bname`AS'图书名称',borrow.`lenddate`AS'借书日期',
borrow.`returndate`AS'应归还日期'
FROM borrow 

INNER JOIN book ON borrow.`nif`=book.`bid`
INNER JOIN reader ON borrow.`rid`=reader.`rid`
WHERE returndate IS NULL AND borrow.rid IN(
SELECT reader.`rid`FROM reader WHERE rname IN(SELECT rname FROM reader WHERE raddress IS NULL)

);


SELECT * FROM book;
SELECT * FROM penalty;
SELECT * FROM borrow;

SELECT * FROM reader;

#当前没有被读者借阅的图书信息：
SELECT * FROM book WHERE bid NOT IN(
SELECT nif FROM borrow
);

SELECT * FROM book WHERE bid IN(
 SELECT bid FROM borrow WHERE returndate IS NULL
);

#今年的所有缴纳罚款的读者清单
SELECT reader.`rname` AS '读者',book.`bname`AS'书名',
penalty.`pdate`AS '罚款时间',penalty.`amount`AS'罚款金'FROM
book INNER JOIN penalty ON book.`bid`=penalty.`bid`
INNER JOIN reader ON reader.`rid`=penalty.`bid`;

#地址为空的所有读者尚未归还的图书清单
SELECT borrow.`rid`AS'读者编号',reader.`rname`AS'读者姓名'
,book.`bname`AS'图书名称',borrow.`lenddate`AS'借书日期',
borrow.`returndate`AS'应归还日期'
FROM borrow 

INNER JOIN book ON borrow.`nif`=book.`bid`
INNER JOIN reader ON borrow.`rid`=reader.`rid`
WHERE returndate IS NULL AND borrow.rid IN(
SELECT reader.`rid`FROM reader WHERE 
rname IN(SELECT rname FROM reader WHERE raddress IS NULL)

);




