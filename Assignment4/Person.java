import java.util.*;
/**
 * General Person Class which icompares persons lexicogeapraphically
 */
public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(){
        
    }
    
    /**
        This function is constructor for the class Person.
        The constructor sets the private variable(name)
        of the class.
        @param name the name of person
     */

    public Person(String name){
        this.name = name;
    }
    
    /**
     This function compares a person with another lexicogeographically
     @param otherPerson the person to compare 
     @return 1 if person>otherperson, 0 if they're equal, -1 otherwise
     */
    @Override
    public int compareTo(Person otherPerson){
        return this.getName().compareTo(otherPerson.getName());
    }
    
    /**
     * This function returns the name of the person
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This function set the name of the person
     * @param name the name that will be given to person
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Gives details of all fields as String type
     */
    public String toString(){
        return "His/Her name is: " + this.name;
    }

}
