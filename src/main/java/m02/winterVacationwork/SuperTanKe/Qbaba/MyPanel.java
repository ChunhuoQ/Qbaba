package m02.winterVacationwork.SuperTanKe.Qbaba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel implements KeyListener, Runnable {
    MyTaikei mt = null;

    BrotherTank lj = null;

    ElepmentTank dr = null;

    ElepmentTank dr1 = null;
    
    ElepmentTank dr2 = null;

    ElepmentTank dr3 = null;
    
    public MyPanel() {
        mt = new MyTaikei(260, 370);
        lj = new BrotherTank(489, 370);
        dr = new ElepmentTank(100, 100);
        dr1 = new ElepmentTank(600, 100); 
        dr2 = new ElepmentTank(100, 200);
        dr3 = new ElepmentTank(600, 200);
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

        drawtaikei(mt.getX(), mt.getY(), 0, mt.getDirect(), g);
        drawtaikei(lj.getX(), lj.getY(), 2, lj.getDirect(), g);
        drawtaikei(dr.getX(), dr.getY(), 1, dr.getDirect(), g);
        drawtaikei(dr1.getX(), dr1.getY(), 1, dr1.getDirect(), g);
        drawtaikei(dr2.getX(), dr2.getY(), 1, dr2.getDirect(), g);
        drawtaikei(dr3.getX(), dr3.getY(), 1, dr3.getDirect(), g);

        for (int i = 0; i < lj.vector.size(); i++) {
            Shot tr = lj.vector.get(i);
            if (tr.isLive() && lj.vector != null) {
                g.fillOval(tr.getX() - 7, tr.getY() - 7, 20, 20);
            }
            if (tr.isLive() == false) {
                lj.getVector().remove(tr);
            }
        }
        for (int i = 0; i < dr.vector.size(); i++) {
            Shot tr = dr.vector.get(i);
            if (tr.isLive() && dr.vector != null) {
                g.fillOval(tr.getX() - 7, tr.getY() - 7, 20, 20);
            }
            if (tr.isLive() == false) {
                dr.getVector().remove(tr);
            }
        }
        for (int i = 0; i < dr1.vector.size(); i++) {
            Shot tr = dr1.vector.get(i);
            if (tr.isLive() && dr1.vector != null) {
                g.fillOval(tr.getX() - 7, tr.getY() - 7, 20, 20);
            }
            if (tr.isLive() == false) {
                dr1.getVector().remove(tr);
            }
        }
        for (int i = 0; i < dr2.vector.size(); i++) {
            Shot tr = dr2.vector.get(i);
            if (tr.isLive() && dr2.vector != null) {
                g.fillOval(tr.getX() - 7, tr.getY() - 7, 20, 20);
            }
            if (tr.isLive() == false) {
                dr2.getVector().remove(tr);
            }
        }
        for (int i = 0; i < dr3.vector.size(); i++) {
            Shot tr = dr3.vector.get(i);
            if (tr.isLive() && dr3.vector != null) {
                g.fillOval(tr.getX() - 7, tr.getY() - 7, 20, 20);
            }
            if (tr.isLive() == false) {
                dr3.getVector().remove(tr);
            }
        }
        for (int i = 0; i < mt.vect.size(); i++) {
            Shot st = mt.vect.get(i);
            if (st.isLive() && mt.vect != null) {

                g.fillOval(st.getX() - 7, st.getY() - 7, 20, 20);
            }
            if (!st.isLive() && mt.vect != null) {
                mt.vect.remove(st);
            }
        }

    }

    public void drawtaikei(int x, int y, int type, int direct, Graphics g) {
        switch (type) {
        case 0:
            g.setColor(Color.BLACK);
            break;
        case 1:
            g.setColor(Color.GREEN);
            break;
        case 2:
            g.setColor(Color.RED);
            break;
        }
        switch (direct) {
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

    
    
    public void gogogo(){
        
       while(true){ 
           Random ran = new Random();
        int fangXiang = ran.nextInt();
        int lastFx = Math.abs(fangXiang % 4);
        Random ran1 = new Random();
        int fangXiang1 = ran1.nextInt();
        int lastFx1 = Math.abs(fangXiang1 % 4);
        Random ran2 = new Random();
        int fangXiang2 = ran2.nextInt();
        int lastFx2 = Math.abs(fangXiang2 % 4);
        Random ran3 = new Random();
        int fangXiang3 = ran3.nextInt();
        int lastFx3 = Math.abs(fangXiang3 % 4);
        int lastla = Math.abs(fangXiang % 5);
        int lastla1 = Math.abs(fangXiang1 % 5);
        int lastla2 = Math.abs(fangXiang2 % 5);
        int lastla3 = Math.abs(fangXiang3 % 5);
        dr.setDirect(lastFx);
        dr1.setDirect(lastFx1);
        dr2.setDirect(lastFx2);
        dr3.setDirect(lastFx3);
        if (lastFx==0) {

            dr.setDirect(0);

            moveup2();
        } else if (lastFx==1) {

            dr.setDirect(1);
            moveright2();
        } else if (lastFx==2) {
           
            dr.setDirect(2);
            movedown2();
        } else if (lastFx==3) {

            dr.setDirect(3);
            moveleft2();
        }
        if (lastla==1) {

            dr.tFire();

        }
        this.repaint();
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
         }
        if (lastFx1==0) {

            dr1.setDirect(0);

            moveup3();
        } else if (lastFx1==1) {

            dr1.setDirect(1);
            moveright2();
        } else if (lastFx1==2) {
           
            dr1.setDirect(2);
            movedown3();
        } else if (lastFx1==3) {

            dr1.setDirect(3);
            moveleft3();
        }
        if (lastla1==1) {

            dr1.tFire();

        }
        this.repaint();
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
         }
        if (lastFx2==0) {

            dr2.setDirect(0);

            moveup4();
        } else if (lastFx2==1) {

            dr2.setDirect(1);
            moveright4();
        } else if (lastFx2==2) {
           
            dr2.setDirect(2);
            movedown4();
        } else if (lastFx2==3) {

            dr2.setDirect(3);
            moveleft4();
        }
        if (lastla2==1) {

            dr2.tFire();

        }
        this.repaint();
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
         }
        if (lastFx3==0) {

            dr3.setDirect(0);

            moveup5();
        } else if (lastFx3==1) {

            dr3.setDirect(1);
            moveright5();
        } else if (lastFx3==2) {
           
            dr3.setDirect(2);
            movedown5();
        } else if (lastFx3==3) {

            dr3.setDirect(3);
            moveleft5();
        }
        if (lastla3==1) {

            dr3.tFire();

        }
        this.repaint();
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
         }
       }
       
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

        

        if (e.getKeyCode() == KeyEvent.VK_UP) {

            mt.setDirect(0);

            moveup();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            mt.setDirect(1);
            moveright();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            mt.setDirect(2);
            movedown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            mt.setDirect(3);
            moveleft();
        }
        if (e.getKeyCode() == KeyEvent.VK_P) {

            mt.PFire();

        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            // w被按下
            lj.setDirect(0);
            moveup1();
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            // d被按下

            lj.setDirect(1);
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

        if (e.getKeyCode() == KeyEvent.VK_G) {
            lj.tFire();
        }
       
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public void moveup() {

        int speed = mt.getSpeed();
        int y = mt.getY() - speed;
        if (y <= 35) {
            y = 47;
        }
        mt.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright() {

        int speed = mt.getSpeed();
        int x = mt.getX() + speed;
        if (x >= 721) {
            x = 713;
        }
        if (x > 265 && x < 483 && mt.getY() > 320) {
            x = 253;

        }
        mt.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft() {

        int speed = mt.getSpeed();
        int x = mt.getX() - speed;
        if (x <= 36) {
            x = 48; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && mt.getY() > 320) {
            x = 495;

        }
        mt.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown() {

        int speed = mt.getSpeed();
        int y = mt.getY() + speed;

        if (y >= 404) {
            y = 392;
        }
        if ((mt.getX() > 265 && mt.getX() < 483) && y > 294) {
            y = 283;
        }
        mt.setY(y);
        System.out.println("y=" + y);
    }

    public void moveup1() {

        int speed = lj.getSpeed();
        int y = lj.getY() - speed;
        if (y <= 35) {
            y = 46;
        }
        lj.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright1() {

        int speed = lj.getSpeed();
        int x = lj.getX() + speed;
        if (x >= 721) {
            x = 710;
        }
        if (x > 265 && x < 483 && lj.getY() > 320) {
            x = 254;

        }
        lj.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft1() {

        int speed = lj.getSpeed();
        int x = lj.getX() - speed;
        if (x <= 36) {
            x = 47; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && lj.getY() > 320) {
            x = 494;

        }
        lj.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown1() {

        int speed = lj.getSpeed();
        int y = lj.getY() + speed;

        if (y >= 404) {
            y = 393;
        }
        if ((lj.getX() > 265 && lj.getX() < 483) && y > 294) {
            y = 282;
        }
        lj.setY(y);
        System.out.println("y=" + y);
    }

    public void moveup3() {

        int speed = dr1.getSpeed();
        int y = dr1.getY() - speed;
        if (y <= 35) {
            y = 46;
        }
        dr1.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright3() {

        int speed = dr1.getSpeed();
        int x = dr1.getX() + speed;
        if (x >= 721) {
            x = 710;
        }
        if (x > 265 && x < 483 && dr1.getY() > 320) {
            x = 253;

        }
        dr1.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft3() {

        int speed = dr1.getSpeed();
        int x = dr1.getX() - speed;
        if (x <= 36) {
            x = 47; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && dr1.getY() > 320) {
            x = 494;

        }
        dr1.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown3() {

        int speed = dr1.getSpeed();
        int y = dr1.getY() + speed;

        if (y >= 404) {
            y = 393;
        }
        if ((dr1.getX() > 265 && dr1.getX() < 483) && y > 294) {
            y = 283;
        }
        dr1.setY(y);
        System.out.println("y=" + y);
    }
    public void moveup4() {

        int speed = dr2.getSpeed();
        int y = dr2.getY() - speed;
        if (y <= 35) {
            y = 46;
        }
        dr2.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright4() {

        int speed = dr2.getSpeed();
        int x = dr2.getX() + speed;
        if (x >= 721) {
            x = 710;
        }
        if (x > 265 && x < 483 && dr2.getY() > 320) {
            x = 253;

        }
        dr2.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft4() {

        int speed = dr2.getSpeed();
        int x = dr2.getX() - speed;
        if (x <= 36) {
            x = 47; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && dr2.getY() > 320) {
            x = 494;

        }
        dr2.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown4() {

        int speed = dr2.getSpeed();
        int y = dr2.getY() + speed;

        if (y >= 404) {
            y = 393;
        }
        if ((dr2.getX() > 265 && dr2.getX() < 483) && y > 294) {
            y = 283;
        }
        dr2.setY(y);
        System.out.println("y=" + y);
    }
    public void moveup5() {

        int speed = dr3.getSpeed();
        int y = dr3.getY() - speed;
        if (y <= 35) {
            y = 46;
        }
        dr3.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright5() {

        int speed = dr3.getSpeed();
        int x = dr3.getX() + speed;
        if (x >= 721) {
            x = 710;
        }
        if (x > 265 && x < 483 && dr3.getY() > 320) {
            x = 253;

        }
        dr3.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft5() {

        int speed = dr3.getSpeed();
        int x = dr3.getX() - speed;
        if (x <= 36) {
            x = 47; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && dr3.getY() > 320) {
            x = 494;

        }
        dr3.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown5() {

        int speed = dr3.getSpeed();
        int y = dr3.getY() + speed;

        if (y >= 404) {
            y = 393;
        }
        if ((dr3.getX() > 265 && dr3.getX() < 483) && y > 294) {
            y = 283;
        }
        dr3.setY(y);
        System.out.println("y=" + y);
    }
    public void moveup2() {

        int speed = dr.getSpeed();
        int y = dr.getY() - speed;
        if (y <= 35) {
            y = 46;
        }
        dr.setY(y);
        System.out.println("y=" + y);
    }

    public void moveright2() {

        int speed = dr.getSpeed();
        int x = dr.getX() + speed;
        if (x >= 721) {
            x = 710;
        }
        if (x > 265 && x < 483 && dr.getY() > 320) {
            x = 253;

        }
        dr.setX(x);
        System.out.println("x=" + x);
    }

    public void moveleft2() {

        int speed = dr.getSpeed();
        int x = dr.getX() - speed;
        if (x <= 36) {
            x = 47; // 持续按有撞墙效果
        }
        if (x < 483 && x > 265 && dr.getY() > 320) {
            x = 494;

        }
        dr.setX(x);
        System.out.println("x=" + x);
    }

    public void movedown2() {

        int speed = dr.getSpeed();
        int y = dr.getY() + speed;

        if (y >= 404) {
            y = 393;
        }
        if ((dr.getX() > 265 && dr.getX() < 483) && y > 294) {
            y = 283;
        }
        dr.setY(y);
        System.out.println("y=" + y);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5);
                this.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}