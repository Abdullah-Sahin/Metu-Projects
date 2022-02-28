import java.util.*;
/**
Tester Class for DrunkardWalk Class
 */
public class WalkTester
{
    public static void q1()
    {
    DrunkardWalk walker = new DrunkardWalk();
    walker.walkRandomly();
    System.out.println("\nAfter walking, new coordinates: ("
    +walker.getxCoor()+","+walker.getyCoor()+")");
    }
}
