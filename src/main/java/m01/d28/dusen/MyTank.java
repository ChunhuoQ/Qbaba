/**
 * Project Name:workspace
 * File Name:MyTank.java
 * Package Name:m01.d27.tanke
 * Date:2018年1月27日下午2:27:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.dusen;

import java.util.Vector;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午2:27:01 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class MyTank extends Tank {
    private int direct;// 方向

    private int speed = 3;// 速度

    private Shot shot = null;

    Vector<Shot> vect = new Vector<Shot>();

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public Vector<Shot> getVect() {
        return vect;
    }

    public void setVect(Vector<Shot> vect) {
        this.vect = vect;
    }

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

    public MyTank() {
        super();
    }

    public MyTank(int x, int y) {
        super(x, y);
    }

    /**
     * 开火的方法 1,方向 2.启动(子弹)线程
     */
    public void tkFire() {
        if (vect.size() < 10) {
            if (this.direct == 0) {
                // 向上
                shot = new Shot(this.getX() + 33, this.getY() - 6, this.direct);
                vect.add(shot);
            } else if (this.direct == 1) {
                // 向右
                shot = new Shot(this.getX() + 76, this.getY() + 33, this.direct);
                vect.add(shot);

            } else if (this.direct == 2) {
                // 向下
                shot = new Shot(this.getX() + 33, this.getY() + 75, this.direct);
                vect.add(shot);
            } else if (this.direct == 3) {
                // 向左
                shot = new Shot(this.getX() - 6, this.getY() + 33, this.direct);
                vect.add(shot);
            }
            System.out.println("子弹坐标：x=" + shot.getX() + " y=" + shot.getY());
            Thread th = new Thread(shot);
            th.start();
        }
    }
}
