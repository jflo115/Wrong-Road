import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class safeHouse1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SafeHouse1 extends World
{

    /**
     * Constructor for objects of class safeHouse1.
     * 
     */
    public SafeHouse1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Text pick = new Text("Pick a powerup");
        Button2B button2B = new Button2B("4 Roads \nTwo Lives");
        Button2A button2A = new Button2A("6 Roads");
        Font font = new Font("Arial",false,false,20);
        button2B.setFont("4 Roads \nTwo Lives",font);
        button2A.setFont("6 Roads",font);
        addObject(pick,475,100);
        addObject(button2B,300,200);
        addObject(button2A,575,210);
        
    }
    
}
