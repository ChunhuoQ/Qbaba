/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m01.d27.songhang
 * Date:2018年1月27日下午2:20:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d27.songhang;

import javax.swing.JFrame;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午2:20:58 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
@SuppressWarnings("serial")
public class Test extends JFrame {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Test tt = new Test();// 调用下面的构造方法并执行
    }

    public Test() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        Thread th = new Thread(mp);
        th.start();
        this.addKeyListener(mp);

        this.setTitle("坦克大战");// 设置标题
        this.setBounds(300, 300, 500, 400);// 设置窗口位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);// 显示窗口
    }
}
