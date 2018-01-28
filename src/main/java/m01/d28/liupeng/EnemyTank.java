/**
 * Project Name:Test201801
 * File Name:MyTank.java
 * Package Name:main.java.m01.d27
 * Date:2018年1月27日上午10:19:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.liupeng;

import java.util.Vector;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月27日 上午10:19:00 <br/>
 * 
 * @author LiuPeng
 * @version
 * @see
 */

/*
 * 设置我的坦克，速度、方向等
 */
public class EnemyTank extends Tank {

    private final static Logger LOG = Logger.getLogger(EnemyTank.class);

    private int direct;

    private int speed = 10;

    private Bullet bullet = null;

    Vector<Bullet> vector = new Vector<Bullet>();

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Vector<Bullet> getVector() {
        return vector;
    }

    public void setVector(Vector<Bullet> vector) {
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

    public EnemyTank() {
        super();
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    // 子弹的初始位置：
    public void tFire() {
        if (vector.size() < 10) {
            if (this.direct == 0) {
                // 向下：
                bullet = new Bullet(this.getX() + 45, this.getY() + 75, this.direct);
                vector.add(bullet);
            } else if (this.direct == 1) {
                // 向左：
                bullet = new Bullet(this.getX() - 5, this.getY() + 25, this.direct);
                vector.add(bullet);
            } else if (this.direct == 2) {
                // 向上：
                bullet = new Bullet(this.getX() + 45, this.getY() - 25, this.direct);
                vector.add(bullet);
            } else if (this.direct == 3) {
                // 向右：
                bullet = new Bullet(this.getX() + 95, this.getY() + 25, this.direct);
                vector.add(bullet);
            }
            // 子弹坐标：
            LOG.info("敌方子弹坐标" + "(" + bullet.getX() + "," + bullet.getY() + ")");
            Thread th = new Thread(bullet);
            th.start();
        }
    }
}

