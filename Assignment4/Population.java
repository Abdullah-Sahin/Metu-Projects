import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
public class Population
{
    private ArrayList<Person> people = new ArrayList<>();
    private static int order = 0;
    
    /**
     * Constructor of an instance of Class with no args
     */
    public Population()
    {
        
    }
    
    
    /**
     * This functions saves new persons to people list
     * @param person person to be added
     */
    public void addPerson(Person person){
        this.people.add(person);
    }
    
    /**
     * this function increases the field order by 1
     */
    public void increaseOrder(){
        if(order<people.size()){
            this.order += 1;
        }
        else{
            JOptionPane.showMessageDialog(null,"No more person");
        }
    }
    
    /**
     * this functions returns the order of instance
     * @return order
     */
    public int getOrder(){
        return this.order;
    }
    
    /**
     * This function return the person in the given order
     * @param order the order
     * @return person in the specified order in people list
     */
    public Person getPersonByOrder(int order){   
        return people.get(order);
    }
    
    /**finds the people according to their names
     * @param name is the name of person 
     * @return people who has the name given
     */
    public Person getPersonByName(String name){
        Person person = null;
        for(int i = 0; i < people.size(); i++){
            if(getPersonByOrder(i).getName().equals("name")){
                person = getPersonByOrder(i);
            }
        }
        return person;
    }
    
    /**
     * Sorts the people lexicogeographically
     */
    public void sortByName(){
            for(int i = 0; i < people.size() - 1;i++){
                if(people.get(i).getName().compareTo(people.get(i+1).getName()) >= 1){
                    Person temporary = people.get(i);
                    people.set(i, people.get(i+1));
                    people.set(i+1, temporary);
                    i = 0;
                }
            }
    }
}
