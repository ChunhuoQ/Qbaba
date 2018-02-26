package m02.winterVacationwork.SuperTanKe.Qbaba;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test extends JFrame{

	
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt=new Test();
	}
	
	public Test(){
		MyPanel mp=new MyPanel();
		BrotherTank bt=new BrotherTank();
		Thread bh=new Thread(bt);
		bh.start();
		Thread th= new Thread(mp);
		this.addKeyListener(mp);
		th.start();
		this.add(mp);
		this.setTitle("̹坦克大战0.9(双人版)");
		this.setBounds(300,150, 800,500);
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
		mp.gogogo();
		
		
	}
}
