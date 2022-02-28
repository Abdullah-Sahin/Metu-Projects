import java.util.*;
/**
An integer pair which shows the coordinates of a Drunkard after
100 random steps.
 */
public class DrunkardWalk
{
    private static int stepNumber;
    private static int xCoor = 0;
    private static int yCoor = 0;
    /** Generates a drunkard whose initial position is (0,0)
     */
    public DrunkardWalk() 
    {
        this.xCoor=0;
        this.yCoor=0;
    }
    /**
    Moves the drunkard from initial (0,0) 
    position according to given direction by 1. 
    @param n determines the direction
     */
    public static void drunkardWalker(int n)
    {
       if(n==1)
       {
           xCoor += 1;
       }
       if(n==2)
       {
           xCoor -= 1;
       }
       if(n==3)
       {
           yCoor += 1;
       }
       if(n==4)
       {
           yCoor -= 1;
       }
    }
    /**
    Returns an integer between 1-4 inclusive
     */
    public static int randomDirection()
    {
        Random r = new Random();
        return r.nextInt(4)+1;
    }
    /**
    Moves Drunkard randomly in x-y coordinates by -1,1
     */
    public static void walkRandomly() 
    {
        stepNumber = 100;
        while(stepNumber>0)
        {
            drunkardWalker(randomDirection());
            stepNumber--;
        }
    }
    /**
    Returns the x-coordinate of Drunkard
     */
    public static int getxCoor()
    {
        return xCoor;
    }
    /**
    Returns the y-coordinate of Drunkard
     */
    public static int getyCoor()
    {
        return yCoor;
    }
}

