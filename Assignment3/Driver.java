import java.util.*;
import javax.swing.JOptionPane;
/**
Driver class to run TicTacToe, Theater and Draw Classes
 */
public class Driver
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to programming assignment 3");
        while(true)
        {
            System.out.println("Press 1 for question (TicTacToe)\n"
                              +"Press 2 for question (Theater)\n"
                              +"Press 3 for question (Newspaper Draw)\n"
                              +"Press Q to EXIT");
            String input = in.nextLine();
            if(input.equals("1"))
            {
                TicTacToe a = new TicTacToe();
                a.q1();
            }
            else if(input.equals("2"))
            {
                Theater b = new Theater();
                b.q2();
            }
            else if(input.equals("3"))
            {
                Draw c = new Draw("","");
                c.q3();
            }
            else if(input.equals("Q") || input.equals("q"))
            {
                JOptionPane.showMessageDialog(null, "Program was ended. See you..." );
                break;
            }
            else
            {
                System.out.println("*************************\n"
                                  +"Please type a valid input\n"
                                  +"*************************");
                continue;
            }
        }
    }
}
