CREATE DATABASE Library;

CREATE TABLE book
(
	bid VARCHAR(200) PRIMARY KEY COMMENT '图书编号',
	bName VARCHAR(200) NOT NULL COMMENT '图书书名',
	author VARCHAR(200) COMMENT '作者姓名',
	pubComp VARCHAR(200) COMMENT '出版社',
	pubDate DATE COMMENT '出版日期',
	bCount INT COMMENT '现存数量',
	price DOUBLE COMMENT '单价'
)COMMENT='图书信息表';

SELECT * FROM book;

CREATE TABLE reader
(
	rid VARCHAR(200) PRIMARY KEY COMMENT '读者编号',
	rName VARCHAR(200) NOT NULL COMMENT '读者姓名',
	lendNum INT COMMENT '已借书数量',
	rAddress VARCHAR(200) COMMENT '联系地址'
)COMMENT='读者信息表';

SELECT * FROM reader;

CREATE TABLE borrow
(
	rid VARCHAR(200) COMMENT '读者编号',
	nif VARCHAR(200) COMMENT '图书编号',
	lendDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '借阅日期',
	willDate DATE COMMENT '应归还日期',
	returnDate DATE COMMENT '实际归还日期',
	PRIMARY KEY(rid,nif,lendDate)
)COMMENT='图书借阅表';

SELECT * FROM borrow;

CREATE TABLE penalty
(
	rid VARCHAR(200) COMMENT '读者编号',
	bid VARCHAR(200) COMMENT '图书编号',
	pDate DATE COMMENT '罚款日期',
	pType ENUM('1','2','3') DEFAULT '1' COMMENT '罚款类型',
	amount DOUBLE COMMENT '罚款金额',
	PRIMARY KEY(rid,bid,pDate)
)COMMENT='罚款记录表';

DROP TABLE penalty;

SELECT * FROM penalty;

DROP TABLE moneyType;


DROP TABLE class;

#alter table penalty add constraint fk_penalty_moneyType foreign key(pType) references moneyType(sid);

