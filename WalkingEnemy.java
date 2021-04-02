import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkingEnemy extends Enemy
{
    int start = 0;
    int end = 0;
    int vx = 1;
    public WalkingEnemy(int startPoint, int endPoint){
        start = startPoint;
        end = endPoint;
    }
    public void act(){
        changeSpeed();
        walk();
        getDamage();
    }    
    public void changeSpeed(){
        if(getX() <= start || getX() >= end)
            vx *= -1;
    }
    public void walk(){
        setLocation(getX() + vx, getY());
    }
}
