/**
Finds and shows prime numbers less than a certain integer
*/
public class PrimeJenerator
{
    private static int input;
    /**
    Finds the prime numbers less than a certain positice integer
    @param i is the certain positive integer 
           from which less primes are determined
     */
    public PrimeJenerator(int i)
    {
        this.input = i;
    }
    /**
    Determines if a number is prime or not
    @param number an integer
     */
    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number ; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    /**
    Lists all primes on the console less than or equal to input.
     */
    public static void listPrimes()
    {
        for(int i = 2; i <= input; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " is prime");
            }
        }   System.out.println("All primes <= "
                                + input + " are listed.");
    }
}
