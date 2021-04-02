import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dead = 0;
    public void getDamage(){
        if(dead == 1){
            getWorld().removeObject(this);
        }          
        else if(isTouching(Magic.class)){
            dead = 1;           
        }
    }
}
