import greenfoot.*;

public class StartScreen extends World
{
    
    
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
        
      
      
      
      Font font = new Font("Arial",true,false,38);
      title.setFont("WRONG ROAD",font);
      addObject(title,300,75);
      
    }
    
    
}
