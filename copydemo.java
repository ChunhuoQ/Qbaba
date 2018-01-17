mport java.util.Scanner;


public class Breakfast {

	public static void main(String[] args) {
		
	
	
	System.out.println("请输入今天的心情:");

	Scanner scanner = new Scanner(System.in);
	String key= scanner.next();
  
	
	switch (key) {
	case "心情很好":{
		System.out.println("吃包子");
		
		break;}
	case "心情一般般":{
		System.out.println("吃馒头");
		
		break;}
case "心情不是很好":{
	System.out.println("吃鸡蛋");
	
	break;}
case "心情很差":{
	System.out.println("吃面条");
	
	break;}
	case "心情非常差":{
		System.out.println("想吃啥吃啥");
		
		break;}

	default:{
		System.out.println("随便吃");
		break;}
	}

scanner.close();










}





}
