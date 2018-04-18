CREATE DATABASE library3;

SELECT * FROM book;
SELECT * FROM borrow;
SELECT * FROM penalty;
SELECT * FROM reader;

BEGIN;
UPDATE penalty SET amount=amount+4.6 WHERE rid='0008';
INSERT INTO borrow(rid,nif,lenddate,willdate,returndate) VALUES('0008','0006','2017-09-12 09:11:19','2018-01-22 09:20:06',NOW());
UPDATE reader SET lennum=lennum-1 WHERE rid='0008';
UPDATE book SET bcount=bcount+1 WHERE bid='0007';
COMMIT;