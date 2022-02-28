import java.awt.*;
import javax.swing.*;
/**
Class CarComponent forms a Component to be attached to frame.
 */
public class CarComponent extends JComponent
{
   private int a;
   /**
   Generates a component
   @param n x-coordinate of the upper-left corner of a car.
    */
   public CarComponent(int n)
   {
       a = n;
   }
   /**
   Draws two car with different colors on the component.
   @param g is the abstract initializer.
    */
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
       
      Car car1 = new Car(0+a, 5, Color.red, Color.black);
       
      int x = this.getWidth() - 60;
      int y = this.getHeight() - 40;
       
      Car car2 = new Car(x-a, y, new Color(75,75,75), Color.black);
       
      car1.draw(g2);
      car2.draw(g2);
   }
}
