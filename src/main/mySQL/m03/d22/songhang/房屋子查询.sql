SELECT * FROM hos_district;
SELECT * FROM hos_house;
SELECT * FROM hos_street;
SELECT * FROM hos_type;
SELECT * FROM sys_user;

/*
需求说明：根据户型和房屋所在的区县和街道，为至少有两个街道有出租房屋的区县制作出租房屋清单
提示：先使用having子句筛选出街道数量大于1的区县

*/

SELECT t.`HTName`AS 户型,u.`UName`AS 姓名,d.`DName`AS 区县,s.`SName`AS 街道 
FROM hos_house h 
INNER JOIN hos_type t ON t.`HTID`=h.`HTID`
INNER JOIN sys_user u ON u.`UID`=h.`UID`
INNER JOIN hos_street s ON s.`SID`=h.`SID`
INNER JOIN hos_district d ON d.`DID`=s.`SDID`
WHERE d.`DName`IN(
  SELECT DName FROM(
  SELECT*,COUNT(s.`SDID`)AS 街道数 
  FROM hos_district d 
  INNER JOIN hos_street s ON s.`SDID`=d.`DID`
  GROUP BY s.`SDID`
  HAVING 街道数>1
  ) AS 两条街道数

)ORDER BY 户型


/*select d.`DName` as 区县名,count(s.`SDID`) as 街道数 from hos_district d 
inner join hos_street s on s.`SDID`=d.`DID` 
group by s.`SDID`
having 街道数>=2*/

/*
按季度统计出本年各区县各街道各种户型房屋出租数量
要求输出 2016年从1月1日起至今 的 全部出租房屋数量，各区县出租房屋数量 及 各街道户型出租房屋数量

*/
SELECT QUARTER(HTIME) AS 季度
FROM
(
  SELECT h.`SID`,h.`HTID`,COUNT(*) cnt,QUARTER(HTIME)
  FROM hos_house h
  WHERE QUARTER(HTIME)=1
  GROUP BY QUARTER(HTIME),h.`SID`,h.`HTID`

)AS tmp
INNER JOIN sys_user u ON h.`SID`=u.`UID`
INNER JOIN hos_street s ON s.`SID`=h.`SID`
INNER JOIN hos_district d ON d.`DID`=s.`SDID`
INNER JOIN hos_type t ON t.`HTID`=h.`HTID`

/*不会做，没有理清思路*/
