import java.util.*;
/**
Tester Class foe the class PrimeJenerator
 */
public class PrimeJeneratorTester
{
    public static void q2()
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print("Please type a positive integer greater than 1: ");
            int number = in.nextInt();
            if (number <= 1)
            {
                System.out.println("\n***Integer must be greater than 1***\n");
                in.nextLine();
            }
            else
            {
            PrimeJenerator a = new PrimeJenerator(number);
            a.listPrimes();
            break;
            }
        }
    }
}
