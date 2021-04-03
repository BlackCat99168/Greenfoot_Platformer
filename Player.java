import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor{
    int onTheGround = 1;
    int vx = 0;
    int vy = 0;
    int ax = 0;
    int xMaxspeed = 6;
    int jumpSpeed = 10;
    int coolDown = 0;
    int direction = 1;
    int damageCd = 0;
    GreenfootImage realImage;
    GreenfootImage collisionBox;
    
    public void move(){
        walk();
        jump();
        changePosition();
        checkGroundTouch();
    }
    
    public void walk(){
        if(Greenfoot.isKeyDown("Left")){
            if(vx > -xMaxspeed)
                vx--;
            direction = -1;
        }
        else if(Greenfoot.isKeyDown("Right")){
            if(vx < xMaxspeed)
                vx++;
            direction = 1;
        }
        else{
            if(((Level) getWorld()).clock % 2 ==0)
                vx *= 0.7;
        }
            
    }
    
    public void jump(){
        if(isTouching(Trampoline.class)){
            vy = (int)(1.25 * jumpSpeed);
        }
        else if(Greenfoot.isKeyDown("Up") && isTouching(Ground.class)){
            vy = jumpSpeed;  
            onTheGround = 0;
        }
        else if (!isTouching(Ground.class) && ((Level) getWorld()).clock%2==0){
            if(vy >= -10)
                vy += ((Level) getWorld()).ay;            
        }           
        else if(isTouching(Ground.class)){
            vy = 0;           
        }
        if(vy < 0)
            onTheGround = 1;  
    }
    
    public void changePosition(){
         setLocation(getX() + vx, getY() - vy);
    }
    
    public void checkGroundTouch(){
        if(isTouching(Wall.class)){   //wall
            int slope = 0;
            while(isTouching(Wall.class)&&slope<100){
                setLocation(getX(), getY() - 1); 
                slope++;
            }
            if(slope>2){
                setLocation(getX()-vx, getY() + slope); 
                vx *= 0.6;
            }
            else{
                //vy = 0;
            }
        }
        if(vy <= 0 ){     //ground
            int touch = 0;
            setImage(realImage);
            if(isTouching(Ground.class))
                touch = 1;
            changeCollisionBox();
            int tmp = 0;
            int slope = 0;
            Actor ground = getOneIntersectingObject(Ground.class);
            if(ground != null){
                if(ground.getY() < getY()){
                    onTheGround = 0;
                    changeCollisionBox();
                    //onTheGround = 1;
                }
                else{
                    onTheGround = 1;
                    changeCollisionBox();
                }
            }                                                                                                                  
            while(isTouching(Ground.class)&&slope<100){
                setLocation(getX(), getY() - 1); 
                tmp = 1;
                slope++;
            }
            if(tmp == 1){
                setLocation(getX(), getY() + 1);  
                if(slope>12){
                    setLocation(getX()-vx, getY() + slope - 1);  
                    vx *= 0.6;
                    onTheGround = 1;
                }
                else{
                    onTheGround = 1;
                    vy = 0;
                }
            }
            else{
                if(touch == 1)
                    onTheGround = 0;
            }            
        }
        else if(isTouching(Ground.class)){  //ceiling
            onTheGround = 0;
            changeCollisionBox();
            int slope = 0;
            while(isTouching(Ground.class)&&slope<100){
                setLocation(getX(), getY() + 1);  
                slope++;
            }
            if(slope>12){
                setLocation(getX()-vx, getY() - slope); 
                vx *= 0.6;
            }
            else{
                vy = 0;
            }
        }
    }
    
    public void useMagic(){
        Level world =(Level) getWorld();
        if(Greenfoot.isKeyDown("Space") && coolDown<=0 && world.mp>0){
            vx -= direction * 3;
            world.addObject(new Magic(direction), getX(), getY());
            coolDown += 20;
            world.mp -- ;
        }
        if(coolDown >   0)
            coolDown -= 1 ;
    }
    
    public void checkEnemy(){
        Level world =(Level) getWorld();
        if(isTouching(Enemy.class) && damageCd == 0){
            world.hp -= world.thisLevel+Greenfoot.getRandomNumber(8); 
            damageCd += 5;
        }       
        if(damageCd > 0){
            damageCd -- ;
        }
    }
    
    public void checkCoin(){
        if(isTouching(Coin.class)){
            Actor touchedCoin = getOneIntersectingObject(Coin.class);
            Level world =(Level) getWorld();
            world.tmpCoin ++ ;
            getWorld().removeObject(touchedCoin);
        }
    }
    
    public void checkFall(){
        Level world =(Level) getWorld();
        if(getY() >= world.getHeight() - 1){     
            world.hp -= 99999;
        }
    }
    
    public void checkDeath(){
        Level world =(Level) getWorld();
        if(world.hp <= 0){
            world.tmpCoin = world.coin;
            addNewWorld(world.thisLevel);           
        }
    }
    
    public void checkNextLevel(){
        Level world =(Level) getWorld();
        if(getX() >= world.getWidth() - 1 && world.thisLevel != 0){   
            world.coin = world.tmpCoin;
            world.thisLevel ++ ;
            addNewWorld(world.thisLevel);
        }
    }
    
    public void addNewWorld(int levelNum){
        Level world =(Level) getWorld();
        int data[] = new int[6];
        data[0] = world.thisLevel;
        data[1] = world.animal;
        data[2] = world.maxHp;
        data[3] = world.maxMp;
        data[4] = world.mpRecovery;
        data[5] = world.coin;
        switch(levelNum){
            case(0):
                Greenfoot.setWorld(new LevelEditor());
                break;
            case(1):
                Greenfoot.setWorld(new Level1(data)); 
                break;
            case(2):
                Greenfoot.setWorld(new Level2(data));
                break;
            case(3):
                Greenfoot.setWorld(new StoreLevel(data));
                break;
            default:
                break;
        }
    }
    
    public void changeCollisionBox(){
        if(onTheGround == 1)
            setImage(realImage);
        else{
            setImage(collisionBox);
        }
    }
}
