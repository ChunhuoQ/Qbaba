CREATE DATABASE problemroot;
DROP TABLE question_info;
CREATE TABLE question_info(
	questionId INT PRIMARY KEY AUTO_INCREMENT COMMENT '试题编号',
	question VARCHAR(300) NOT NULL COMMENT '题干',
	optionA VARCHAR(300) NOT NULL COMMENT '选项A',
	optionB VARCHAR(300) NOT NULL COMMENT '选项B',
	optionC VARCHAR(300) NOT NULL COMMENT '选项C',
	optionD VARCHAR(300) NOT NULL COMMENT '选项D',
	SUBJECT INT   COMMENT '科目' ,
	answer VARCHAR(10)  COMMENT '正确答案'
)COMMENT '试题信息表';
SELECT * FROM question_info;

INSERT INTO question_info(question,optionA,optionB,optionC,optionD,SUBJECT,answer)
VALUE('在JAVA中以下合法的`question_info`变量名是（）','选项A:_sum','选项B：var%','选项C：9var','选项D：My Name',1,'答案：A'),
('以下关于JAVA类和对象描述正确的是（）','选项A:一个类只有一个对象','选项B：对象是类的实例','选项C：对象是对现实世界中客观事物的抽象','选项D：使用class关键字定义一个对象',1,'答案：B'),
('在Winfroms中,消息框的返回值为（）类型','选项A:MessgeBox','选项B：DialogResult','选项C：Yes','选项D：No',2,'答案：B'),
('在C#中,下列非法变量为（）','选项A:￥avg','选项B：count_1','选项C：num%','选项D：3name',2,'答案：C')

SELECT * FROM question_info WHERE SUBJECT=1；
SELECT * FROM question_info  WHERE question LIKE '%变量名%';