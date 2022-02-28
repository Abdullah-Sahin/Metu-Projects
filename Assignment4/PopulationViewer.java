import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This program displays the people in the population.
 */
public class PopulationViewer
{
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 400;
    /**
     * This function shows tha names of people in population
     * @param population population
     */
    public void viewNames(Population population)
    {
        JFrame frame = new JFrame();
        //The button to trigger the calculation
        JButton button = new JButton("Show next person in the population");
        //The label for displaying the results
        JLabel label = new JLabel("Person name: " + population.getPersonByOrder(population.getOrder()).getName());
        //The panel that holds the user−interface components
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        class IncreaseOrderOfPersonListener implements ActionListener
        {   
            /**
             * This functions gives the button the feature that when it's pressed the order of population increases and new person emerges on frame
             */
            public void actionPerformed(ActionEvent event)
            {
                population.increaseOrder();
                label.setText("Person name: " + population.getPersonByOrder(population.getOrder()).getName());
            }
        }
        ActionListener listener = new IncreaseOrderOfPersonListener();
        button.addActionListener(listener);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);       
    }
    
}