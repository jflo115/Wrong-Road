import java.util.Scanner;
import java.awt.Color;


public class WrongRoad  
{
    public WrongRoad()
    {
       int guess;
        
    }

    
    public static void main(String[] args)

    {
        //variables
        int guess; 
        String sguess;
        String ans;
        
        

        boolean chk = false; //this is what will check if player has survived, if true, player died
        int score = 0; //will keep score of player
        Serial_Killer test = new Serial_Killer();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You're out alone and a serial killer is on the loose, you must hurry back.....");
        boolean play = true; //will check if program will end or not
        

        System.out.println("Type any key to continue :: ");

        keyboard.nextLine();

        System.out.println("You come across 5 roads and you must pick one to go on. You pray that the killer ain't on that road");
        do
        {
           
       
            do
            {
                guess = test.guess();
                sguess = "" + guess;
                System.out.println(sguess);

                System.out.println("Pick a road :: ");

                ans = keyboard.nextLine();
                //checks if player actually picks a number 1-5, will not continue unless done so
                if(!ans.equals("1" ) && !ans.equals("2" ) && !ans.equals("3" ) && !ans.equals("4" ) && !ans.equals("5" ))
                {
                    do
                    {

                        System.out.println("Pick an actual road dude :: ");

                        ans = keyboard.nextLine();
                    }
                    while( !ans.equals("1" ) && !ans.equals("2" ) && !ans.equals("3" ) && !ans.equals("4" ) && !ans.equals("5" ));
                }
                if(ans.equals( sguess)) //If serial killer goes down same road as player, player dies
                {

                    System.out.println("you died");
                    chk = true;

                    System.out.println("Your score : " + score);
                    score = 0;
                    System.out.println("play again?... y or n");
                    String input = keyboard.nextLine();
                    //asks if player wants to go again, if n or N is typed, program will finish
                    if(input.equals("n") || input.equals("N"))
                    {
                        play = false;
                    }
                }
                else //if player survives
                {
                    score++; //score goes up by 1

                    System.out.println("You survived, but there's another 5 roads.... ");
                }
             //player keeps picking road until eventual death
          
            }
            while(!chk);
       
        
        }
        while(play);
    }
}
