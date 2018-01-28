/**
 * Project Name:Qbaba
 * File Name:EnemtTank.java
 * Package Name:m01.d27.Qbaba
 * Date:2018年1月28日下午8:12:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d27.Qbaba;

import java.util.Vector;






import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月28日 下午8:12:48 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class BrotherTank extends Taikei {

    private final static Logger LOG = Logger.getLogger(BrotherTank.class);

    private int direct;

    private int speed = 10;

    private Shot shot1 = null;

    Vector<Shot> vector = new Vector<Shot>();

    public Shot getBullet() {
        return shot1;
    }

    public void setBullet(Shot bullet) {
        this.shot1 = bullet;
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

    public BrotherTank() {
        super();
    }

    public BrotherTank(int x, int y) {
        super(x, y);
    }

    // 子弹的初始位置：
    public void tFire() {
        if (vector.size() < 10) {
            if (this.direct == 0) {
                // 向上：
                shot1 = new Shot(this.getX() + 16, this.getY() - 8, this.direct);
                vector.add(shot1);
            } else if (this.direct == 1) {
                // 向右：
                shot1 = new Shot(this.getX() + 60, this.getY() + 16, this.direct);
                vector.add(shot1);
            } else if (this.direct ==2) {
                // 向下：
                shot1 = new Shot(this.getX() + 16, this.getY() + 60, this.direct);
                vector.add(shot1);
            } else if (this.direct == 3) {
                // 向左：
                shot1 = new Shot(this.getX() - 6, this.getY() + 16, this.direct);
                vector.add(shot1);
            }
            // 子弹坐标：
           
            Thread th = new Thread(shot1);
            th.start();
        }
    }
}

