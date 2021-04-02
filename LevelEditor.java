import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelEditor extends Level{

    /**
     * Constructor for objects of class LevelEditor.
     * 
     */
    public LevelEditor(){
        prepare();
    }

    public void act(){
        addMp();
        addTime();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,207,479);
        Ground ground2 = new Ground();
        addObject(ground2,551,414);
        Ground ground3 = new Ground();
        addObject(ground3,203,370);
        Wall wall = new Wall();
        addObject(wall,362,135);
        Ground ground4 = new Ground();
        addObject(ground4,368,286);
        Cat cat = new Cat();
        addObject(cat,94,412);
        CoinScoreboard coinScoreboard = new CoinScoreboard();
        addObject(coinScoreboard,121,549);
        Coin coin = new Coin();
        addObject(coin,329,256);
        Coin coin2 = new Coin();
        addObject(coin2,72,338);
        Coin coin3 = new Coin();
        addObject(coin3,342,338);
        Coin coin4 = new Coin();
        addObject(coin4,324,443);
        Coin coin5 = new Coin();
        addObject(coin5,554,380);
    }
}
