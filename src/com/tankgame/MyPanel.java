package com.tankgame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
* 坦克大战的一个绘图区
*/

// 为了监听事件实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    HeroTank hero = null;
    
    //定义敌人的坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    
    public MyPanel() {
        hero = new HeroTank(100, 100,0,20);//初始化自己的坦克
        
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank(100 *(i + 1),0,2,20));
        }

        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //填充举行，默认为黑色
        
        //画出自己的坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        
        //画出敌人的坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
        }
        
    }
    

    
    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type) {
/*        switch (type) {
            case 0://敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1://我们的坦克
                g.setColor(Color.yellow);
                break;
            default:
                break;
        }*/
        //使用Map + lamda表达式优化
        g.setColor(type == 1 ? Color.yellow : Color.cyan);
        
        //根据坦克的方向来绘制坦克
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x+30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x+10, y+10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x+10, y+20, 20, 20);//画出坦克中间的圆形
                g.drawLine(x+20, y+30, x+20, y);
                break;
                
            case 1://表示向右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x+60, y+20);
                break;
                
            case 2://表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x+30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x+10, y+10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y+60);
                break;
                
            case 3://表示向左
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x, y+20);
                break;
                
            default:
                System.out.println("暂时没有处理");
                break;
        }
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    
    }
    
    @Override //当某个键按下的时候，调用此方法(wdsa)
    public void keyPressed(KeyEvent e) {
        //按下W健，改变坦克的方向
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            
            //修改坦克的坐标
            if (hero.getY() > 0) {
                hero.setY(hero.getY() - hero.getSpeed());
            }
        }else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.setX(hero.getX() + hero.getSpeed());
            }
            
        }else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.setY(hero.getY() + hero.getSpeed());
            }
        }else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.setX(hero.getX() - hero.getSpeed());
            }
        }
        
        //面板重绘
        this.repaint();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}
