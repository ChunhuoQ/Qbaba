/**
 * Project Name:Demo
 * File Name:Test4.java
 * Package Name:Demo20180125
 * Date:2018年1月25日下午4:12:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.lvruiling;

import javax.swing.JFrame;

/**
 * Description: <br/>
 * Date: 2018年1月25日 下午4:12:15 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Test4 extends JFrame {

    public static void main(String[] args) {
        Test4 t = new Test4();
    }

    public Test4() {
        Test3 mp = new Test3();
        // 添加监听
        this.addKeyListener(mp);
        this.add(mp);

        this.setBounds(800, 800, 600, 500);
        this.setTitle("坦克大战");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
