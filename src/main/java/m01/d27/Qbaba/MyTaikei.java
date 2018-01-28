package m01.d27.Qbaba;

import java.util.Vector;

public class MyTaikei extends Taikei {
    private int direct;

    private int speed = 7;

    private Shot shot = null;

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

    public MyTaikei() {
        super();
    }

    public MyTaikei(int x, int y) {
        super(x, y);
    }

    public void PFire() {
        
        if(vect.size()<=10){
            if (this.direct == 0) {
            shot = new Shot(this.getX() + 16, this.getY() - 8, this.direct);
            vect.add(shot);
        } else if (this.direct == 1) {
            shot = new Shot(this.getX() + 60, this.getY() + 16, this.direct);
            vect.add(shot);
        } else if (this.direct == 2) {
            shot = new Shot(this.getX() + 16, this.getY() + 60, this.direct);
            vect.add(shot);
        } else if (this.direct == 3) {
            shot = new Shot(this.getX() - 6, this.getY() + 16, this.direct);
            vect.add(shot);
        } 
        Thread th=new Thread(shot);
        th.start();
        }
        
       
        }
        
        
    }

