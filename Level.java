import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    int clock = 0;
    int ay = -1;
    int animal = 1;
    int maxHp = 100;
    int maxMp = 10;
    int mpRecovery = 1;
    int hp = maxHp;
    int mp = maxMp;
    public Level(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
    
    public void addMp(){
        if(clock % (1000/(3+mpRecovery)) == 0){
            if(mp < maxMp)
                mp ++ ;
        }
    }
    
    public void addTime(){
        clock++;
    }
}
