/**
 * Project Name:Test201801
 * File Name:Test.java
 * Package Name:test0125
 * Date:2018年1月25日上午10:28:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d25.liupeng;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * Description:   <br/>
 * Date:     2018年1月25日 上午10:28:45 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Test extends JFrame {

    public static void main(String[] args) {

        Test test = new Test();
    }

    public Test() {
        MyPanel mp = new MyPanel();
        this.addKeyListener(mp);
        this.add(mp);
        // 设置一个窗体
        // 设置窗体出现的位置（200,200） 和窗体的长宽（500,400）
        this.setBounds(200, 200, 500, 500);
        mp.setBackground(Color.black);
        // 设置窗口的标题
        this.setTitle("坦克大战");
        // 设置窗口退出时就关闭线程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体显示
        this.setVisible(true);

    }

}

