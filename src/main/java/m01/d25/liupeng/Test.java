package m01.d25.liupeng;

import javax.swing.JFrame;

public class Test extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt=new Test();
	}
	public Test(){
		MyPanel mp=new MyPanel();
		//��Ӽ���
        this.addKeyListener(mp);
		this.add(mp);
		
		
		this.setBounds(200, 200, 300, 300);
		this.setTitle("��ͼ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
