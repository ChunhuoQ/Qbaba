CREATE DATABASE fig;

CREATE TABLE info
(
	id INT PRIMARY KEY,
	NAME VARCHAR(200)
)
SELECT * FROM info;
CREATE TABLE student
(
	sid INT PRIMARY KEY AUTO_INCREMENT, 
	sname VARCHAR(200),
	address VARCHAR(200)
)
INSERT INTO student(sname,address) VALUES('1','吕锐玲','dt59');

CREATE TABLE student2
(
	sid INT PRIMARY KEY AUTO_INCREMENT, 
	sname VARCHAR(200),
	address VARCHAR(200)
)
INSERT INTO student2(sname,address) VALUES('吕锐玲','dt59');
INSERT INTO student2(sname,address) VALUES('吕锐玲2','dt59');
INSERT INTO student2(sname,address) VALUES('吕锐玲3','dt59');
SELECT * FROM student2
SELECT 999+777
SELECT 777+666
SELECT 444+333
UPDATE student2 SET sname='袁大将军';

`fig`
SELECT * FROM info;
CREATE TABLE book
(
	sid INT PRIMARY KEY AUTO_INCREMENT, 
	sname VARCHAR(200),
	address VARCHAR(200)
)
CREATE DATABASE Library;
CREATE TABLE book2
(
	bid VARCHAR(500) PRIMARY KEY COMMENT '图书编号',
	bName VARCHAR(500) NOT NULL COMMENT '图书书名',
	author VARCHAR(500) COMMENT '作者姓名',
	pubComp VARCHAR(500) COMMENT '出版社',
	pubDate DATE COMMENT '出版日期',
	bCount INT COMMENT '现存数量',
	price DOUBLE COMMENT '单价'
)
CREATE TABLE reader
(
rid VARCHAR(500)PRIMARY KEY COMMENT '读者编号',
rName VARCHAR(500) NOT NULL COMMENT '读者姓名',
lendNum INT COMMENT '已借书数量',
rAddress VARCHAR(500)COMMENT '联系地址'
)
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