import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    GreenfootImage img;
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Text(String text)
    {
        img = new GreenfootImage(600,200);
        img.setColor(Color.RED);
        Font font = new Font("Arial",false, false,35);
        img.setFont(font);
        img.drawString(text,2, 40);
        setImage(img);
    }
}
