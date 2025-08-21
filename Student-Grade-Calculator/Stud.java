import java.util.Scanner;
class Stud{
    public static void main(String args[])
    {
        Scanner v1=new Scanner(System.in);
        System.out.println("Enter the marks of English:");
        int eng=v1.nextInt();
		System.out.println("Enter the marks of Science:");
        int sci=v1.nextInt();
        System.out.println("Enter the marks of Computer:");
        int comp=v1.nextInt();
		System.out.println("Enter the marks of Mathematics:");
        int math=v1.nextInt();
        System.out.println("Enter the marks of Hindi:");
        int hin=v1.nextInt();
        int total=eng+sci+math+comp+hin;
        System.out.println("Total Marks:"+total);
        float avg=total/5;
        System.out.println("Average Marks:"+avg);
        float percent=(total*100)/500;
        System.out.println("Percentage:"+percent);
        if(percent>90)
        {
            System.out.println("A+ Grade");
        }
        else if(percent>75)
        {
            System.out.println("A Grade");
        }
        else if(percent>60)
        {
            System.out.println("B Grade");
        }
        else if(percent>40)
        {
            System.out.println("C Grade");
        }
        else if(percent>30)
        {
            System.out.println("Pass");
        }
        else if(percent<30)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid input.");
        }
        v1.close();
    }
}   
