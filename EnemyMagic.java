import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyMagic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyMagic extends Enemy
{
    int v = 4;
    int direction = 0;  //{0,1,2,3} = {上,下,左,右}
    int time = 0;
    public EnemyMagic(int direction0){  
        direction = direction0;
    }
    
    public EnemyMagic(int direction0, int speed){
        direction = direction0;
        v = speed;        
    }
    
    public void act(){
        move();
        checkPlatform();
        time += 1;
    }
    
    public void move(){
        if(time >= 20){
            if(direction == 0)
                setLocation(getX(), getY() - v);
            else if(direction == 1)  
                setLocation(getX(), getY() + v);
            else if(direction == 2)
                setLocation(getX() - v, getY());
            else if(direction == 3)
                setLocation(getX() + v, getY());
        }
    }
    
    public void checkPlatform(){
        if(isTouching(Platform.class)){
            getWorld().removeObject(this);
        }
    }
    
}
