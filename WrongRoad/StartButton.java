import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start Button works as our initial start button in the beggining
 * of the game.
 * 
 * @author Justin Flores
 * @version V1.0
 */
public class StartButton extends Actor
{
    
    public StartButton() 
    {
        String text = "START";
        GreenfootImage img = new GreenfootImage(text.length()*20,30);
        img.setColor(Color.WHITE);
        img.drawString(text, 2, 20);
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
            Greenfoot.setWorld(new MainWorld());
        }
    }
}
