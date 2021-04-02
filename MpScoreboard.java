import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MpScoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MpScoreboard extends Scoreboard{
    
    public MpScoreboard(){
        title = "MP";
    }  
    
    public void act(){
        Level world =(Level) getWorld();
        showScore(world.mp);
    }
}
