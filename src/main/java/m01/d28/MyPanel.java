/**
 * Project Name:Test201801
 * File Name:MyPanel.java
 * Package Name:main.java.m01.d27
 * Date:2018年1月27日上午10:28:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月27日 上午10:28:53 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 画板类：坦克、子弹均在这里绘制完成
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {

    private final static Logger LOG = Logger.getLogger(MyPanel.class);

    MyTank mt = null;

    EnemyTank et = null;

    public MyPanel() {
        mt = new MyTank(40, 40);
        et = new EnemyTank(400, 400);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 封装坦克的初始坐标（x，y），型号（敌我），方向（四个方向），画笔
        drawTank(mt.getX(), mt.getY(), 0, mt.getDirect(), g);
        for (int i = 0; i < mt.vector.size(); i++) {
            Bullet bul = mt.vector.get(i);
            if (bul.isLive() && mt.vector != null) {
                g.fillOval(bul.getX(), bul.getY(), 10, 10);
            }
            if (bul.isLive() == false) {
                mt.vector.remove(bul);
            }
        }

        drawTank(et.getX(), et.getY(), 1, et.getDirect(), g);
        for (int i = 0; i < et.vector.size(); i++) {
            Bullet bul = et.vector.get(i);
            if (bul.isLive() && et.vector != null) {
                g.fillOval(bul.getX(), bul.getY(), 10, 10);
            }
            if (bul.isLive() == false) {
                et.vector.remove(bul);
            }
        }

    }

    public void drawTank(int x, int y, int type, int direct, Graphics g) {
        switch (type) {
        case 0:
            g.setColor(Color.cyan);
            break;
        case 1:
            g.setColor(Color.orange);
            break;
        }
        switch (direct) {
        case 0: {
            // 向下
            // 填充中间正方形
            g.fill3DRect(x + 30, y + 10, 40, 40, false);
            // 填充圆形
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充左边矩形
            g.fill3DRect(x, y, 30, 60, false);
            // 填充右边矩形
            g.fill3DRect(x + 70, y, 30, 60, false);
            // 填充炮管
            g.fill3DRect(x + 45, y + 40, 10, 40, false);
        }
            break;
        case 1: {
            // 左
            // 填充中间正方形
            g.fill3DRect(x + 30, y + 10, 40, 40, false);
            // 填充圆形
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充上边矩形
            g.fill3DRect(x + 20, y - 20, 60, 30, false);
            // 填充下边矩形
            g.fill3DRect(x + 20, y + 50, 60, 30, false);
            // 填充炮管
            g.fill3DRect(x, y + 25, 40, 10, false);
        }
            break;
        case 2: {
            // 上
            // 填充正方形
            g.fill3DRect(x + 30, y + 10, 40, 40, false);
            // 填充圆形
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充右边矩形
            g.fill3DRect(x, y, 30, 60, false);
            // 填充左边矩形
            g.fill3DRect(x + 70, y, 30, 60, false);
            // 填充炮管
            g.fill3DRect(x + 45, y - 20, 10, 40, false);
        }
            break;
        case 3: {
            // 右
            // 填充正方形
            g.fill3DRect(x + 30, y + 10, 40, 40, false);
            // 填充圆形
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充下边矩形
            g.fill3DRect(x + 20, y - 20, 60, 30, false);
            // 填充上边矩形
            g.fill3DRect(x + 20, y + 50, 60, 30, false);
            // 填充炮管
            g.fill3DRect(x + 60, y + 25, 40, 10, false);
        }
            break;
        }
    }

    // TankMove tankm = new TankMove();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {
            // s被按下
            mt.setDirect(0);
            moveDown();
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            // a被按下
            mt.setDirect(1);
            moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            // w被按下
            mt.setDirect(2);
            moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            // d被按下
            mt.setDirect(3);
            moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            mt.tFire();
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // s被按下
            et.setDirect(0);
            moveDown1();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            // a被按下
            et.setDirect(1);
            moveLeft1();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            // w被按下
            et.setDirect(2);
            moveUp1();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // d被按下
            et.setDirect(3);
            moveRight1();
        }

        if (e.getKeyCode() == KeyEvent.VK_L) {
            et.tFire();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }




    /*
     * 坦克将坦克四个方向移动封装
     */

    // 向下运动：
    public void moveDown() {
        int speed = mt.getSpeed();
        int y = mt.getY() + speed;
        if (y >= 540) {
            y = 540;
        }
        mt.setY(y);
        LOG.info("向上：" + "(" + mt.getX() + "," + y + ")");
    }

    // 向左运动：
    public void moveLeft() {
        int speed = mt.getSpeed();
        int x = mt.getX() - speed;
        if (x <= 0) {
            x = 0;
        }
        mt.setX(x);
        LOG.info("向左：" + "(" + x + "," + mt.getY() + ")");
    }

    // 向上运动
    public void moveUp() {
        int speed = mt.getSpeed();
        int y = mt.getY() - speed;
        if (y <= 0) {
            y = 0;
        }
        mt.setY(y);
        LOG.info("向左：" + "(" + mt.getX() + "," + y + ")");
    }

    // 向右运动：
    public void moveRight() {
        int speed = mt.getSpeed();
        int x = mt.getX() + speed;
        if (x >= 940) {
            x = 940;
        }
        mt.setX(x);
        LOG.info("向右：" + "(" + x + "," + mt.getY() + ")");
    }

    // 敌方坦克
    // 向下运动：
    public void moveDown1() {
        int speed = et.getSpeed();
        int y = et.getY() + speed;
        if (y >= 540) {
            y = 540;
        }
        et.setY(y);
        LOG.info("向上：" + "(" + et.getX() + "," + y + ")");
    }

    // 向左运动：
    public void moveLeft1() {
        int speed = et.getSpeed();
        int x = et.getX() - speed;
        if (x <= 0) {
            x = 0;
        }
        et.setX(x);
        LOG.info("向左：" + "(" + x + "," + et.getY() + ")");
    }

    // 向上运动
    public void moveUp1() {
        int speed = et.getSpeed();
        int y = et.getY() - speed;
        if (y <= 0) {
            y = 0;
        }
        et.setY(y);
        LOG.info("向左：" + "(" + et.getX() + "," + y + ")");
    }

    // 向右运动：
    public void moveRight1() {
        int speed = et.getSpeed();
        int x = et.getX() + speed;
        if (x >= 940) {
            x = 940;
        }
        et.setX(x);
        LOG.info("向右：" + "(" + x + "," + et.getY() + ")");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
                this.repaint();
            } catch (Exception e) {
            }
        }
    }
}

