DROP TABLE IF EXISTS `comment_info`;

CREATE TABLE `comment_info` (
  `comment_id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) DEFAULT NULL,
  `ip` VARCHAR(20) DEFAULT NULL,
  `content` VARCHAR(200) DEFAULT NULL,
  `news_id` INT(11) DEFAULT NULL,
  `fbtime` DATETIME DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk;

/*Data for the table `comment_info` */

INSERT  INTO `comment_info`(`comment_id`,`username`,`ip`,`content`,`news_id`,`fbtime`) VALUES (1,'admin','192','你好',1,'2017-06-10 14:33:48'),(2,'鲁直伸','192','他不好',1,'2017-06-05 14:34:10'),(3,'小明','192','都很好',1,'2017-06-03 14:34:34'),(4,'大明','192','非常好',1,'2017-02-02 14:34:51'),(5,'明明','168','今天下雨了！',1,'2016-12-02 14:35:17');

/*Table structure for table `info` */

DROP TABLE IF EXISTS `info`;

CREATE TABLE `info` (
  `id` VARCHAR(50) NOT NULL,
  `province` VARCHAR(200) DEFAULT NULL,
  `city` VARCHAR(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `info` */

INSERT  INTO `info`(`id`,`province`,`city`) VALUES ('420','湖北','沙市'),('421','湖北','松滋'),('422','湖北','公安'),('423','广东','佛山');

/*Table structure for table `news_info` */

DROP TABLE IF EXISTS `news_info`;

CREATE TABLE `news_info` (
  `news_id` INT(11) NOT NULL AUTO_INCREMENT,
  `type_id` INT(11) DEFAULT NULL,
  `news_title` VARCHAR(50) DEFAULT NULL,
  `news_author` VARCHAR(20) DEFAULT NULL,
  `news_summary` VARCHAR(200) DEFAULT NULL,
  `news_content` VARCHAR(500) DEFAULT NULL,
  `news_pic` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=INNODB AUTO_INCREMENT=16 DEFAULT CHARSET=gbk;

/*Data for the table `news_info` */

INSERT  INTO `news_info`(`news_id`,`type_id`,`news_title`,`news_author`,`news_summary`,`news_content`,`news_pic`) VALUES (8,2,'今天出太阳了','小明','楚天都市报',NULL,'8.jpg'),(9,1,'昨天是阴天','无语','花花日报',NULL,'9.jpg'),(10,10,'大大','小小','在一起',NULL,'10.jpg'),(11,5,'谢挺锋离婚了','王飞','武汉日报',NULL,'8.jpg'),(12,3,'谢挺锋又结婚了','王飞','武汉晚报',NULL,'7.jpg'),(13,1,'阿杀','吹死','武汉晨报',NULL,'1.jpg'),(14,2,'洗脚城','相关领导','相关部门',NULL,'2.jpg'),(15,3,'东莞洗脚城','有关领导','相关部门',NULL,'3.jpg');

/*Table structure for table `news_type` */

DROP TABLE IF EXISTS `news_type`;

CREATE TABLE `news_type` (
  `type_id` INT(11) NOT NULL AUTO_INCREMENT,
  `type_name` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=INNODB DEFAULT CHARSET=gbk;

/*Data for the table `news_type` */

/*Table structure for table `suser` */

DROP TABLE IF EXISTS `suser`;

CREATE TABLE `suser` (
  `sid` INT(11) NOT NULL AUTO_INCREMENT,
  `sname` VARCHAR(20) DEFAULT NULL,
  `spwd` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `suser` */

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) DEFAULT NULL,
  `password` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

/*Data for the table `user_info` */

INSERT  INTO `user_info`(`user_id`,`username`,`password`) VALUES (2,'jack','123'),(3,'admin','123');

/* Procedure structure for procedure `p5` */

/*!50003 DROP PROCEDURE IF EXISTS  `p5` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `p5`(p INT)
SET @x = p */$$
DELIMITER ;

/* Procedure structure for procedure `productpricing` */

/*!50003 DROP PROCEDURE IF EXISTS  `productpricing` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `productpricing`()
BEGIN
   SELECT * FROM info;
END */$$
DELIMITER ;

/* Procedure structure for procedure `test_case` */

/*!50003 DROP PROCEDURE IF EXISTS  `test_case` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `test_case`(in x int)
begin  
case x  
when 1 then select 'OK';  
when 0 then select 'No';  
else select 'good';  
end case;  
end */$$
DELIMITER ;

/* Procedure structure for procedure `test_while` */

/*!50003 DROP PROCEDURE IF EXISTS  `test_while` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `test_while`(out sum int)
begin  
declare i int default 1;  
declare s int default 0;  
while i<=10 do  
set s = s+i;  
set i = i+1;  
end while;  
set sum = s;  
end */$$
DELIMITER ;

/* Procedure structure for procedure `ups_info` */

/*!50003 DROP PROCEDURE IF EXISTS  `ups_info` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ups_info`()
BEGIN
   SELECT * FROM info;
END */$$
DELIMITER ;

/* Procedure structure for procedure `ups_info2` */

/*!50003 DROP PROCEDURE IF EXISTS  `ups_info2` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `ups_info2`()
BEGIN
   SELECT * FROM TbScore;
END */$$
DELIMITER ;

/* Procedure structure for procedure `usp_AddScoreXML` */

/*!50003 DROP PROCEDURE IF EXISTS  `usp_AddScoreXML` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_AddScoreXML`()
BEGIN
  UPDATE TbScore SET Score=Score+3 WHERE SUBJECT='XML' AND Score<98;
  SET @n= (SELECT COUNT(*) FROM TbScore WHERE Score>60 AND SUBJECT='XML')/(SELECT COUNT(*) FROM TbScore WHERE SUBJECT='XML');
  WHILE @n<0.7 DO
       UPDATE TbScore SET Score=Score+3 WHERE SUBJECT='XML' AND Score<98;
       SET @n= (SELECT COUNT(*) FROM TbScore WHERE Score>60 AND SUBJECT='XML')/(SELECT COUNT(*) FROM TbScore WHERE SUBJECT='XML');
   END WHILE ; 
END */$$
DELIMITER ;

/* Procedure structure for procedure `u_head_and_low_pro` */

/*!50003 DROP PROCEDURE IF EXISTS  `u_head_and_low_pro` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `u_head_and_low_pro`()
begin
  DECLARE n int DEFAULT 10;
    SET n = n -1;
    WHILE n > 0 DO
            SELECT n;
            set n = n - 1;
  END WHILE;
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
