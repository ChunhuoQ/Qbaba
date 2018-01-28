/**
 * Project Name:Qbaba
 * File Name:Shot.java
 * Package Name:m01.d27
 * Date:2018年1月27日下午2:21:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d27.Qbaba;

/**
 * Description:   <br/>
 * Date:     2018年1月27日 下午2:21:01 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Shot implements Runnable{

    private int x;
    private int y;
    private int direct;//方向
    private int speed=3;
    private boolean isLive=true;//是否活着在
    public Shot(){}
    public Shot(int x,int y,int direct){
        this.x=x;
        this.y=y;
        this.direct=direct;
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
        // TODO Auto-generated method stub
        while(true){
            try {
                //分方向 炮筒的方向决定子弹发射的方向
                switch(this.direct){
                    case 0:
                        //向上
                        //如何控制？动起来
                        //this.x this.y
                        this.y-=this.speed;
                        break;
                    case 1:
                        //向右
                        this.x+=this.speed;
                        break;
                    case 2:
                        //向下
                        this.y+=this.speed;
                        break;
                    case 3:
                        //向左
                        this.x-=this.speed;
                        break;
                }
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            //思考：子弹什么时候死亡?
            
            if(this.x<36||this.x>755||this.y<36||this.y>433||((this.x > 298 && this.x < 483) && this.y > 346)){
                this.isLive=false;

                break;
            }
            
        }
        
        
    }
   
}


