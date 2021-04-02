import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{  
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(int animal0, int maxHp0, int maxMp0, int mpRecovery0)
    {
        animal = animal0;
        maxHp = maxHp0;
        maxMp = maxMp0;
        mpRecovery = mpRecovery0;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,123,396);
        Ground ground2 = new Ground();
        addObject(ground2,497,368);
        Ground ground3 = new Ground();
        addObject(ground3,163,270);
        Ground ground4 = new Ground();
        addObject(ground4,520,183);
        Cat cat = new Cat();
        addObject(cat,27,347);
        JumpingEnemy jumpingEnemy = new JumpingEnemy();
        addObject(jumpingEnemy,369,324);
        JumpingEnemy jumpingEnemy2 = new JumpingEnemy();
        addObject(jumpingEnemy2,279,220);
        JumpingEnemy jumpingEnemy3 = new JumpingEnemy();
        addObject(jumpingEnemy3,393,139);
        HpScoreboard hpScoreboard = new HpScoreboard();
        addObject(hpScoreboard,47,31);
        MpScoreboard mpScoreboard = new MpScoreboard();
        addObject(mpScoreboard,47,60);
    }
    
    public void act(){
        addMp();
        addTime();
    }
}
