/**
 * Project Name:Qbaba
 * File Name:ElepmentTank.java
 * Package Name:m02.winterVacationwork.SuperTanKe.Qbaba
 * Date:2018年2月3日下午1:16:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m02.winterVacationwork.SuperTanKe.Qbaba;

import java.util.Vector;

/**
 * Description:   <br/>
 * Date:     2018年2月3日 下午1:16:42 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ElepmentTank extends Taikei{

    private int direct;

    private int speed = 10;

    private Shot shot2 = null;

    Vector<Shot> vector = new Vector<Shot>();

    public Shot getBullet() {
        return shot2;
    }

    public void setBullet(Shot bullet) {
        this.shot2 = bullet;
    }

    public Vector<Shot> getVector() {
        return vector;
    }

    public void setVector(Vector<Shot> vector) {
        this.vector = vector;
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

    public ElepmentTank() {
        super();
    }

    public ElepmentTank(int x, int y) {
        super(x, y);
    }

    // 子弹的初始位置：
    public void tFire() {
        if (vector.size() < 10) {
            if (this.direct == 0) {
                // 向上：
                shot2 = new Shot(this.getX() + 16, this.getY() - 8, this.direct);
                vector.add(shot2);
            } else if (this.direct == 1) {
                // 向右：
                shot2 = new Shot(this.getX() + 60, this.getY() + 16, this.direct);
                vector.add(shot2);
            } else if (this.direct ==2) {
                // 向下：
                shot2 = new Shot(this.getX() + 16, this.getY() + 60, this.direct);
                vector.add(shot2);
            } else if (this.direct == 3) {
                // 向左：
                shot2 = new Shot(this.getX() - 6, this.getY() + 16, this.direct);
                vector.add(shot2);
            }
            // 子弹坐标：
            
            Thread th = new Thread(shot2);
            th.start();
        }
    }
}

