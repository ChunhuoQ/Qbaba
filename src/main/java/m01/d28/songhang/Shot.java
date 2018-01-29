/**
 * Project Name:Qbaba
 * File Name:Shot.java
 * Package Name:m01.d27.songhang
 * Date:2018年1月27日下午5:12:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d27.songhang;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午5:12:57 <br/>
 * 
 * @author songhang
 * @version 定义一个子弹类 实现Runnable接口 定义子弹的坐标 方向 速度 生命周期
 * @see
 */
public class Shot implements Runnable {
    private int x;

    private int y;

    private int direct;// 方向怎么写

    private int speed = 3;

    private boolean isLive = true;

    public Shot() {
    }

    public Shot(int x, int y, int direct) {// 构造方法
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
        while (true) {
            try {
                switch (direct) {
                case 0:// 向上
                    this.y -= this.speed;// 子弹的移动
                    break;
                case 1:// 向右
                    this.x += this.speed;
                    break;
                case 2:// 向下
                    this.y += this.speed;
                    break;
                case 3:// 向左
                    this.x -= this.speed;
                    break;
                }
                Thread.sleep(50);
            } catch (Exception e) {

                // Auto-generated catch block
                e.printStackTrace();
            }
            if (this.x < 0 || this.x > 500 || this.y < 0 || this.y > 400) {
                this.isLive = false;// 结束子弹的生命周期
                break;
            }
        }

    }

}
