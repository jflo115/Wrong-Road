import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld2A extends World
{
    private static int score;
    String level = "A";
    Numbers2A one = new Numbers2A("1");
    Numbers2A two = new Numbers2A("2");
    Numbers2A three = new Numbers2A("3");
    Numbers2A four = new Numbers2A("4");
    Numbers2A five = new Numbers2A("5");
    Numbers2A six = new Numbers2A("6");
    Label pick = new Label("Pick a road");
    Label scoreCounter = new Label("Score: ");
    /**
     * Constructor for objects of class MainWorld2.
     * 
     */
    public MainWorld2A(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.score = score;
        
        
        //Setting the size of each number label and scoreCounter
        Font Numfont = new Font("Arial",false,false, 25);
        one.setFont("1",Numfont);
        two.setFont("2",Numfont);
        three.setFont("3",Numfont);
        four.setFont("4",Numfont);
        five.setFont("5",Numfont);
        six.setFont("6",Numfont);
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
        addObject(six,350,200);
        addObject(pick,350,50);
        addObject(scoreCounter,500,200);
    }
    
    public static void game(int num)
    {
        int finalScore;
        //serial killer makes guess
        int killNum = guess();
        if(num == killNum)
        {
            finalScore = score;
            score = 0;
            Greenfoot.setWorld(new Game_Over(finalScore));
        }
        else
        {
            score++;
            if(score >= 10)
            {
                Greenfoot.setWorld(new Survival());
            }
            else
                Greenfoot.setWorld(new MainWorld2A(score));
        }
    }
    
    public static int guess()
    {
        int guess = (int)(Math.random()  * 6) + 1;
        return guess;
    }
}
