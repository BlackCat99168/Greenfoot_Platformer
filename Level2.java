import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    public Level2(int level, int animal0, int maxHp0, int maxMp0, int mpRecovery0, int coin0)
    {
        thisLevel = level;
        animal = animal0;
        maxHp = maxHp0;
        maxMp = maxMp0;
        mpRecovery = mpRecovery0;
        coin = coin0;
        tmpCoin = coin;
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
        JumpingEnemy jumpingEnemy2 = new JumpingEnemy();
        addObject(jumpingEnemy2,279,220);
        JumpingEnemy jumpingEnemy3 = new JumpingEnemy();
        addObject(jumpingEnemy3,393,139);
        HpScoreboard hpScoreboard = new HpScoreboard();
        addObject(hpScoreboard,47,31);
        MpScoreboard mpScoreboard = new MpScoreboard();
        addObject(mpScoreboard,47,60);
        Coin coin = new Coin();
        addObject(coin,213,353);
        Coin coin2 = new Coin();
        addObject(coin2,538,327);
        Coin coin3 = new Coin();
        addObject(coin3,199,228);
        Coin coin4 = new Coin();
        addObject(coin4,522,144);
        CoinScoreboard coinScoreboard = new CoinScoreboard();
        addObject(coinScoreboard,47,109);
    }
    
    public void act(){
        addMp();
        addTime();
    }
}
