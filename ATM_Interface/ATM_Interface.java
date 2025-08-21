import java.util.Scanner;
class ATM_Interface
{
    public static void main(String args[])
    {
       int balance=10000;
       int withdraw,deposit;
       Scanner atm=new Scanner(System.in);
       System.out.println("---ATM Machine---");
       System.out.println("1.Withraw your money.");
       System.out.println("2.Deposit your money.");
       System.out.println("3.Check your balance amount.");
       System.out.println("4.Take an exit.");
       while(true)
       {
           int choice=atm.nextInt();
           switch(choice)
           {
               case 1:
               System.out.println("Enter the amount you want to withdraw:");
               withdraw=atm.nextInt();
               if(balance>=withdraw)
               {
                   balance=balance-withdraw;
                   System.out.println("Collect your "+withdraw+" ruppe.");
               }
               else
               {
                   System.out.println("Insufficient Balance.");
               }
               break;
               case 2:
               System.out.println("Enter the amount you want to deposit:");
               deposit=atm.nextInt();
               balance = balance+deposit;
               System.out.println("Your money is successfully deposited.");
               break;
               case 3:
               System.out.println("Your balance amount is:"+balance);
               break;
               case 4:
               System.exit(0);
               break;
               default:
               System.out.println("Invalid transaction.");
               break;
            }
            atm.close();
        }
    }
}