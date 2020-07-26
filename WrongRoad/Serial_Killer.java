
public class Serial_Killer  
{
   public Serial_Killer()
    {
    }

    // "Serial Killer" will guess a number
    public int guess()
    {
        int guess = (int)(Math.random()  * 5) + 1;
        return guess;
    }

}
