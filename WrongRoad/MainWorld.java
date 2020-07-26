import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MainWorld extends World
{
    private static int score;
    Numbers one = new Numbers("1");
    Numbers two = new Numbers("2");
    Numbers three = new Numbers("3");
    Numbers four = new Numbers("4");
    Numbers five = new Numbers("5");
    Label pick = new Label("Pick a road");
    Label scoreCounter = new Label("Score: ");
    public MainWorld(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score=this.score;
        
        
        //Setting the size of each number label and scoreCounter
        Font Numfont = new Font("Arial",false,false, 25);
        one.setFont("1",Numfont);
        two.setFont("2",Numfont);
        three.setFont("3",Numfont);
        four.setFont("4",Numfont);
        five.setFont("5",Numfont);
        scoreCounter.setFont("Score: " + score,Numfont);
        
        //setting the size of pick 
        Font pickFont = new Font("Arial",false,false,40);
        pick.setFont("Pick a Road",pickFont);
        
        
        
        //Adds pick and number objects and makes the initial screen setting
        addObject(one, 100, 200);
        addObject(two,150,200);
        addObject(three,200,200);
        addObject(four,250,200);
        addObject(five,300,200);
        addObject(pick,350,50);
        addObject(scoreCounter,450,200);
    }
    
    public static void game(int num)
    {
        
        //serial killer makes guess
        int killNum = guess();
        if(num == killNum)
        {
            score = 0;
            Greenfoot.setWorld(new Game_Over(0));
        }
        else
        {
            Greenfoot.setWorld(new MainWorld(score++));
        }
    }
    
    public static int guess()
    {
        int guess = (int)(Math.random()  * 5) + 1;
        return guess;
    }

}
