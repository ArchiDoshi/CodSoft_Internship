import java.util.Random;
import java.util.Scanner;
class NumGame
{
    public static void main(String args[])
    {
       int turn=0;
       Scanner sca=new Scanner(System.in);
       System.out.println("----Let's start a number guessing game---");
       System.out.println("Enter the no. of rounds you want to play:");
       int rounds=sca.nextInt();
       while(turn<rounds)
       {
           rounds();
           turn++;
       }
   }
   static int rounds()
   {
       Random ra=new Random();
       Scanner sca=new Scanner(System.in);
       int min=0;
       int max=100;
       int attempts=0;
       int max_attempts=5;
       int random=ra.nextInt(max-(min+1))+min;
       System.out.println("You have maximum "+ max_attempts+"attempts to guess number.");
       while(attempts<max_attempts)
       {
          System.out.println("Enter a random number between "+ min +"to "+ max);
          int num=sca.nextInt();
          attempts++;
          if(num<random)
          {
              System.out.println("No. is less than the generated no.");
          }
          else if(num>random)
          {
              System.out.println("No. is greater than the generated no.");
          }
          else if(num==random)
          {
              System.out.println("Yess...you have guessed it right.");
          }
          else
          {
              System.out.println("You should guess an integer.");
          }
       }
       if(attempts==max_attempts)
       {
           System.out.println("Your attempts are over!!!");
       }
       return 0;
   }
}