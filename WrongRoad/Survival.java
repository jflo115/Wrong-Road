import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Survival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Survival extends World
{

    /**
     * Constructor for objects of class Survival.
     * 
     */
    Label text = new Label("You Survived");
    Label guess = new Label("The Serial Killer went on road: ");
    public Survival(int sguess)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        Font font = new Font("Arial",true,false,50);
        text.setFont("You Survived",font);
        font = new Font("Arial",true,false,20);
        guess.setFont("The Serial Killer went on road: " + sguess,font);

        addObject(text,300,100);
        addObject(guess,1800,300);

        
    }
}
