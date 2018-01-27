package m01.d26.Qbaba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements KeyListener {
    // int count;
    int x = 260, y = 370, a, j = 20, k = 20;

    
    
    public void paintln(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(j, k, 6, 6);
    }
    @Override
    public void paint(Graphics g) {

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

        // 放弹
        g.setColor(Color.BLACK);
        g.fillOval(j, k, 6, 6);
        g.setColor(Color.GRAY);
        switch (a) {
        // 向上
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
            g.setColor(Color.green);
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
            //装弹
           
            
            break;

        // 向右
        case 1:

            g.fill3DRect(x, y, 60, 10, true);

            g.fill3DRect(x, y + 30, 60, 10, true);

            g.fill3DRect(x + 10, y + 10, 40, 20, false);

            g.fillOval(x + 20, y + 9, 20, 20);
            g.setColor(Color.green);
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

        // 向下
        case 2:

            g.fill3DRect(x, y, 10, 60, true);

            g.fill3DRect(x + 30, y, 10, 60, true);

            g.fill3DRect(x + 10, y + 10, 20, 40, false);

            g.fillOval(x + 9, y + 20, 20, 20);
            g.setColor(Color.green);
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

        // 向左
        case 3:

            g.fill3DRect(x, y, 60, 10, true);

            g.fill3DRect(x, y + 30, 60, 10, true);

            g.fill3DRect(x + 10, y + 10, 40, 20, false);

            g.fillOval(x + 20, y + 8, 20, 20);
            g.setColor(Color.green);
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

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            a = 3;
            this.j = this.x-13;
            this.k = this.y+16;
            this.x = this.x - 7;

            if (this.x <= 36) {
                this.x = 44; // 持续按有撞墙效果
            }
            if (this.x < 483 && this.x > 265 && this.y > 320) {
                this.x = 491;

            }
            System.out.println("x=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.j = this.x+16;
            this.k = this.y-15;
            a = 0;

            this.y = this.y - 8;

            if (this.y <= 35) {
                this.y = 44;
            }

            System.out.println("y=" + y);

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.j = this.x+67;
            this.k = this.y+16;
            a = 1;
            this.x = this.x + 7;

            if (this.x >= 721) {
                this.x = 713;
            }
            if (this.x > 265 && this.x < 483 && this.y > 320) {
                this.x = 257;

            }

            System.out.println("x=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.j = this.x+16;
            this.k = this.y+67;
            a = 2;
            this.y = this.y + 8;

            if (this.y >= 404) {
                this.y = 393;
            }
            if ((this.x > 265 && this.x < 483) && this.y > 294) {
                this.y = 286;

            }
            System.out.println("y=" + y);
        } else if (e.getKeyCode() == KeyEvent.VK_X) {
            
            
            if(a==1){
                
            this.j = this.j+10;
            if(j>758){
                this.j=x+67;
            }
           System.out.println("j=" + j);
        }else  if(a==0){
            this.k = this.k-10;
            if(k<30){
                this.k=y-15;
            }
           System.out.println("k=" + k);
        }else  if(a==2){
           
            this.k= this.k+10;
           if(k>440){
               this.k=y+67;
           } 
           System.out.println("j=" + j);
        }else  if(a==3){
            this.j = this.j-10;
            if(j<30){
                j=x-15;
            }
           System.out.println("j=" + j);
        }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}