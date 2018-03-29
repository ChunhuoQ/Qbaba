# 存储过程：输出所有题目
USE problemroot;
DELIMITER ;;
CREATE PROCEDURE  cre_all()
BEGIN
  SELECT * FROM question_info;
END
;;
DELIMITER ;
CALL cre_all;
# 存储过程： 模糊查询（题干）
DELIMITER ;;
CREATE PROCEDURE  cre_qeu(IN qeu NVARCHAR(200))
BEGIN
  SELECT * FROM question_info WHERE  question LIKE  CONCAT('%',qeu,'%');
END
;;
DELIMITER ;

CALL cre_qeu('变量名')