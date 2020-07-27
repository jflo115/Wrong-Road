import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare(score);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int score)
    {
       
        Label finalScore = new Label("Final Score:   ");
        Label death = new Label("You died loser!");
        RetryButton retry = new RetryButton();
        Font font = new Font("Arial",true,false,50);
        death.setFont("You died loser!",font);
        finalScore.setFont("Final Score: " + score,font);
        addObject(death,400,100);
        addObject(finalScore,400,250);
        addObject(retry,400,350);
      
    }
}
