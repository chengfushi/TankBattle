package com.tankgame;


import javax.swing.*;

public class TankBottle extends JFrame {
    
    //定义一个myPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankBottle tankBottle01 = new TankBottle();
    
    }
    
    public TankBottle() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        //让画板居中显示
        this.setLocationRelativeTo(null);
        
        //添加监听事件
        this.addKeyListener(myPanel);
        
        this.setTitle("坦克大战");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
