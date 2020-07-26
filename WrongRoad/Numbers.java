import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Numbers extends Actor
{
    GreenfootImage img;
    int number;
    public Numbers(String text)
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
            MainWorld.game(number);
        }
        
    }
    
    
}
