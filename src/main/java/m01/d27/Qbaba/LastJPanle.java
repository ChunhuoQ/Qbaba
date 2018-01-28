package m01.d27.Qbaba;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LastJPanle extends JFrame{

	/**
	 * ̹��
	 */
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastJPanle tt=new LastJPanle();
	}
	
	public LastJPanle(){
		MyPanel mp=new MyPanel();
		
		
		Thread th= new Thread(mp);
		this.addKeyListener(mp);
		th.start();
		this.add(mp);
		this.setTitle("̹坦克大战0.9(双人版)");
		this.setBounds(400,200, 800,500);
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
