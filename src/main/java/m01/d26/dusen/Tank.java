/**
 * Project Name:workspace
 * File Name:Tank.java
 * Package Name:m01.d25.huitu
 * Date:2018年1月25日下午1:54:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.dusen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 * Description: <br/>
 * Date: 2018年1月25日 下午1:54:30 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Tank extends JPanel implements KeyListener {
    int x = 10, y = 10;

    int a;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.cyan);
        switch (a) {
        case 0: {// 向右
            g.fill3DRect(x, y, 40, 20, true);// 上轮胎
            g.setColor(Color.black);
            g.fill3DRect(x + 10, y + 20, 20, 20, true);// 中间矩形
            g.setColor(Color.red);
            g.fillOval(x + 10, y + 20, 20, 20);// 圆圈
            g.setColor(Color.cyan);
            g.fill3DRect(x + 20, y + 28, 30, 4, true);// 炮管
            g.setColor(Color.cyan);
            g.fill3DRect(x, y + 40, 40, 20, true);// 下轮胎
        }
            break;
        case 1: {// 向左
            g.fill3DRect(x, y, 40, 20, true);// 上轮胎
            g.setColor(Color.black);
            g.fill3DRect(x + 10, y + 20, 20, 20, true);// 中间矩形
            g.setColor(Color.red);
            g.fillOval(x + 10, y + 20, 20, 20);// 圆圈
            g.setColor(Color.cyan);
            g.fill3DRect(x - 10, y + 28, 30, 4, true);// 炮管
            g.setColor(Color.cyan);
            g.fill3DRect(x, y + 40, 40, 20, true);// 下轮胎
        }
            break;
        case 2: {// 向下
            g.fill3DRect(x, y, 20, 40, true);// 左轮胎
            g.setColor(Color.black);
            g.fill3DRect(x + 20, y + 10, 20, 20, true);// 中间矩形
            g.setColor(Color.red);
            g.fillOval(x + 20, y + 10, 20, 20);// 圆圈
            g.setColor(Color.cyan);
            g.fill3DRect(x + 28, y + 20, 4, 30, true);// 炮管
            g.setColor(Color.cyan);
            g.fill3DRect(x + 40, y, 20, 40, true);// 右轮胎

        }
            break;
        case 3: {// 向上
            g.fill3DRect(x, y, 20, 40, true);// 左轮胎
            g.setColor(Color.black);
            g.fill3DRect(x + 20, y + 10, 20, 20, true);// 中间矩形
            g.setColor(Color.red);
            g.fillOval(x + 20, y + 10, 20, 20);// 圆圈
            g.setColor(Color.cyan);
            g.fill3DRect(x + 28, y - 10, 4, 30, true);// 炮管
            g.setColor(Color.cyan);
            g.fill3DRect(x + 40, y, 20, 40, true);// 右轮胎
        }
            break;
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            a = 1;
            if (this.x <= 0) {
                this.x = 10;
            }
            this.x = this.x - 3;
            System.out.println("向左移动：" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            a = 3;
            if (this.y <= 0) {
                this.y = 15;
            }
            this.y = this.y - 3;
            System.out.println("向上移动：" + y);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            a = 0;
            if (this.x >= 730) {
                this.x = 710;
            }
            this.x = this.x + 3;
            System.out.println("向右移动：" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            a = 2;
            if (this.y >= 430) {
                this.y = 405;
            }
            this.y = this.y + 3;
            System.out.println("向下移动：" + y);
        }
        this.repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

}
