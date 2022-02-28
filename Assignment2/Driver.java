import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        String message = "1. A Drunkard Walk \n2. Finding Primes \n" 
                        +"3. Happy Cars \nQ: Quit Program \n"
                        +"Please type required button: ";
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print(message);
            String choice = in.nextLine();
            if(choice.equals("1"))
            {
                WalkTester.q1();
                System.out.println("********************\n");
            }
            else if(choice.equals("2"))
            {
                System.out.println("\n");
                PrimeJeneratorTester.q2();
                System.out.println("********************\n");
            }
            else if(choice.equals("3"))
            {
                CarViewer.q3();
                System.out.println("********************\n");
            }
            else if(choice.equals("Q") || choice.equals("q"))
            {
                System.out.println("Program was ended successfully");
                break;
            }
            else
            {
               System.out.println("*************************** \n"
                                 +"PLEASE TYPE VALID OPERATION \n"
                                 +"***************************");
            }
        }
    }
}
