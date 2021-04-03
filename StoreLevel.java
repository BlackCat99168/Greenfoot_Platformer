import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoreLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoreLevel extends Level
{
public StoreLevel(int data[])
    {
        thisLevel = data[0];
        animal = data[1];
        maxHp = data[2];
        maxMp = data[3];
        mpRecovery = data[4];
        coin = data[5];
        tmpCoin = coin;
        prepare();
    }

    private void prepare(){

        Ground ground = new Ground();
        addObject(ground,166,506);
        Ground ground2 = new Ground();
        addObject(ground2,533,442);
        Ground ground3 = new Ground();
        addObject(ground3,739,544);
        Store store = new Store();
        addObject(store,525,397);
        Cat cat = new Cat();
        addObject(cat,73,465);
    }
    
    public void act(){
        addMp();
        addTime();
    }
}
