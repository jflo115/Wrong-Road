import greenfoot.*;

public class StartScreen extends World
{
    
    StartButton start = new StartButton();
    Label title = new Label("WRONG ROAD");
    /**
     * Constructor for objects of class Header
     */
    public StartScreen()
    {
        super(600,400,1);
        
        prepare();
    }

    
    private void  prepare()
    {
      TitlePic serial = new TitlePic();
      addObject(serial,300,200);
        
      addObject(start,325,375);
      
      
      Font font = new Font("Arial",true,false,38);
      title.setFont("WRONG ROAD",font);
      addObject(title,300,75);
    }
    
    public void act() 
    {
        
    }
}
