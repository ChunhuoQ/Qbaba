/**
 * Project Name:workspace
 * File Name:Test.java
 * Package Name:m01.d25.huitu
 * Date:2018年1月25日上午11:57:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.dusen;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * Description: <br/>
 * Date: 2018年1月25日 上午11:57:04 <br/>
 * d
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Test extends JFrame {

    public static void main(String[] args) {
        Test t = new Test();
    }

    public Test() {
        Tank ta = new Tank();
        this.addKeyListener(ta);
        this.add(ta);

        ta.setBackground(Color.green);
        this.setBounds(200, 300, 800, 500);
        this.setTitle("干啥子");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
