/**
 * Project Name:Test201801
 * File Name:MyPanel.java
 * Package Name:test0125
 * Date:2018年1月25日下午12:15:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d25.liupeng;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月25日 下午12:15:42 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class MyPanel extends JPanel implements KeyListener {

    private final static Logger LOG = Logger.getLogger(MyPanel.class);

    private int x = 50, y = 50;

    int z;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        switch (z) {
        case 2: {
            // 上
            // 填充正方形
            g.setColor(Color.ORANGE);
            g.fillRect(x + 30, y + 10, 40, 40);
            // 填充圆形
            g.setColor(Color.YELLOW);
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充左边矩形
            g.setColor(Color.ORANGE);
            g.fillRect(x, y, 30, 60);
            // 填充右边矩形
            g.fillRect(x + 70, y, 30, 60);
            // 填充中间矩形
            g.fillRect(x + 45, y - 20, 10, 40);
        }
            break;
        case 1: {
            // 左
            g.setColor(Color.ORANGE);
            g.fillRect(x + 30, y + 10, 40, 40);
            // 填充圆形
            g.setColor(Color.YELLOW);
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充左边矩形
            g.setColor(Color.ORANGE);
            g.fillRect(x + 20, y - 20, 60, 30);
            // 填充右边矩形
            g.fillRect(x + 20, y + 50, 60, 30);
            // 填充中间矩形
            g.fillRect(x, y + 25, 40, 10);
        }
            break;
        case 0: {
            // 下
            g.setColor(Color.ORANGE);
            g.fillRect(x + 30, y + 10, 40, 40);
            // 填充圆形
            g.setColor(Color.YELLOW);
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充左边矩形
            g.setColor(Color.ORANGE);
            g.fillRect(x, y, 30, 60);
            // 填充右边矩形
            g.fillRect(x + 70, y, 30, 60);
            // 填充中间矩形
            g.fillRect(x + 45, y + 40, 10, 40);
        }
            break;
        case 3: {
            // 右
            g.setColor(Color.ORANGE);
            g.fillRect(x + 30, y + 10, 40, 40);
            // 填充圆形
            g.setColor(Color.YELLOW);
            g.fillOval(x + 40, y + 20, 20, 20);
            // 填充左边矩形
            g.setColor(Color.ORANGE);
            g.fillRect(x + 20, y - 20, 60, 30);
            // 填充右边矩形
            g.fillRect(x + 20, y + 50, 60, 30);
            // 填充中间矩形
            g.fillRect(x + 60, y + 25, 40, 10);
        }
            break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            z = 1;
            // a被按下
            this.x -= 5;
            if (this.x <= 0) {
                this.x = 0;
            }
            LOG.info("向左：" + "(" + x + "," + y + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            // w被按下
            z = 2;
            this.y -= 5;
            if (this.y <= 0) {
                this.y = 0;
            }
            LOG.info("向上：" + "(" + x + "," + y + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            // d被按下
            z = 3;
            this.x += 5;
            if (this.x >= 500) {
                this.x = 500;
            }
            LOG.info("向右：" + "(" + x + "," + y + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            // s被按下
            z = 0;
            this.y += 5;
            if (this.y >= 440) {
                this.y = 440;
            }
            LOG.info("向下：" + "(" + x + "," + y + ")");
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}

