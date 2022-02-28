
/**
 * Subclass of manager with fiedl department
 */
public class Manager extends Employee
{
    // instance variables - replace the example below with your own
    private String department;

    public Manager()
    {

    }
    
    /**
     * Constructor of instance from Manager class with name, salary and departmen
     */
    public Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    
    /**
     * Sets the department of manager
     * @param department the department to be set
     */
    public void setDepartment(String department){
        this.department = department;
    }
    
    /**
     * This function return the department of instance
     * @return departmen
     */
    public String getDepartment(){
        return this.department;
    }
    
    /**
     * This fucntion gives all details of an instance in strinf form
     */
    public String toString(){
        return super.toString() + " deparment: " + this.department;
    }
}
