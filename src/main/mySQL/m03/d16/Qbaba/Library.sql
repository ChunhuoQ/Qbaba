CREATE TABLE book(
bid CHAR(1) PRIMARY KEY NOT NULL COMMENT '图书编号',
bName VARCHAR(200) NOT NULL COMMENT'图书书名',
author VARCHAR(200) COMMENT'作者姓名',
pubComp VARCHAR(200)  COMMENT'出版社',
pubDate DATETIME COMMENT'出版日期',
bCount INT  COMMENT'现存数量',
price FLOAT COMMENT'单价'
)

DROP TABLE book;

INSERT INTO book(bid,bName,author,pubComp,pubDate,bCount,price) VALUES ('2','安徒生童话','安徒生','Qbaba出版社','2018-03-16 16:20',200,9.9);

SELECT * FROM book;

CREATE TABLE reader(
rid VARCHAR(20) PRIMARY KEY NOT NULL COMMENT '读者编号',
rName VARCHAR(200) COMMENT'读者姓名',
lendNum INT NOT NULL COMMENT'已借阅数量',
rAddress VARCHAR(200) COMMENT'联系地址'
)
INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES('1','Qbaba',21,'北大青鸟（光谷校区）');
SELECT * FROM reader;
CREATE TABLE borrow(
rid VARCHAR(20)  NOT NULL COMMENT '读者编号',
nif VARCHAR(200)  NOT NULL COMMENT '图书编号',
lendDate DATE  COMMENT '借阅日期',
willDate DATETIME COMMENT '应归还日期',
returnDate TIMESTAMP COMMENT '实际归还日期',
PRIMARY KEY(rid,nif,lendDate)
)
INSERT INTO borrow(rid,nif,lendDate,willDate,returnDate) VALUES('1','1','2018-03-16','2018-03-23','2018-03-25');
DROP TABLE borrow;
SELECT * FROM borrow;
CREATE TABLE penalty(
rid VARCHAR(20)  NOT NULL COMMENT '读者编号',
nif VARCHAR(200)  NOT NULL COMMENT '图书编号',
pDate DATE NOT NULL  COMMENT '罚款日期',
pType INT COMMENT '罚款类型,1-延期，2-损坏，3-丢失',
amount FLOAT COMMENT '罚款金额',
PRIMARY KEY(rid,nif,pDate)
)
INSERT INTO penalty(rid,nif,pDate,pType,amount) VALUES('1','1','2018-03-16',1,99.9);
DROP TABLE penalty;
SELECT * FROM penalty;