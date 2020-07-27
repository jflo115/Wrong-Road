import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RetryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RetryButton extends Actor
{
    public RetryButton() 
    {
        String text = "Retry?";
        GreenfootImage img = new GreenfootImage(text.length()*20,50);
        img.setColor(Color.RED);
        Font font = new Font("Arial",true,false,35);
        img.setFont(font);
        img.drawString(text, 2, 30);
        setImage(img);
    }    
    
    public void act() 
    {
        click();
    }
    
    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainWorld(0));
        }
    }
}
