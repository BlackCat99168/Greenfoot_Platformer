import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpingEnemy extends Enemy
{
    int vy = 0;
    int jumpSpeed = 15;
    public void act(){
        jump();
        walk();
        checkGroundTouch();
        getDamage();
    }    
    public void jump(){
        if(isTouching(Ground.class))
            vy = jumpSpeed;  
        else if (!isTouching(Ground.class) && ((Level) getWorld()).clock%2==0){
            if(vy >= -10)
                vy += ((Level)getWorld()).ay;           
        }           
        else if(isTouching(Ground.class))
            vy = 0;
    }
    public void checkGroundTouch(){
        if(vy <= 0){
            int tmp = 0;
            while(isTouching(Ground.class)){
                setLocation(getX(), getY() - 1); 
                tmp = 1;
            }
            if(tmp == 1){
                setLocation(getX(), getY() + 1); 
            }
        }
        else if(isTouching(Ground.class)){
            while(isTouching(Ground.class)){
                setLocation(getX(), getY() + 1);  
            }
            vy = 0;
        }
    }
    
    public void walk(){
        setLocation(getX(), getY() - vy);
    }  
}
