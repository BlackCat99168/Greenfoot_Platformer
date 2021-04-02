import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Player{
    public Cat(){
        collisionBox =new GreenfootImage("CatBox.png");
        realImage = new GreenfootImage("CatRight1.png");
    }
    public void act(){
        changeImage();
        changeCollisionBox();
        move();
        useMagic();
        checkEnemy();      
        checkFall();
        checkDeath();
        checkNextLevel();
        setImage(realImage);
    }   
    public void changeImage(){
        if(direction == 1){
            if(((Level) getWorld()).clock % 2 == 0)
                realImage = new GreenfootImage("CatRight1.png");
            else
                realImage = new GreenfootImage("CatRight2.png");
        }
        else{
            if(((Level) getWorld()).clock % 2 == 0)
                realImage = new GreenfootImage("CatLeft1.png");
            else
                realImage = new GreenfootImage("CatLeft2.png");
        }
    }
    
}
