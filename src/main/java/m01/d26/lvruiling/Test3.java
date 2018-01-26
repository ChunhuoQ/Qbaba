/**
 * Project Name:Demo
 * File Name:Test3.java
 * Package Name:Demo20180125
 * Date:2018年1月25日下午2:42:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.lvruiling;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月25日 下午2:42:27 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Test3 extends JPanel implements KeyListener {
    private final static Logger LOG = Logger.getLogger(KeyListener.class);

    // public static void main(String[] args) {
    // Test3 t = new Test3();
    // }
    //
    // public Test3() {
    // Test3 mp = new Test3();
    // // 添加监听
    // this.addKeyListener(mp);
    // this.add(mp);
    //
    // this.setBounds(800, 800, 600, 500);
    // this.setTitle("坦克大战");
    // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setVisible(true);
    // }
    int x = 30;

    int y = 40;

    int z;

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        g.fillRect(x + 20, y + 30, 40, 40);
        g.setColor(Color.red);
        g.fillOval(x + 25, y + 35, 30, 30);

        g.setColor(Color.pink);
        // g.fill3DRect(x - 10, y + 20, 30, 60, true);
        g.fillRect(x - 10, y + 20, 30, 60);
        g.fillRect(x + 60, y + 20, 30, 60);
        // g.fill3DRect(x + 60, y + 20, 30, 60, true);
        g.setColor(Color.pink);
        g.drawLine(x + 42, y + 46, x + 43, y + 100);

    }

    // int x = 30;
    //
    // int y = 40;

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            this.x--;
            LOG.info("向左X=" + x);

        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            z = 2;
            this.y--;
            if (this.y <= 0) {
                this.y = 0;
            }
            LOG.info("向上Y=" + y);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.x++;
            LOG.info("向右X=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            z = 1;
            this.y++;
            LOG.info("向下Y=" + y);
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {

        // Auto-generated method stub

    }

}
