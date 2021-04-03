import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor{

    public void act() {
        back();
    } 
    
    public void back(){
        if (Greenfoot.mouseClicked(this)){
            Level world =(Level) getWorld();
            int data[] = new int[6];
            data[0] = world.thisLevel;
            data[1] = world.animal;
            data[2] = world.maxHp;
            data[3] = world.maxMp;
            data[4] = world.mpRecovery;
            data[5] = world.coin;
            Greenfoot.setWorld(new StoreLevel(data));
        }
    }
}
