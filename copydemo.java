mport java.util.Scanner;


public class Breakfast {

	public static void main(String[] args) {
		
	
	
	System.out.println("��������������:");

	Scanner scanner = new Scanner(System.in);
	String key= scanner.next();
  
	
	switch (key) {
	case "����ܺ�":{
		System.out.println("�԰���");
		
		break;}
	case "����һ���":{
		System.out.println("����ͷ");
		
		break;}
case "���鲻�Ǻܺ�":{
	System.out.println("�Լ���");
	
	break;}
case "����ܲ�":{
	System.out.println("������");
	
	break;}
	case "����ǳ���":{
		System.out.println("���ɶ��ɶ");
		
		break;}

	default:{
		System.out.println("����");
		break;}
	}

scanner.close();










}





}
