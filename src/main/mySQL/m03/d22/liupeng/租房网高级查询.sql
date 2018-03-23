SELECT * FROM hos_district;

SELECT * FROM hos_house;

SELECT * FROM hos_street;

SELECT * FROM hos_type;

SELECT * FROM sys_user;

#根据户型和房屋所在区县、街道为至少有2个街道有房屋出租
#的区县制作出租房屋清单
SELECT HMID,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
(SELECT UName FROM sys_user AS u WHERE UID=h.`UID`) AS 客户名,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道
FROM hos_house AS h
WHERE (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) NOT IN (
	SELECT
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区 FROM hos_house AS h
GROUP BY 区
HAVING COUNT(区)<2
);

#按季度统计当年发布各区县各街道各种户型房屋出租数量
#要求：输出当年1月1日至今的全部出租房屋数量、
#输出各区县出租房屋出租房屋数量

#季度显示
SELECT '季度','区县','房屋所在街道','房屋类型','房屋数量' FROM hos_house AS h WHERE 1=2
UNION ALL
SELECT '1','合计','','',COUNT(CEIL(MONTH(HTIME)/3)) FROM hos_house WHERE CEIL(MONTH(HTIME)/3)=1
UNION ALL
SELECT '1','朝阳区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='朝阳区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='朝阳区'
GROUP BY 区县,房屋所在街道,房屋类型
UNION ALL
SELECT '1','海淀区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
GROUP BY 区县,房屋所在街道,房屋类型
UNION ALL
SELECT '1','西城区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='西城区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='西城区'
GROUP BY 区县,房屋所在街道,房屋类型


UNION ALL
SELECT '2','合计','','',COUNT(CEIL(MONTH(HTIME)/3)) FROM hos_house WHERE CEIL(MONTH(HTIME)/3)=2
UNION ALL
SELECT '2','东城区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='东城区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=2 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='东城区'
GROUP BY 区县,房屋所在街道,房屋类型
UNION ALL
SELECT '2','海淀区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=2 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=2 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
GROUP BY 区县,房屋所在街道,房屋类型
UNION ALL
SELECT '2','西城区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=1 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='西城区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=2 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='西城区'
GROUP BY 区县,房屋所在街道,房屋类型

UNION ALL
SELECT '3','合计','','',COUNT(CEIL(MONTH(HTIME)/3)) FROM hos_house WHERE CEIL(MONTH(HTIME)/3)=3
UNION ALL
SELECT '3','东城区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=3 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='东城区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=3 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='东城区'
GROUP BY 区县,房屋所在街道,房屋类型
UNION ALL
SELECT '3','海淀区','小计','',COUNT(*) FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=3 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
UNION ALL
SELECT CEIL(MONTH(HTIME)/3) AS 季度,
(SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
)) AS 区县,
(SELECT sName FROM hos_street AS s WHERE SID=h.`SID`) AS 房屋所在街道,
(SELECT HTName FROM hos_type AS t WHERE HTID=h.`HTID`) AS 房屋类型,
COUNT(*) AS 房屋数量
FROM hos_house AS h WHERE CEIL(MONTH(HTIME)/3)=3 AND (SELECT DName FROM hos_district WHERE DID IN(
	SELECT SDID FROM hos_street WHERE SID=h.`SID`
))='海淀区'
GROUP BY 区县,房屋所在街道,房屋类型


