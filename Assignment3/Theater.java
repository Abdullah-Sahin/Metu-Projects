import java.lang.InterruptedException;
import java.util.Scanner;
import java.util.Arrays;
/**
The class by which sales operations are made
*/
public class Theater
{
   private int[][] seatsPrices =
   {
       {10,10,10,10,10,10,10,10,10,10},
       {10,10,10,10,10,10,10,10,10,10},
       {10,10,10,10,10,10,10,10,10,10},
       {10,10,20,20,20,20,20,20,10,10},
       {10,10,20,20,20,20,20,20,10,10},
       {10,10,20,20,20,20,20,20,10,10},
       {20,20,30,30,40,40,30,30,20,20},
       {20,30,30,40,50,50,40,30,30,20},
       {30,40,50,50,50,50,50,50,40,30}};
   /**
    * Constructs an instance of class Theater
    */
   public Theater()
   {
       
   }
   
   /**
    * Checks whether seat in given coordinates is available
    @param i the xcoordinate of the seat
    @param j the y coordinate of the seat
    @return true if seat is not reserved, false otherwise
    */public boolean checkAvailabilityofSeat(int i, int j)
   {
       if (seatsPrices[i][j] == 0)
       {
           return false;
       }
       return true;
   }
   
   /**
    Reserves the seat if available
    @param i the x coordinate of the seat
    @param j coordinate of the seat
    */
   public void reserveSeat(int i, int j) throws InterruptedException
   {
           System.out.println("The availability of this seat is being checked.");
           Thread.sleep(1000);
           if(checkAvailabilityofSeat(i,j)) 
           {
               seatsPrices[i][j] = 0;
               System.out.println("Seat (" + i + ", " + j + ") has been reserved.");
           }
           else 
           {
               System.out.println("This seat is not available");
           }
   }
   
   /**
      Finds the first row in which an available seat with price occurs
      @param n the required price
      @return the first row of seats in which available seat with given price occurs 
   */
   public int[] findSeat(int n)
   {   
       int[] arr = new int[0];
       while(true)
       {
           for(int i = 0; i < seatsPrices.length; i++)
           {
               for(int j = 0; j < seatsPrices[i].length; j++)
               {
                   if(n == seatsPrices[i][j])
                   {
                       return seatsPrices[i];
                   }
               }
           }
       return arr;
       }
   }
   
   /**
    Finds the index of first possible seat with given price
    @param array the row in which available seat with given price occurs
    @param price required price
    @return the index of first possible seat in the row array
    */
   public int getIndex(int[] array, int price)
   {
       int index = 0;
       while(index<array.length)
       {
           if(array[index] != price)
           {
               if(index == array.length - 1)
               {
                   System.out.println("No seats available for price " + price);
                   break;
               }
               index++;
           }
           else
           {
               break;
           }
       }
       return index;
   }
   
   /**
    Finds the index of row in which an available seat with given price occurs
    @param arr all seats of the theatre
    @param n price of seat
    @return the row index of first possible seat with price 
    */
   public int getXCoor(int[][] arr,int n)
   {   
       while(true)
       {
           for(int i = 0; i < arr.length; i++)
           {
               for(int j = 0; j < arr[i].length; j++)
               {
                   if(n == arr[i][j])
                   {
                       return i;
                   }
               }
           }
       }    
   }
   
   /**
    Starts the system for user
    */
   public void q2() throws InterruptedException
   {
       int bought = 0;
       System.out.println("Welcome to our theatre hall.");
       while(true)
       {
           Scanner in = new Scanner(System.in);
           if(bought == 0)
           {
               System.out.println("Would you like to get a ticket? ( Y / N )");
           }
           else
           {
               System.out.println("Would you like to get another a ticket? ( Y / N )");
           }
           String answer = in.next();
           if(answer.equals("Y") || answer.equals("y"))
           {
               while(true)
               {
                   System.out.println("Press 1 to reserve a seat according to place\n"
                                     +"Press 2 to reserve a seat according to price\n"
                                     +"Press M to turn back previous menu");
                   answer = in.next();
                   if(answer.equals("M") || answer.equals("m"))
                   {
                       break;
                   }
                   else if(answer.equals("1"))
                   {
                        while(true)
                        {
                           System.out.println("Please type the coordinates between(0,0)&(8,9 included)");
                           while(true)
                           {
                               System.out.print("Type x coordinate between 0-8 included: ");           
                               int xCoor = in.nextInt();
                               in.nextLine();
                               if(xCoor < 0 || xCoor > 8)
                               {
                                   System.out.println("x should be in 0-8");
                                   continue;
                               }
                               else
                               {
                                   while(true)
                                   {
                                       System.out.print("Type y coordinate 0-9 included: ");
                                       int yCoor = in.nextInt();
                                       in.nextLine();
                                       if(yCoor < 0 || yCoor > 9)
                                       {
                                           System.out.println("y should be in 0-9");
                                           continue;                              
                                       }
                                       else
                                       {
                                           reserveSeat(xCoor, yCoor);
                                           bought ++;
                                           break;
                                       }
                                   }
                                   break;
                               }
                           }
                           break;
                        }
                        break;
                   }
                   else if(answer.equals("2"))
                   {
                       while(true)
                       {
                           System.out.print("Available Prices are: 10 / 20 / 30 / 40 / 50\n"
                                           +"Please write the price you can afford: ");
                           int price = in.nextInt();
                           if(findSeat(price).length == 0 || price == 0)
                           {
                               System.out.println("********************************\n"
                                                 +"There is no seat with that price\n"
                                                 +"********************************");
                           }
                           else
                           {
                           in.nextLine();
                           int yCoor = getIndex(findSeat(price), price);
                           int xCoor = getXCoor(seatsPrices, price);
                           findSeat(price)[yCoor] = 0;
                           System.out.println("The seat with coordinates (" + xCoor + ", " + yCoor + ")"
                                             +" is reserved.");
                           bought ++;
                           break;
                           }
                       }
                       break;
                   }
                   else
                   {
                       System.out.println("*************************\n"
                                         +"PLEASE TYPE VALID A INPUT\n"
                                         +"*************************");
                   }
               }
           }
           else if(answer.equals("N") || answer.equals("n"))
           {
               System.out.println("*********************************************\n"
                                 +"Thanks for visiting out theater, we hope to see you again\n"
                                 +"*********************************************");
               break;
           }
           else
           {
           System.out.println("*************************\n"
                             +"PLEASE TYPE VALID A INPUT\n"
                             +"*************************");
           }
       }
   }
}
