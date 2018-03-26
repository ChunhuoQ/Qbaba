CREATE DATABASE library2;

CREATE TABLE borrow(
	sid INT,
	stime DATE,
	srecord INT
);

INSERT INTO borrow(sid,stime,srecord) VALUES(1,NOW(),0);

SELECT * FROM borrow;

CREATE TABLE book(
	sid INT,
	sbook VARCHAR(20),
	scount INT
);

INSERT INTO book(sid,sbook,scount) VALUES(1,'红楼梦',100);

SELECT * FROM book;

CREATE TABLE reader(
	sid INT,
	costom VARCHAR(20),
	scount INT
);

INSERT INTO reader(sid,costom,scount) VALUES(1,'张无忌',0);

SELECT * FROM reader;

BEGIN;
UPDATE borrow SET srecord=srecord+1;
UPDATE book SET scount=scount-1;
UPDATE reader SET scount=scount+1;
COMMIT;

