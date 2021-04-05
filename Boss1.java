import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Enemy{
    int time = 0;
    public void act(){
        gear1();        
        time ++;
    }   
    
    public void gear1(){
        if(time%50 <= 3){
            Level world =(Level) getWorld();
            int x = Greenfoot.getRandomNumber(900);
            world.addObject(new EnemyMagic(1),x,1);
        }
        if(time%50 <= 28 && time%50 >=25){
            Level world =(Level) getWorld();
            int side = Greenfoot.getRandomNumber(2);
            int y = Greenfoot.getRandomNumber(500);
            if(side == 0)
                world.addObject(new EnemyMagic(2), 898, y);
            else
                world.addObject(new EnemyMagic(3), 1, y);
        }
    }
}
