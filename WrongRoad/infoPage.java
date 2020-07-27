import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoPage extends World
{

    /**
     * Constructor for objects of class infoPage.
     * 
     */
    public infoPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        StartButton start = new StartButton();
        GreenfootImage bg = new GreenfootImage(600,400);
        bg.setColor(Color.BLACK);
        bg.fill();
        setBackground(bg);
        Text info = new Text("Spent a little too long at the office");
        Text info2 = new Text("today huh, well now you got to");
        Text info3 = new Text("walk all the way home in the dark.");
        Text info4 = new Text("There's been some rumors of a serial");
        Text info5 = new Text("killer around the area, but as long as");
        Text info6 = new Text("you luckily don't find yourself on the");
        Text info7 = new Text("Wrong road, you should be fine.");
        addObject(info,335,100);
        addObject(info2,350,140);
        addObject(info3,335,180);
        addObject(info4,310,220);
        addObject(info5,315,260);
        addObject(info6,315,300);
        addObject(info7,350,340);
        addObject(start,300,350);
    }
}
