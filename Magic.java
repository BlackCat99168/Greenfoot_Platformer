import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic extends Actor{
    /**
     * Act - do whatever the Magic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int direction = 1;
    int dead = 0;
    public Magic(int dir){
        direction = dir;
    }
    
    public void act(){
        killed();
        move();          
    }
    
    public void killed(){
        if(dead == 1)
            getWorld().removeObject(this);
    }
    
    public void move(){
        if(dead != 1){
            setLocation(getX() + direction*5 , getY());
            if(isAtEdge())
                dead = 1;
            else if(isTouching(Enemy.class) || isTouching(Platform.class))
                dead = 1;
        }
    }
}
