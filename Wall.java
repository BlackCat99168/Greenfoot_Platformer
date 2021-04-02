import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Platform
{
    public void act() 
    {
        // Add your action code here.
    }    
    public void turn90(){
        turn(90);
    }
    public int[] getLocation(){
        int[] a;
        a = new int[2];
        a[0] = getX();
        a[1] = getY();
        return a;
    }   
}
