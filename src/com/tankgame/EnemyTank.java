package com.tankgame;

/**
 * 敌人坦克数量多，可以放到集合中
 */
public class EnemyTank extends Tank{
    public EnemyTank(int x, int y, int direct, int speed) {
        super(x, y, direct, speed);
    }
    
    public EnemyTank(int x, int y, int direct) {
        super(x, y, direct);
    }
    
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
