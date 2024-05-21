import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)



public class Levels extends World
{
    public int level = 1;
    
    //Constructor for objects of class Levels.
    public Levels()
    {    
        super(600,600, 1);
        prepareLevelOne();
    }
    
    public void prepareLevelOne()
    {
       wallRectOne block ;

        for (int i = 2 ; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 575, 27 * i) ;
        }

        for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 20 units long starting at point (54, 550) - Ã
        for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 27 * i, 550) ;
        }        

        // make a vertical wall 7 unts long starting at (58, 65) - Ã
        for (int i = 2 ; i < 9 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, (27 * i)+11) ;
        }  

        // make a vertical wall 7 unts long starting at (58, 378) - Ã
        for (int i = 14; i < 21 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 58, 27 * i) ;
        }    
       
        
       // INSIDE OUTER RECTANGLE        

        // make a horizontal wall 11 units long starting at point (180, 150) - Ã
        for (int i =6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, ((27 * i)+18), 150) ;
        }      

        // make a vertical wall 11 unts long starting at (175, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 175, 27 * i) ;
        }

        // make a horizontal wall 11 units long starting at point (180, 450) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, ((27 * i)+18), 450) ;
        }  
        

        // INNER RECTANGLE

        // make a horizontal wall 5 units long starting at point (329, 355) - Ã
       for (int i = 12; i < 17; i++)
       {
           block = new wallRectOne();
           addObject(block, (27*i)+5, 355);
        }

       // make a horizontal wall 5 units long starting at point (329, 245) - Ã
       for (int i = 12; i < 17; i++)
       {
           block = new wallRectOne();
           addObject(block, (27*i)+5, 245);
        }

        // make a right vertical wall 5 unts long starting at (460, 243) - Ã
       for (int i = 9; i < 14 ; i++)
        {
            block = new wallRectOne() ;
            addObject(block, 460, 27*i) ;
        }  

       // Player object        
       PlayerOne player = new PlayerOne() ;
       addObject(player,75,315) ;

       // BlueGem object        
       BlueGem blueGem = new BlueGem() ;
       addObject(blueGem,410,297);  
        
       // Enemy objects        
       EnemyVert enemy = new EnemyVert() ;
       addObject(enemy,250,193) ;    
       
       EnemyVert enemy1 = new EnemyVert() ;
       addObject(enemy1,517,100) ; 
    }

    // Called when the player reaches home in Level One.
    // It removes walls, the enemies, the player and the
    // home from the world.  It then calls the method to
    // Prepare Level Two.
    public void endLevelOne()
    {
        removeObjects(getObjects(wallRect.class)); 
        removeObjects(getObjects(Enemy.class)); 
        removeObjects(getObjects(PlayerOne.class));
        removeObjects(getObjects(Home.class));
        prepareLevelTwo();
    }
    
    // Prepares Level Two with the walls, the player,
    // the enemies and the gem.
    public void prepareLevelTwo()
    {
        wallRectTwo block ;

        // OUTSIDE RECTANGLE
       
        // make a vertical wall 15 unts long starting at (575, 162) - Ã
        for (int i = 6 ; i < 21 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 575, 27 * i) ;
        }

        // make a vertical wall 15 unts long starting at (53, 54) - Ã
        for (int i = 2 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 53, 27 * i) ;
        }
        
        // make a horizontal wall 20 units long starting at point (54, 50) - Ã
        for (int i =2 ; i < 22 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 27 * i, 50) ;
        }

        // make a horizontal wall 20 units long starting at point (54, 550) - Ã
        for (int i = 2 ; i < 22 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 27 * i, 550) ;
        }        
        
        
        // FIRST COLUMN        
        // make a vertical wall 14 unts long starting at (150, 162) - Ã
        for (int i = 6 ; i < 20 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 150, 27 * i) ;
        }

        // SECOND COLUMN        
        // make a vertical wall 11 unts long starting at (255, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 255, 27 * i) ;
        }
       
        // THIRD COLUMN        
        // make a vertical wall 11 unts long starting at (360, 162) - Ã
        for (int i = 6 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 360, 27 * i) ;
        }
       
        // FOURTH COLUMN       
        // make a vertical wall 14 unts long starting at (475, 81) - Ã
        for (int i = 3 ; i < 17 ; i++)
        {
            block = new wallRectTwo() ;
            addObject(block, 475, 27 * i) ;
        }
    

        // Player object        
        PlayerTwo player = new PlayerTwo() ;
        addObject(player,67,495) ;
        
        // GreenGem object        
        GreenGem greenGem = new GreenGem() ;
        addObject(greenGem,555,106);  
        
        // Enemy objects        
        EnemyHoriz enemy = new EnemyHoriz() ;
        addObject(enemy,110,100) ;  
       
        EnemyHoriz enemy1 = new EnemyHoriz() ;
        addObject(enemy1,225,500) ;   
       
        EnemyVert enemy2 = new EnemyVert();
        addObject(enemy2, 300,300);
    }}

