import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Numbers2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numbers2B extends Actor
{
    GreenfootImage img;
    int number;
    public Numbers2B(String text)
    {
        number = Integer.parseInt(text);
        img = new GreenfootImage(text.length()*50,100);
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
             MainWorld2B.game(number);
        }
        
    }
}
