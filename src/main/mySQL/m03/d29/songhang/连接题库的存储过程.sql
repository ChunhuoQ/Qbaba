# 存储过程：输出所有的考试题目
USE problemroot;

DELIMITER ;;

CREATE PROCEDURE cre_all()

BEGIN
SELECT*FROM question_info;

END
;;
DELIMITER ;

CALL cre_all;
#存储过程：模糊查询（题干）,用存储过程传递一个参数
DELIMITER ;;
CREATE PROCEDURE cre_que_like(IN )
BEGIN


END

;;

DELIMITER ;