#创建一个数据库
CREATE DATABASE indexlimit;
#创建一个表
CREATE TABLE slinmit(
 stype1 INT NOT NULL,
 stype2 INT NOT NULL
)
INSERT INTO slinmit(stype1,stype2) VALUE(50,100);


SELECT * FROM slinmit ;
SELECT stype1,stype2
FROM slinmit
ORDER BY  stype1
LIMIT 0,3;