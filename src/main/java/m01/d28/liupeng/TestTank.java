/**
 * Project Name:Test201801
 * File Name:TestTank.java
 * Package Name:main.java.m01.d27
 * Date:2018年1月27日上午10:29:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.liupeng;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * Description:   <br/>
 * Date:     2018年1月27日 上午10:29:05 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class TestTank extends JFrame {

    public static void main(String[] args) {

            TestTank tt = new TestTank();

    }

    public TestTank()  {
        MyPanel mp = new MyPanel();
        this.addKeyListener(mp);
        this.add(mp);
        Thread th = new Thread(mp);
        th.start();

        mp.setBackground(Color.black);
        this.setBounds(50, 50, 1000, 600);
        this.setTitle("坦克大战1.0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

