SELECT ht.htname AS 房屋类型,su.uname AS 客户姓名,hd.dname AS 区县,hs.`SName`AS 街道
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE hd.`DID` IN(
	SELECT hd.`DID` FROM hos_house ho
		INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
		INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
		GROUP BY hd.`DID` HAVING COUNT(*)>1
)
ORDER BY ht.`HTName`

#明细表
SELECT  '季度','区县','街道','户型','数量'
FROM hos_house ho WHERE 1=2
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,'合计','','',COUNT(ho.hmid) AS 数量 FROM hos_house ho WHERE QUARTER(ho.`HTIME`)=1
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="朝阳区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="朝阳区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="海淀区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="海淀区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="西城区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=1 AND hd.`DName`="西城区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,'合计','','',COUNT(ho.hmid) AS 数量 FROM hos_house ho WHERE QUARTER(ho.`HTIME`)=2
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="东城区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="东城区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="海淀区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="海淀区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="西城区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=2 AND hd.`DName`="西城区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,'合计','','',COUNT(ho.hmid) AS 数量 FROM hos_house ho WHERE QUARTER(ho.`HTIME`)=3
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=3 AND hd.`DName`="东城区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=3 AND hd.`DName`="东城区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)
UNION
SELECT QUARTER(ho.`HTIME`)AS 季度,hd.dname AS 区县,'小计','',COUNT(ho.hmid) AS 数量 FROM hos_house ho 
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
WHERE QUARTER(ho.`HTIME`)=3 AND hd.`DName`="海淀区"
UNION
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
WHERE QUARTER(ho.`HTIME`)=3 AND hd.`DName`="海淀区"
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)


#粗略表
SELECT  QUARTER(ho.`HTIME`) AS 季度,hd.dname AS 区县,hs.`SName`AS 街道,ht.`HTName`AS 户型,COUNT(ho.hmid) AS 数量
FROM hos_house ho
INNER JOIN sys_user su ON ho.`UID`=su.`UID`
INNER JOIN hos_street hs ON ho.`SID`=hs.`SID`
INNER JOIN hos_district hd ON hs.`SDID`=hd.`DID`
INNER JOIN hos_type ht ON ho.`HTID`=ht.`HTID` 
GROUP BY hd.`DName`,hs.`SName`,ht.`HTName`,QUARTER(ho.`HTIME`)

