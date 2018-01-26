/**
 * Project Name:JFreamDome
 * File Name:JFreamDome.java
 * Package Name:JFreamDome
 * Date:2018年1月25日上午10:21:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d26.Qbaba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Description:   <br/>
 * Date:     2018年1月25日 上午10:21:26 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@SuppressWarnings("serial")
public class MyPanelTest extends JFrame implements ActionListener {

    
    
    JButton jd1;
    JButton jd2;
    JPanel jp;
    
    public static void main(String[] args) {

        //  Auto-generated method stub
        new MyPanelTest();

    }

    
    public MyPanelTest(){
        this.setBounds(400,200, 300,300);
       jd1=new JButton("开始游戏");
        jd2=new JButton("结束游戏");
        jp =new JPanel();
        jp.setBackground(Color.white);
        jp.getUIClassID(); 
        
        this.add(jp,BorderLayout.NORTH);

       /* Dimension preferredSize = new Dimension(100,60);
        jd1.setPreferredSize(preferredSize );*///没什么卵用阿
        
        this.add(jd1,BorderLayout.CENTER);
        this.add(jd2,BorderLayout.SOUTH);
        
        jd1.addActionListener(this);
        jd1.setActionCommand("Ac");
        jd2.addActionListener(this);
        jd2.setActionCommand("Ex");
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("坦克大战0.8(未完成)");
        
        this.setResizable(false);
        this.setVisible(true);
     }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("Ac")){
            new MyInterface();
        }else if(str.equals("Ex")){
           jp.setBackground(Color.BLUE);
           this.dispose();
        }
          
    }

}

