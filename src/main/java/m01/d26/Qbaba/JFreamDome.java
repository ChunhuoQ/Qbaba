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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Description:   <br/>
 * Date:     2018年1月25日 上午10:21:26 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class JFreamDome extends JFrame implements ActionListener {

    
    
    JButton jd1;
    JButton jd2;
    JPanel jp;
    
    public static void main(String[] args) {

        //  Auto-generated method stub
        new JFreamDome();

    }

    
    public JFreamDome(){
        this.setBounds(400,100, 600,600);
       jd1=new JButton("开始游戏");
        jd2=new JButton("结束游戏");
        jp =new JPanel();
        jp.setBackground(Color.white);
        jp.getUIClassID(); 
        
        this.add(jp,BorderLayout.CENTER);

        Dimension preferredSize = new Dimension(100,100);
        jd1.setPreferredSize(preferredSize );
        this.add(jd1,BorderLayout.SOUTH);
        this.add(jd2,BorderLayout.NORTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("坦克大战");
        
        this.setResizable(false);
        this.setVisible(true);
     }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
           
    }

}

