import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
 
/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car 
{
   private int xLeft;
   private int yTop;
   private Color bodyColor;
   private Color tireColor;
    
   /**
      Constructs a car with a given top left corner, body color and 
      tire color.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param tireColor the color of tires
      @param bodyColor the color of body
   */
   public Car(int x, int y, Color bodyColor, Color tireColor)
   {
      xLeft = x;
      yTop = y;
      this.tireColor = tireColor;
      this.bodyColor = bodyColor;
   }
    
   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle(xLeft, yTop + 15, 60, 10);
      Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 25, 10, 10);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 25, 10, 10);
       
      // The Bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 15);
       
      // The front of the roof
      Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop+5);
       
      // The rear of the roof
      Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop+5);
       
      // The bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 15);
       
      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4); 
      g2.setColor(bodyColor);
      g2.draw(body);
      g2.fill(body);
      g2.setColor(tireColor);
      g2.draw(frontTire);
      g2.fill(frontTire);
      g2.draw(rearTire);
      g2.fill(rearTire);
      g2.setColor(Color.black);
      g2.draw(frontWindshield);
      g2.draw(roofTop);
      g2.draw(rearWindshield);
       
   }
}
