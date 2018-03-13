/**
 * Project Name:Qbaba
 * File Name:MyPanel.java
 * Package Name:m01.d26.songhang
 * Date:2018年1月26日上午11:11:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.songhang;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 * Description: <br/>
 * Date: 2018年1月26日 上午11:11:50 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
@SuppressWarnings("serial")
public class MyPanel extends JPanel implements KeyListener {
    int x = 40;

    int y = 30;

    int a;

    public void paint(Graphics g) {// 绘制方法
        super.paint(g);// g为画笔;
        // 理解swing绘图的基本原理
        switch (a) {
        // 向左
        case 0:
            g.setColor(Color.gray);
            g.fill3DRect(x - 30, y - 40, 100, 30, true);// fill是填充的意思
            g.fill3DRect(x - 10, y - 10, 50, 60, true);
            g.fill3DRect(x - 30, y + 30, 100, 30, true);
            g.setColor(Color.green);
            g.fillOval(x, y - 5, 30, 30);// 画圆形
            g.setColor(Color.yellow);
            g.drawLine(x + 15, y + 10, x - 40, y + 10);// 画直线
            break;
        // w被按下 向上
        case 1:
            g.setColor(Color.gray);
            g.fill3DRect(x - 40, y - 30, 30, 100, true);// fill是填充的意思
            g.fill3DRect(x - 10, y - 10, 60, 50, true);
            g.fill3DRect(x + 50, y - 30, 30, 100, true);
            g.setColor(Color.green);
            g.fillOval(x, y, 30, 30);// 画圆形
            g.setColor(Color.yellow);
            g.drawLine(x + 15, y + 10, x + 15, y - 50);// 画直线
            break;
        // 向右
        case 2:
            g.setColor(Color.gray);
            g.fill3DRect(x - 30, y - 40, 100, 30, true);// 左边的矩形
            g.fill3DRect(x - 10, y - 10, 50, 60, true);// 中间的矩形
            g.fill3DRect(x - 30, y + 30, 100, 30, true);// 右边的矩形
            g.setColor(Color.green);
            g.fillOval(x, y - 5, 30, 30);// 画圆形
            g.setColor(Color.yellow);
            g.drawLine(x + 15, y + 10, x + 70, y + 10);// 画直线
            break;
        // d被按下 向下
        case 3:
            g.setColor(Color.gray);
            g.fill3DRect(x - 40, y - 30, 30, 100, true);// fill是填充的意思
            g.fill3DRect(x - 10, y - 10, 60, 50, true);
            g.fill3DRect(x + 50, y - 30, 30, 100, true);
            g.setColor(Color.green);
            g.fillOval(x, y, 30, 30);// 画圆形
            g.setColor(Color.yellow);
            g.drawLine(x + 15, y + 10, x + 15, y + 70);// 画直线
            break;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

        // Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {

        // Auto-generated method stub
        if (e.getKeyCode() == KeyEvent.VK_A) {
            // a被按下 向左
            a = 0;
            this.x--;

            System.out.println("向左x=" + (x + 10));
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            // w被按下 向上
            a = 1;
            this.y--;
            if (this.y <= 30) {
                this.y = 0;
            }
            System.out.println("向上y=" + y);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            // s被按下 向右
            a = 2;
            this.x++;
            System.out.println("向右x=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            // d被按下 向下
            a = 3;
            this.y++;
            System.out.println("向下y=" + y);
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Auto-generated method stub

    }

}
