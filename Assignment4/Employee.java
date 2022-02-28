/**
 * Subclass of person which has field salary
 */
public class Employee extends Person
{
    private int salary;
    
    public Employee(){
        
    }
    
    /**
     *Constructor of an instance with name and salary
     *@param name name
     *@param salary salary
     */
    public Employee(String name, int salary){
        super(name);
        this.salary = salary;
    }
    
    /**
     * this function sets the salary ef employee
     * @param salary the salary to be set
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    /**
     * this function return the salary of person
     * @return salary
     */
    public int getSalary(){
        return this.salary;
    }
    
    /**
     * Gives all details of fields in string form
     */
    public String toString(){
        return super.toString() + " Salary: " + this.salary;
    }

}
