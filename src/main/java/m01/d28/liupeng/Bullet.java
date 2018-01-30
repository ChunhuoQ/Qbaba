/**
 * Project Name:Test201801
 * File Name:Bullet.java
 * Package Name:main.java.m01.d27
 * Date:2018年1月27日下午3:20:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.liupeng;
/**
 * Description:   <br/>
 * Date:     2018年1月27日 下午3:20:19 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/**
 * 子弹类：xy方向、速度，生命周期，线程
 */
public class Bullet implements Runnable{
    private int x;

    private int y;

    private int direct;

    private int speed = 20;

    private boolean isLive = true;

    public Bullet() {
    }

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    @Override
    public void run() {
        
        while(true){
            try {
                switch(this.direct){
                case 0:
                    //向下
                    this.y += this.speed;
                    break;
                case 1:
                    // 向左
                    this.x -= this.speed;
                    break;
                case 2:
                    // 向上
                    this.y -= this.speed;
                    break;
                case 3:
                    // 向右
                    this.x += this.speed;
                    break;
                }
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 子弹消失的条件
            if (this.x < 0 || this.y < 0 || this.x > 1000 || this.y > 600) {
                this.isLive = false;
                break;
            }

        }

    }

}

