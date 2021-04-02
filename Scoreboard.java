import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor{
    String title = "";
    public void showScore(int score){
        setImage(new GreenfootImage(title + " : " + score, 28, Color.WHITE, Color.BLUE));        
    }    
}
