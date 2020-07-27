import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button2B extends Actor
{
    GreenfootImage img;
    public Button2B(String text)
    {
        img = new GreenfootImage(text.length()*28,100);
        img.setColor(Color.RED);
        img.drawString(text, 2, 20);
        setImage(img);
    }
    
    public void setFont(String text,Font font) 
    {
        img.clear();
        img.setFont(font);
        img.drawString(text,2,40);
        setImage(img);
    }
    
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 2 ,20);
    
    
    }
    
    public void act() 
    {
        click();
    }
    
    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainWorld2B(5,2));
        }
    }
}
