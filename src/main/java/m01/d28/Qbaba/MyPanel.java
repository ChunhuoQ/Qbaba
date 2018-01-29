package m01.d27.Qbaba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel implements KeyListener ,Runnable{
	MyTaikei mt=null;
	BrotherTank lj=null;
	public MyPanel(){
		mt=new MyTaikei(260,370);
		lj=new BrotherTank(489, 370);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		    
		  g.setColor(Color.green);
	        g.fill3DRect(0, 0, 789, 36, false);
	        g.fill3DRect(0, 0, 36, 500, false);
	        g.fill3DRect(760, 0, 36, 500, false);

	        g.fill3DRect(480, 440, 789, 36, false);
	        g.fill3DRect(0, 440, 309, 36, false);
	        // 做个窝准备放鸟，
	        g.setColor(Color.lightGray);
	        g.fill3DRect(308, 355, 30, 120, true);
	        g.fill3DRect(337, 355, 115, 31, true);
	        g.fill3DRect(451, 355, 30, 120, true);
	        // 放鸟
	        g.setColor(Color.RED);
	        g.fill3DRect(400, 434, 4, 4, true);
	        g.setColor(Color.GRAY);
	        g.fillRect(387, 407, 15, 60);
	        g.fillOval(377, 407, 40, 10);
	        for (int i = 427; i < 435; i++) {
	            g.drawLine(387, i, 347, i - 20);
	        }
	        for (int i = 435; i < 445; i++) {
	            g.drawLine(387, i, 353, i - 20);
	        }
	        for (int i = 445; i < 453; i++) {
	            g.drawLine(387, i, 349, i - 23);
	        }
	        for (int i = 455; i < 462; i++) {
	            g.drawLine(387, i, 370, i + 6);
	        }
	        g.fillOval(355, 423, 40, 30);

	        for (int i = 427; i < 435; i++) {
	            g.drawLine(402, i, 442, i - 20);
	        }
	        for (int i = 435; i < 445; i++) {
	            g.drawLine(402, i, 436, i - 20);
	        }
	        for (int i = 445; i < 453; i++) {
	            g.drawLine(402, i, 440, i - 23);
	        }
	        for (int i = 455; i < 462; i++) {
	            g.drawLine(402, i, 420, i + 6);
	        }
	        g.fillOval(395, 423, 40, 30);
	        g.setColor(Color.RED);
	        g.fillRect(400, 411, 4, 4);
	        g.fillRect(368, 430, 4, 4);
	        g.fillRect(372, 433, 4, 4);
	        g.fillRect(380, 436, 4, 4);
	        g.fillRect(422, 430, 4, 4);
	        g.fillRect(418, 433, 4, 4);
	        g.fillRect(406, 436, 4, 4);

		drawtaikei(mt.getX(),mt.getY(),0,mt.getDirect(),g);
		drawtaikei(lj.getX(),lj.getY(),1,lj.getDirect(),g);
		 for (int i = 0; i < lj.vector.size(); i++) {
	            Shot tr = lj.vector.get(i);
	            if (tr.isLive() && lj.vector != null) {
	                g.fillOval(tr.getX()-7, tr.getY()-7, 20, 20);
	            }
	            if (tr.isLive() == false) {
	                lj.getVector().remove(tr);
	            }
	        }
		for(int i=0;i<mt.vect.size();i++){
		    Shot st=mt.vect.get(i);
		    if(st.isLive()&&mt.vect!=null){
		        
		        g.fillOval(st.getX()-7, st.getY()-7, 20, 20);
		    }
		    if(!st.isLive()&&mt.vect!=null){
		        mt.vect.remove(st);
		    }
		}
	
	
	
	}
	
	
	public void drawtaikei(int x,int y,int type,int direct,Graphics g){
		switch(type){
			case 0:
				g.setColor(Color.BLACK);
				break;
			case 1:
				g.setColor(Color.GREEN);
				break;
		}
		switch(direct){
			case 0:
				
				
			 // 我的坦克(到时再封装成一个函数)
	            // 左轮儿
	            g.fill3DRect(x, y, 10, 60, true);
	            // 右轮儿
	            g.fill3DRect(x + 30, y, 10, 60, true);
	            // 中间控制台
	            g.fill3DRect(x + 10, y + 10, 20, 40, false);
	            // 中间的圆形和头顶一点绿
	            g.fillOval(x + 9, y + 20, 20, 20);
	            g.setColor(Color.ORANGE);
	            g.fillOval(x + 14, y + 25, 10, 10);
	            // 粗炮管
	            g.setColor(Color.darkGray);
	            g.fillRect(x + 14, y + 8, 4, 29);
	            g.fillRect(x + 21, y + 8, 4, 29);

	            g.setColor(Color.black);
	            // 炮筒： 两长一短 成长炮管 两极短包成炮口
	            g.drawLine(x + 18, y + 30, x + 18, y - 10);
	            g.drawLine(x + 20, y + 30, x + 20, y - 10);
	            g.drawLine(x + 19, y + 30, x + 19, y - 5);
	            g.drawLine(x + 17, y - 3, x + 17, y - 8);
	            g.drawLine(x + 21, y - 3, x + 21, y - 8);
				break;
			case 1:
			    g.fill3DRect(x, y, 60, 10, true);

	            g.fill3DRect(x, y + 30, 60, 10, true);

	            g.fill3DRect(x + 10, y + 10, 40, 20, false);

	            g.fillOval(x + 20, y + 9, 20, 20);
	            g.setColor(Color.ORANGE);
	            g.fillOval(x + 25, y + 14, 10, 10);
	            g.setColor(Color.darkGray);
	            g.fillRect(x + 26, y + 14, 29, 4);
	            g.fillRect(x + 26, y + 21, 29, 4);

	            g.setColor(Color.BLACK);
	            g.drawLine(x + 30, y + 18, x + 70, y + 18);
	            g.drawLine(x + 30, y + 19, x + 70, y + 20);
	            g.drawLine(x + 30, y + 20, x + 65, y + 19);
	            g.drawLine(x + 63, y + 17, x + 68, y + 17);
	            g.drawLine(x + 63, y + 21, x + 68, y + 21);
	            
				break;
			case 2:
		
	            g.fill3DRect(x, y, 10, 60, true);

	            g.fill3DRect(x + 30, y, 10, 60, true);

	            g.fill3DRect(x + 10, y + 10, 20, 40, false);

	            g.fillOval(x + 9, y + 20, 20, 20);
	            g.setColor(Color.ORANGE);
	            g.fillOval(x + 14, y + 25, 10, 10);

	            g.setColor(Color.darkGray);
	            g.fillRect(x + 14, y + 25, 4, 29);
	            g.fillRect(x + 21, y + 25, 4, 29);
	            g.setColor(Color.black);
	            g.drawLine(x + 18, y + 30, x + 18, y + 70);
	            g.drawLine(x + 20, y + 30, x + 20, y + 70);
	            g.drawLine(x + 19, y + 30, x + 19, y + 65);
	            g.drawLine(x + 17, y + 63, x + 17, y + 68);
	            g.drawLine(x + 21, y + 63, x + 21, y + 68);
	            
				break;
			case 3:
			    g.fill3DRect(x, y, 60, 10, true);

	            g.fill3DRect(x, y + 30, 60, 10, true);

	            g.fill3DRect(x + 10, y + 10, 40, 20, false);

	            g.fillOval(x + 20, y + 8, 20, 20);
	            g.setColor(Color.ORANGE);
	            g.fillOval(x + 25, y + 14, 10, 10);
	            g.setColor(Color.darkGray);
	            g.fillRect(x + 8, y + 14, 29, 4);
	            g.fillRect(x + 8, y + 21, 29, 4);

	            g.setColor(Color.BLACK);
	            g.drawLine(x + 30, y + 18, x - 10, y + 18);
	            g.drawLine(x + 30, y + 19, x - 10, y + 20);
	            g.drawLine(x + 30, y + 20, x - 5, y + 19);
	            g.drawLine(x - 3, y + 17, x - 8, y + 17);
	            g.drawLine(x - 3, y + 21, x - 8, y + 21);
				break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	    
		if(e.getKeyCode()==KeyEvent.VK_UP){
		
			mt.setDirect(0);
		
			moveup();
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT){

			mt.setDirect(1);
			moveright();
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			
			mt.setDirect(2);
			movedown();
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
	
			mt.setDirect(3);
			moveleft();
		}
		if(e.getKeyCode()==KeyEvent.VK_X){
		
		    mt.PFire();
		  
		}
		 if (e.getKeyCode() == KeyEvent.VK_W) {
            // w被按下
            lj.setDirect(0);
            moveup1();
        }
		
		
		if (e.getKeyCode() == KeyEvent.VK_D) {
            // d被按下
		    
           lj .setDirect(1);
            moveright1();
        }
		if (e.getKeyCode() == KeyEvent.VK_S) {
            // s被按下
		    lj.setDirect(2);
            movedown1();
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            // a被按下
            lj.setDirect(3);
            moveleft1();
        }
       
        

        if (e.getKeyCode() == KeyEvent.VK_Q) {
            lj.tFire();
        }

		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void moveup(){
		
		int speed= mt.getSpeed();
		int y=mt.getY()-speed;
		if (y <= 35) {
            y= 44;
        }
		mt.setY(y);
		System.out.println("y="+y);
	}

	public void moveright(){
		
		int speed= mt.getSpeed();
		int x=mt.getX()+speed;
		if (x>= 721) {
            x = 713;
        }
        if (x > 265 && x < 483 && mt.getY() > 320) {
            x = 257;

        }
		mt.setX(x);
		System.out.println("x="+x);
	}
	
	public void moveleft(){
		
		int speed= mt.getSpeed();
		int x=mt.getX()-speed;
		 if (x <= 36) {
             x = 44; // 持续按有撞墙效果
         }
         if (x < 483 && x > 265 && mt.getY() > 320) {
            x = 491;

         }
		mt.setX(x);
		System.out.println("x="+x);
	}
	public void movedown(){
		
		int speed= mt.getSpeed();
		int y=mt.getY()+speed;
		
		if (y >= 404) {
            y = 393;
        }
        if ((mt.getX() > 265 && mt.getX() < 483) && y > 294) {
            y = 286;}
        mt.setY(y);
		System.out.println("y="+y);
	}
	
	
	
public void moveup1(){
        
        int speed= lj.getSpeed();
        int y=lj.getY()-speed;
        if (y <= 35) {
            y= 44;
        }
        lj.setY(y);
        System.out.println("y="+y);
    }

    public void moveright1(){
        
        int speed=lj.getSpeed();
        int x=lj.getX()+speed;
        if (x>= 721) {
            x = 713;
        }
        if (x > 265 && x < 483 && lj.getY() > 320) {
            x = 257;

        }
        lj.setX(x);
        System.out.println("x="+x);
    }
    
    public void moveleft1(){
        
        int speed= lj.getSpeed();
        int x=lj.getX()-speed;
         if (x <= 36) {
             x = 44; // 持续按有撞墙效果
         }
         if (x < 483 && x > 265 && lj.getY() > 320) {
            x = 491;

         }
         lj.setX(x);
        System.out.println("x="+x);
    }
    public void movedown1(){
        
        int speed=lj.getSpeed();
        int y=lj.getY()+speed;
        
        if (y >= 404) {
            y = 393;
        }
        if ((lj.getX() > 265 && lj.getX() < 483) && y > 294) {
            y = 286;}
        lj.setY(y);
        System.out.println("y="+y);
    }
       
    
    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(5);
            this.repaint();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
   
        
    }
	

}