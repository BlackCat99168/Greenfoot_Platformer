import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinScoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinScoreboard extends Scoreboard{
    public CoinScoreboard(){
        title = "Coin";
    }
    
    public void act(){
        Level world =(Level) getWorld();
        showScore(world.tmpCoin);
    }  
}
