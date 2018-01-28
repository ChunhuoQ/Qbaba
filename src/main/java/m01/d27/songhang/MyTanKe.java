/**
 * Project Name:Qbaba
 * File Name:MyTanKe.java
 * Package Name:m01.d27.songhang
 * Date:2018年1月27日下午1:53:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d27.songhang;

import java.util.Vector;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午1:53:38 <br/>
 * 
 * @author songhang
 * @version 定义我的坦克类 继承 坦克类
 * @see
 */
public class MyTanKe extends TanKe {
    private int direct;

    private int speed = 3;

    private Shot shot = null;// 定义一个引用类型的对象，初始化为null

    Vector<Shot> vect = new Vector<Shot>();

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public MyTanKe() {
        super();
    }

    public MyTanKe(int x, int y) {
        super(x, y);// 访问父类对应的构造方法，只能出现在构造方法中。
    }

    public void tkFire() {// 定义一个坦克开火的方法： tkFire() 判断子弹的发射方向并装载，最后启动子弹发射的线程

        if (this.direct == 0 && vect.size() < 10) {// 向上
            shot = new Shot(this.getX() + 35, this.getY() - 20, this.direct);
            vect.add(shot);
        } else if (this.direct == 1 && vect.size() < 10) {// 向右
            shot = new Shot(this.getX() + 70, this.getY() + 35, this.direct);
            vect.add(shot);
        } else if (this.direct == 2 && vect.size() < 10) {// 向下
            shot = new Shot(this.getX() + 35, this.getY() + 70, this.direct);
            vect.add(shot);
        } else if (this.direct == 3 && vect.size() < 10) {// 向左
            shot = new Shot(this.getX() - 20, this.getY() + 35, this.direct);
            vect.add(shot);
        }

        Thread th = new Thread(shot);// 创建一个线程的对象th 并初始化shot参数
        th.start();// 启动线程

    }
}
