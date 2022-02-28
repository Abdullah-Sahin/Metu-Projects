import javax.swing.JFrame;
/**

 */ 
public class CarViewer 
{
   /**
   Opens a frame for users and shows two moving cars on opposite directions
    */
    public static void q3()
   {
      JFrame frame = new JFrame();
       
      frame.setSize(600, 400);
      frame.setTitle("Two Cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      int x = 0;
      while(x <= (520*80))
      {
          
      
          CarComponent component = new CarComponent(x/80);
          frame.add(component);
       
          frame.setVisible(true);
          if(x != 520*80)
          {
          frame.remove(component);
          }
      x ++;
      }
      
   }
}
