/**
 * Project Name:Test201801
 * File Name:Tank.java
 * Package Name:main.java.m01.d27
 * Date:2018年1月27日上午9:37:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28;
/**
 * Description:   <br/>
 * Date:     2018年1月27日 上午9:37:37 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 设置一个坦克类，给坦克一个初始值坐标；
 */
public class Tank {
    private int x;

    private int y;

    public Tank() {

    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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

}

