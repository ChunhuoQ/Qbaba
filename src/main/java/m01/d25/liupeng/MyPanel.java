package m01.d25.liupeng;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{
	//int count;
	int x=30,y=40;
	@Override
	public void paint(Graphics g) {//���Ʒ���
		// TODO Auto-generated method stub
		
		//g:����
		super.paint(g);//jdk1.4�汾��д 
		//���swing��ͼ��ԭ��
		g.setColor(Color.red);
		//���ƾ���
		//g.draw3DRect(20, 40, 100, 70, true);
		//g.fill3DRect(20, 40, 100, 70, true);//fill:���
		//count++;
		//System.out.println("��ǰcount="+count);
		g.fillOval(x, y, 20, 20);//��Բ��
		//��ֱ��
		//g.drawLine(30, 30, 130, 60);
	}

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // F1~F12 ���ܰ��� delete
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // ����ȥ
        // KeyEvent:�����¼�
        // int aaa= e.getKeyCode();
        // char cc= e.getKeyChar();
        // System.out.println("�����ˣ�"+aaa+"��Ӧ����ĸ��"+cc);
        if (e.getKeyCode() == KeyEvent.VK_A) {
            // a������
            this.x--;

            System.out.println("����x=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            this.y--;
            if (this.y <= 0) {
                this.y = 0;
            }
            System.out.println("����y=" + y);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.x++;
            System.out.println("����x=" + x);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            this.y++;
            System.out.println("����y=" + y);
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // �ɵ�����
    }
}
