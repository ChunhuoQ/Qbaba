#由于在写入数据时有些重复  所以数据会有些多
#按区县制作房屋出租清单
#需求：
/*
根据户型和房屋所在区县、街道
为至少有2个街道有房屋出租的区县
制作除租房屋清单
*/
SELECT t.`HTName`AS 户型,u.`UName` AS 姓名,d.`DName`AS 区县,s.`SName` AS 街道 
FROM hos_house h INNER JOIN sys_user u ON u.`UID`=h.`UID`
INNER JOIN hos_type t ON  t.`HTID`=h.`HTID` 
INNER JOIN hos_street s ON s.`SID`=h.`SID`
INNER JOIN hos_district d ON d.`DID`=s.`SDID` 
WHERE d.`DName` IN(
	SELECT DName FROM
	(SELECT *,COUNT(*)AS 街道数 FROM hos_street s
	INNER JOIN hos_district d ON d.`DID`=s.`SDID` GROUP BY s.`SDID`
	HAVING 街道数>1) AS 两条街道的区县
) 

/*SELECT TOPIC FROM (SELECT SName FROM hos_street WHERE SDID IN(
SELECT SDID FROM (SELECT *,COUNT(*)AS 街道数 FROM hos_street s
	INNER JOIN hos_district d ON d.`DID`=s.`SDID` GROUP BY s.`SDID`
	HAVING 街道数>1) AS 两条街道的区县))AS SName 
	INNER JOIN hos_house h ON h.`TOPIC`=SName


SELECT * FROM hos_house WHERE SID IN(
SELECT SID FROM hos_street s WHERE s.`SName` IN(
SELECT s.`SName` FROM hos_street s LEFT JOIN hos_district d
ON d.`DID`=s.`SDID`WHERE d.`DName` IN(
	SELECT DName FROM
	(SELECT *,COUNT(*)AS 街道数 FROM hos_street s
	INNER JOIN hos_district d ON d.`DID`=s.`SDID` GROUP BY s.`SDID`
	HAVING 街道数>1) AS 两条街道的区县
)
)
)
*/



# 按季度统计当年发布的房屋
/*
需求： 按季度统计当年各区县各街道各种户型房屋出租数量
输出：  当年1月1日至今的全部出租房屋数量、输出各区县出
租房屋数量以及各街道、户型出租房屋数量
*/
#由于数据创了多了一些  hos_house的数据有24条，房屋数量总数有24条
#请选中以下全部代码(106行)。 
SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
UNION ALL SELECT 当前季度,'合计'区县,'','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=1
UNION ALL SELECT 当前季度,'合计'区县,'','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=2
UNION ALL SELECT 当前季度,'合计'区县,'','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=3
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=1 AND 区县='海淀区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=1 AND 区县='西城区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=1 AND 区县='朝阳区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=2 AND 区县='东城区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=2 AND 区县='海淀区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=2 AND 区县='西城区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=3 AND 区县='海淀区' 
UNION ALL SELECT 当前季度,区县,'小计','',SUM(房屋数量) FROM (SELECT QUARTER(HTIME) AS 当前季度,d.`DName` AS 区县,
s.`SName` AS 街道,t.`HTName` AS 户型,COUNT(s.`SID`)AS 房屋数量
FROM hos_house h LEFT JOIN hos_street s ON h.`SID`=s.`SID`
LEFT JOIN hos_district	d ON d.`DID`=s.`SDID`
LEFT JOIN hos_type t ON t.`HTID`=h.`HTID`
WHERE h.`HTIME` AND h.`HTID`
GROUP BY h.`TOPIC`
ORDER BY 当前季度 ASC) AS BIAO
WHERE 当前季度=3 AND 区县='东城区' 
ORDER BY 当前季度 ASC,房屋数量 DESC



