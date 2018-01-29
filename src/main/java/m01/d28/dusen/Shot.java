/**
 * Project Name:workspace
 * File Name:Shot.java
 * Package Name:m01.d27.tanke
 * Date:2018年1月27日下午4:42:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d28.dusen;

/**
 * Description: <br/>
 * Date: 2018年1月27日 下午4:42:32 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Shot implements Runnable {
    private int x;

    private int y;

    private int direct;

    private int speed = 3;

    private boolean isLive = true;

    public Shot() {
    }

    public Shot(int x, int y, int direct) {
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
                if(this.direct==0){
                    this.y -= this.speed;
                }else if(this.direct==1){
                    this.x += this.speed;
                }else if(this.direct==2){
                    this.y += this.speed;
                }else if(this.direct==3){
                    this.x -= this.speed;
                }
                // 分方向 炮管的方向决定子弹发射的方向
                Thread.sleep(50 );
            } catch (Exception e) {
                // TODO: handle exception
            }
            if(this.x<0||this.x>500||this.y<0||this.y>500){
                this.isLive=false;
                break;
                
            }
        }
        // Auto-generated method stub
    }

}
