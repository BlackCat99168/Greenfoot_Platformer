import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InStore extends Level
{
    public InStore(int data[]){
        thisLevel = data[0];
        animal = data[1];
        maxHp = data[2];
        maxMp = data[3];
        mpRecovery = data[4];
        coin = data[5];
        tmpCoin = coin;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        addObject(new BackButton(),450,500);
    }
    
    public void act(){
        addMp();
        addTime();
    }
}
