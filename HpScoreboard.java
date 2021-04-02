import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HpScoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HpScoreboard extends Scoreboard{
    
    public HpScoreboard(){
        title = "HP";
    }
    
    public void act(){
        Level world =(Level) getWorld();
        showScore(world.hp);
    }
}
