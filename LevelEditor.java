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
        addObject(ground,150,426);
        Ground ground2 = new Ground();
        addObject(ground2,451,552);
        ground2.setLocation(443,493);
        Ground ground3 = new Ground();
        addObject(ground3,751,406);
        Boss1 boss1 = new Boss1();
        addObject(boss1,832,369);
        Cat cat = new Cat();
        addObject(cat,98,381);
        CoinScoreboard coinScoreboard = new CoinScoreboard();
        addObject(coinScoreboard,762,554);
        HpScoreboard hpScoreboard = new HpScoreboard();
        addObject(hpScoreboard,51,527);
        MpScoreboard mpScoreboard = new MpScoreboard();
        addObject(mpScoreboard,54,572);
    }
}
