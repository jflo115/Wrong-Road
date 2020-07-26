import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Label extends Actor
{
    GreenfootImage img;
    public Label(String text)
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
}
