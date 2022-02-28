/**
 * Subclass of Manager with field regionCode
 */
public class Executive extends Manager
{
    private String regionCode;
    
    public Executive()
    {

    }
    
    /**
     * Constuctor method for an instance 
     * @param name name
     * @param salary salary
     * @param department departmen
     * @param regionCode regionCode
     */
    public Executive(String name, int salary,
                    String department, String regionCode){
        super(name, salary, department);
        this.regionCode = regionCode;
    }
    
    /**
     * This function gets the regionCode
     * @return regionCode
     */
    public String getRegionCode(){
        return this.regionCode;
    }
    /**
     * This function sets the regionCode of an instance
     * @param a regionCode to be set
     */
    public void setRegionCode(String a){
        this.regionCode = a;
    }
    /**
     * Gives all details of an instance in string format
     */
    public String toString(){
        return super.toString() + " regionCode: " + regionCode;
    }
}
