/**
 * Project Name:Qbaba
 * File Name:MyPanel.java
 * Package Name:m01.d27.songhang
 * Date:2018年1月27日下午2:20:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.songhang;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午2:20:23 <br/>
 * 
 * @author songhang
 * @version 定义我的画板myPanel类 继承 JPanel类 实现 侦听器接口KeyListener和Runnable接口
 * @see
 */

@SuppressWarnings("serial")
public class MyPanel extends JPanel implements KeyListener, Runnable {
    MyTanKe mt = null;// 声明 先在内存中占位置 平没有做事情（没有分配具体空间）

    public MyPanel() {// 定义一个MyPanel()构造方法
        mt = new MyTanKe(40, 50);// 定义坦克的出现顺序，理解设计理念 视频17:54有讲
    }

    @Override
    // Override（重写） 1父子关系 2方法名 参数相同 返回值相同 3访问的修饰符不能严于父类
    public void paint(Graphics g) {// 画笔

        super.paint(g);// 访问父类的方法
        g.setColor(Color.black);// 设置一个背景颜色
        g.fillRect(0, 0, 500, 400);// 给窗口固定填充颜色
        drawtanke(mt.getX(), mt.getY(), mt.getDirect(), g, 0);// 调用drawtanke（）；
        // 如何绘制坦克子弹
        for (int i = 0; i < mt.vect.size(); i++) {
            Shot st = mt.vect.get(i);
            // 判断 只有活着才会绘制
            if (st.isLive() == true && mt.vect != null) {
                g.fill3DRect(st.getX(), st.getY(), 3, 3, false);
            }
            // 如果子弹死亡
            if (st.isLive() == false) {
                mt.vect.remove(st);
            }
        }

    }

    /**
     * @param 参数 x,y 坐标 direct 方向 g 画笔 类型 type
     * @see 绘制不同方向的坦克 封装方法
     */
    public void drawtanke(int x, int y, int direct, Graphics g, int type) {// 定义一个画坦克的方法drawtanke（带参数的）
        switch (type) {// switch控制语句，控制类型
        case 0:// 自己
            g.setColor(Color.cyan);
            break;
        case 1:// 敌方
            g.setColor(Color.blue);
            break;
        }
        switch (direct) {// 控制方向
        case 0:// 向上
            g.fill3DRect(x, y, 20, 50, false);// 绘制左边矩形
            g.fill3DRect(x + 20, y + 10, 30, 30, false);// 绘制中间的矩形
            g.fill3DRect(x + 50, y, 20, 50, false);// 绘制右边的矩形
            g.fillOval(x + 30, y + 20, 10, 10);// 绘制圆形
            g.drawLine(x + 35, y + 20, x + 35, y - 20);// 绘制直线
            break;

        case 1:// 向右
            g.fill3DRect(x, y, 50, 20, false);// 绘制上边矩形
            g.fill3DRect(x + 10, y + 20, 30, 30, false);// 绘制中间的矩形
            g.fill3DRect(x, y + 50, 50, 20, false);// 绘制下边的矩形
            g.fillOval(x + 20, y + 30, 10, 10);// 绘制圆形
            g.drawLine(x + 30, y + 35, x + 70, y + 35);// 绘制直线
            break;
        case 2:// 向下
            g.fill3DRect(x, y, 20, 50, false);// 绘制左边矩形
            g.fill3DRect(x + 20, y + 10, 30, 30, false);// 绘制中间的矩形
            g.fill3DRect(x + 50, y, 20, 50, false);// 绘制右边的矩形
            g.fillOval(x + 30, y + 20, 10, 10);// 绘制圆形
            g.drawLine(x + 35, y + 70, x + 35, y + 30);// 绘制直线
            break;
        case 3:// 向左
            g.fill3DRect(x, y, 50, 20, false);// 绘制上边矩形
            g.fill3DRect(x + 10, y + 20, 30, 30, false);// 绘制中间的矩形
            g.fill3DRect(x, y + 50, 50, 20, false);// 绘制下边的矩形
            g.fillOval(x + 20, y + 30, 10, 10);// 绘制圆形
            g.drawLine(x + 20, y + 35, x - 20, y + 35);// 绘制直线
            break;
        }

        /* 让坦克动起来 就需要实现KeyListener接口 */

    }

    @Override
    public void keyTyped(KeyEvent e) {

        // Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {// keyPress 按键响应的意思 KeyEvent 按键事件的意思
                                        // KeyCode 键码

        // Auto-generated method stub
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
        if (e.getKeyCode() == KeyEvent.VK_A) {
            mt.tkFire();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Auto-generated method stub

    }

    public void moveup() {
        int speed = mt.getSpeed();// 先获取速度
        int y = mt.getY() - speed;// 运算
        if (y < 10) {
            y = 10;
        }
        mt.setY(y);
    }

    public void movedown() {
        int speed = mt.getSpeed();// 先获取速度
        int y = mt.getY() + speed;// 运算
        if (y > 510) {
            y = 510;
        }
        mt.setY(y);
    }

    public void moveright() {
        int speed = mt.getSpeed();// 先获取速度
        int x = mt.getX() + speed;// 运算
        if (x > 410) {
            x = 410;
        }
        mt.setX(x);
    }

    public void moveleft() {
        int speed = mt.getSpeed();// 先获取速度
        int x = mt.getX() - speed;// 运算
        if (x < 10) {
            x = 10;
        }
        mt.setX(x);
    }

    @Override
    public void run() {// 重写runnable接口中的run方法
        while (true) {
            try {
                Thread.sleep(50);
                this.repaint();// 重绘
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
