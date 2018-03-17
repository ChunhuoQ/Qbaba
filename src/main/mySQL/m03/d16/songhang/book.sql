CREATE DATABASE library;
 
 CREATE TABLE book(
   bid CHAR(1) PRIMARY KEY NOT NULL COMMENT '图书编号',
   bname VARCHAR(50) COMMENT'书名',
   author VARCHAR(50) COMMENT'作者姓名',
   pubComp VARCHAR(50) COMMENT'出版社',
   pubDate DATE COMMENT'出版日期',
   bCount INT COMMENT'现存数量',
   price FLOAT COMMENT'单价'
)

 SELECT * FROM book;
 
 INSERT INTO book(bid,bname,author,pubComp,pubDate,bCount,price)VALUES(
 '1',
 '人生',
 '卡耐基',
 '长江出版',
 '2010-12-12',
 10,
 15.5
 );
 
 CREATE TABLE reader(
 rid VARCHAR(200) PRIMARY KEY NOT NULL COMMENT'读者编号',
 rName VARCHAR(200) NOT NULL COMMENT'读者姓名',
 lendNum INT COMMENT '借书数量',
 rAddress VARCHAR(200) COMMENT '联系地址'
 );
 
 INSERT INTO reader(
 rid,
 rName,
 lendNum,
 rAddress
 )
 VALUES(
'1',
'高事情',
'2',
'武汉丁字桥'
);

SELECT * FROM reader;

CREATE TABLE borrow(
rid VARCHAR(200) NOT NULL,
nif VARCHAR(200) NOT NULL,
lendDate DATETIME NOT NULL,
willDate DATE,
returnDate DATE,
PRIMARY KEY(rid,nif,lendDate)
);
INSERT INTO borrow(
rid,
nif,
lendDate,
willDate,
returnDate
)
VALUES(
'1',
'01',
'2018-03-16',
'2018-03-17',
'2018-03-18'
);

SELECT * FROM borrow;

CREATE TABLE penalty(
rid VARCHAR(200) NOT NULL,
bid VARCHAR(200) NOT NULL,
pDate DATETIME NOT NULL,
pType INT,
amount FLOAT,
PRIMARY KEY(rid,bid,pDate)
);

INSERT INTO penalty(
rid,
bid,
pDate,
pType,
amount
)
VALUES(
'1',
'03',
'2018-03-16',
1,
'15.5'
);

SELECT * FROM penalty;

#分页
CREATE TABLE student(
 sid VARCHAR(20) PRIMARY KEY,
 sName VARCHAR(20),
 sAdress VARCHAR(20)
);
SELECT * FROM student;
INSERT INTO student(sid,sName,sAdress) VALUES(1,'高手','孝感');

SELECT sid,sName,sAdress
FROM student
ORDER BY sid
LIMIT 2,3
