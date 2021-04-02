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
    }
}
