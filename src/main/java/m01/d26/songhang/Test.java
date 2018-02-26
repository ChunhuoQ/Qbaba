/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m01.d26.songhang
 * Date:2018年1月26日上午11:10:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.songhang;

import javax.swing.JFrame;

/**
 * Description: <br/>
 * Date: 2018年1月26日 上午11:10:55 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
@SuppressWarnings("serial")
public class Test extends JFrame {

    public static void main(String[] args) {

        // Auto-generated method stub
        @SuppressWarnings("unused")
        Test t = new Test();
    }

    public Test() {
        MyPanel mp = new MyPanel();
        // 添加监听
        // this.addKeyListener(mp);
        this.addKeyListener(mp);
        this.add(mp);

        // 设置一个窗体
        this.setBounds(1200, 300, 600, 500);
        this.setTitle("第一个窗口");
        // 退出的时候就需要关闭线程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 窗体的显示
        this.setVisible(true);
    }

}
