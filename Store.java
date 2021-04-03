import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store extends Actor
{
    /**
     * Act - do whatever the Store wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        checkBuying();
    }    
    
    public void checkBuying(){
        if(isTouching(Player.class) && Greenfoot.isKeyDown("Space")){
            Level world =(Level) getWorld();
            int data[] = new int[6];
            data[0] = world.thisLevel;
            data[1] = world.animal;
            data[2] = world.maxHp;
            data[3] = world.maxMp;
            data[4] = world.mpRecovery;
            data[5] = world.coin;
            Greenfoot.setWorld(new InStore(data));
        }
    }
}
