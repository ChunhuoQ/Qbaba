/**
 * Project Name:workspace
 * File Name:Mypanel.java
 * Package Name:m01.d27.tanke
 * Date:2018年1月27日下午2:36:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.dusen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午2:36:22 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Mypanel extends JPanel implements KeyListener,Runnable {
    MyTank mt = null;// 声明在内存先占位置，但是没有做事情（分配集体空间）

    public Mypanel() {
        mt = new MyTank(40, 40);// 出场位置
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 分四个方向
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 500, 500);
        drawTank(mt.getX(), mt.getY(), 0, mt.getDirect(), g);
        for (int i = 0; i < mt.vect.size(); i++) {
            Shot st = mt.vect.get(i);
            if (st.isLive() ==true&& mt.vect != null) {
                g.setColor(Color.black);
                g.fill3DRect(st.getX(), st.getY(), 5, 5, false);
                this.repaint();
            }//如果子弹死亡
            if(st.isLive()==false){
                //移除子弹
                mt.vect.remove(st);
            }
        }
    }

    /**
     * x,y 坐标，direct 方向 （0，1，2，3）； g 画笔；type 类型
     */
    public void drawTank(int x, int y, int type, int direct, Graphics g) {
        switch (type) {
        case 0:// 自己
            g.setColor(Color.cyan);
            break;
        case 1:// 敌方
            g.setColor(Color.yellow);
            break;
        }
        switch (direct) {
        case 0:// 向上
            g.fill3DRect(x, y, 20, 70, false);// 左矩形
            g.fill3DRect(x + 20, y + 20, 30, 30, false);// 中间矩形
            g.fill3DRect(x + 50, y, 20, 70, false);// 右矩形
            // g.fill3DRect(x+25, y+25, 20, 20,true);
            g.fillOval(x + 24, y + 24, 20, 20);// 圆
            g.fill3DRect(x + 33, y - 6, 4, 31, true);// 炮管
            break;
        case 1:// 向右
            g.fill3DRect(x, y, 70, 20, false);
            g.fill3DRect(x + 20, y + 20, 30, 30, false);
            g.fill3DRect(x, y + 50, 70, 20, false);
            g.fillOval(x + 24, y + 24, 20, 20);
            g.fill3DRect(x + 45, y + 33, 31, 4, true);
            break;
        case 2:// 向下
            g.fill3DRect(x, y, 20, 70, false);
            g.fill3DRect(x + 20, y + 20, 30, 30, false);
            g.fill3DRect(x + 50, y, 20, 70, false);
            // g.fill3DRect(x+25, y+25, 20, 20,true);
            g.fillOval(x + 24, y + 24, 20, 20);
            g.fill3DRect(x + 33, y + 45, 4, 30, true);
            break;
        case 3:// 向左
            g.fill3DRect(x, y, 70, 20, false);
            g.fill3DRect(x + 20, y + 20, 30, 30, false);
            g.fill3DRect(x, y + 50, 70, 20, false);
            g.fillOval(x + 24, y + 24, 20, 20);
            g.fill3DRect(x - 6, y + 33, 31, 4, true);
            break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            // 向上
            mt.setDirect(0);
            // 移动
            moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // 向右
            mt.setDirect(1);
            // 移动
            moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // 向下
            mt.setDirect(2);
            moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            // 向左
            mt.setDirect(3);
            moveLeft();
        }if(e.getKeyCode()==KeyEvent.VK_J){
            mt.tkFire();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Auto-generated method stub
    }

    public void moveUp() {
        int speed = mt.getSpeed();
        int y = mt.getY() - speed;
        if (y <= 5) {
            y = 5;
        }
        mt.setY(y);
        System.out.println("当前y=" + y);
    }

    public void moveRight() {
        int speed = mt.getSpeed();
        int x = mt.getX() + speed;
        if (x > 425) {
            x = 425;
        }
        mt.setX(x);
        System.out.println("当前x=" + x);
    }

    public void moveDown() {
        int speed = mt.getSpeed();
        int y = mt.getY() + speed;
        if (y > 425) {
            y = 425;
        }
        mt.setY(y);
        System.out.println("当前y=" + y);
    }

    public void moveLeft() {
        int speed = mt.getSpeed();
        int x = mt.getX() - speed;
        if (x <= 5) {
            x = 5;
        }
        mt.setX(x);
        System.out.println("当前x=" + x);
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(50);
                this.repaint();//子弹重绘
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

}
