/**
 * Project Name:workspace
 * File Name:TestTank.java
 * Package Name:m01.d27.tanke
 * Date:2018年1月27日下午2:27:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.dusen;

import javax.swing.JFrame;

/**
 * Description:   <br/>
 * Date:     2018年1月27日 下午2:27:55 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class TestTank extends JFrame{

    public static void main(String[] args) {
        
        TestTank tt=new TestTank();

    }
    public TestTank(){
        Mypanel mp=new Mypanel();//构造器来初始化对象
        Thread th=new Thread(mp) ;
        th.start();
        this.addKeyListener(mp);
        this.add(mp);
        this.setTitle("我的坦克1.2");
        this.setBounds(250, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

