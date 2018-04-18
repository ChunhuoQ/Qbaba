USE house;
SELECT * FROM hos_house;
#分页查询第六到十条的信息。
SELECT * FROM hos_house LIMIT 5,5;






/*
根据户型和房屋所在区县和街道，为至少有两个街道有出租屋的区县制作出租屋清单。
*/

SELECT hos_type.HTName AS '户型', sys_user.UName AS'姓名', hos_district.DName AS'区县', hos_street.SName AS '街道' 
FROM hos_house
INNER JOIN hos_street ON hos_house.SID=hos_street.SID
INNER JOIN hos_district ON hos_street.SDID=hos_district.DID
INNER JOIN sys_user ON sys_user.UID=hos_house.UID
INNER JOIN hos_type ON hos_type.HTID=hos_house.HTID
WHERE hos_district.DID IN(SELECT hos_district.DID 
                       FROM hos_house
                       INNER JOIN hos_street ON hos_house.SID=hos_street.SID
                       INNER JOIN hos_district ON hos_street.SDID=hos_district.DID
                       GROUP BY hos_district.DID
                       HAVING COUNT(*)=2 OR COUNT(*)>2 )
                       
                       
 /*
 按季度统计本年发布的房屋出租信息                      
*/

 