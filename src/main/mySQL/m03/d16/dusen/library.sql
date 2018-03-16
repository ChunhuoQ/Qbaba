CREATE DATABASE library

SHOW DATABASE library

USE library

CREATE TABLE bookinfo(
   bid INT(4) AUTO_INCREMENT NOT NULL COMMENT'图书编号' PRIMARY KEY ,
   baName VARCHAR(200) NOT NULL COMMENT'图书书名',
   author VARCHAR(200) COMMENT'作者姓名',
   pubComp VARCHAR(200) COMMENT'出版社',
   pubDate DATE COMMENT'出版日期',
   bCount INT(4) COMMENT'现存数量',
   price DOUBLE(6,2) COMMENT'单价'
)
#添加信息
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(1,'小说','什么','新华','2018-03-16',200,10.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(2,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(3,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(4,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(5,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(6,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(7,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(8,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(9,'小说1','什么1','新华','2018-03-16',200,30.00);
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(10,'小说1','什么1','新华','2018-03-16',200,30.00);

#分页 1 。。。。。。。。。。。。。。。。。。。。。。
SELECT bid,baName,author,pubComp,pubDate,bCount,price 
FROM bookinfo

ORDER BY bid
LIMIT 0,3;

#分页 2 。。。。。。。。。。。。。。。。。。。。。。
SELECT bid,baName,author,pubComp,pubDate,bCount,price 
FROM bookinfo

ORDER BY bid
LIMIT 3,3;

#分页 3 。。。。。。。。。。。。。。。。。。。。。。
SELECT bid,baName,author,pubComp,pubDate,bCount,price 
FROM bookinfo

ORDER BY bid
LIMIT 6,3;

#分页 4 。。。。。。。。。。。。。。。。。。。。。。
SELECT bid,baName,author,pubComp,pubDate,bCount,price 
FROM bookinfo

ORDER BY bid
LIMIT 9,3;


CREATE TABLE reader(
rid VARCHAR(200) NOT NULL COMMENT'读者编号',
rName VARCHAR(200) NOT NULL COMMENT'读者姓名',
lendNum INT(4) COMMENT '以借阅数量',
rAddress VARCHAR(200) COMMENT'联系地址'
)

INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES(1,'张山',100,'梁山')
INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES(2,'李四',100,'梁山')
INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES(3,'王五',100,'梁山')
INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES(4,'李六',100,'梁山')
INSERT INTO reader(rid,rName,lendNum,rAddress) VALUES(5,'牛牛',100,'梁山')

CREATE TABLE borrow(
 rid VARCHAR(200) NOT NULL COMMENT'读者编号',
 nif VARCHAR(200) NOT NULL COMMENT'图书编号',
 lenDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT'借阅日期',
 willDate DATETIME COMMENT'应当归还日期',
 returDate DATETIME COMMENT'实际归还日期',
 PRIMARY KEY(rid,nif,lenDate)
)

CREATE TABLE penalty(
 rid VARCHAR(200) NOT NULL COMMENT'读者编号',
 bid VARCHAR(200) NOT NULL COMMENT'图书编号',
 pDate DATETIME NOT NULL COMMENT'罚款日期',
 pType INT(4) COMMENT'罚款类型',
 amout DOUBLE(6,2) COMMENT'罚款金额',
 PRIMARY KEY(rid,bid,pDate)
)
INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(1,'小说','什么','新华','2018-03-16',200,10.00)

INSERT INTO bookinfo(bid,baName,author,pubComp,pubDate,bCount,price) VALUES(2,'小说1','什么1','新华','2018-03-16',200,30.00)

