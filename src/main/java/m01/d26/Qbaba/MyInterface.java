package m01.d26.Qbaba;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyInterface extends JFrame{
   
        /*JButton jdL;
        JButton jdR;
        JButton jdT;
        JButton jdD;*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        new MyInterface();
	}
	public MyInterface(){
	     
	    
		Panel mp=new Panel();
		this.addKeyListener(mp);
		this.add(mp);
		this.setBounds(300, 150, 800, 500);
		mp.setBackground(Color.PINK);
		this.setTitle("武装坦克：俺想找徐逗逗学打炮！");
		JLabel label = new JLabel();
        label.setIcon(new ImageIcon("123.jpg"));
        mp.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		/*jdL=new JButton("左边框");
        jdR=new JButton("右边框");
        jdT=new JButton("上边框");
        jdD=new JButton("下边框");
		
		
		this.add(jdL,BorderLayout.WEST);
		this.add(jdR,BorderLayout.EAST);
		this.add(jdT,BorderLayout.NORTH);
		this.add(jdD,BorderLayout.SOUTH);*/
		//加按键坦克跑不动了
		
		
	}
	

}
