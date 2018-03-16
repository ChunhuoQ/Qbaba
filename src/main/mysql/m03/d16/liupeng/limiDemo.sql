CREATE DATABASE DT59;

CREATE TABLE class
(
	sid INT PRIMARY KEY AUTO_INCREMENT,
	sname VARCHAR(30),
	address VARCHAR(30)
)

INSERT INTO class(sname,address) VALUES('高世庆','孝感');
INSERT INTO class(sname,address) VALUES('吕锐玲','荆门');
INSERT INTO class(sname,address) VALUES('杜森','宜昌');
INSERT INTO class(sname,address) VALUES('宋杭','仙桃');
INSERT INTO class(sname,address) VALUES('刘朋','荆州');
INSERT INTO class(sname,address) VALUES('刘文','仙桃');
INSERT INTO class(sname,address) VALUES('刘涛','黄陂');
INSERT INTO class(sname,address) VALUES('郑河洋','仙桃');
INSERT INTO class(sname,address) VALUES('吕威','咸宁');
INSERT INTO class(sname,address) VALUES('杨奎','襄阳');

SELECT * FROM class;

SELECT sid,sname,address
FROM class
ORDER BY sid
LIMIT 3;

SELECT sid,sname,address
FROM class
ORDER BY sid
LIMIT 3,3;