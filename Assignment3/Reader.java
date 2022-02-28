/**
 The class collects and saves all informations of a reader 
 */
public class Reader
{
    private String name;
    private String TCID;
    private String answer;
    
    /**
     Constructor of objects of class Reader
     @param name the name of reader
     @param TCID the id of reader
     @param answer the answer of reader
     */
    public Reader(String name, String TCID, String answer)
    {
        this.name = name;
        this.TCID = TCID;
        this.answer = answer;
    }
    /**
     Finds the name of an object reader
     * @return the name of reader 
     */
    public String getName()
    {
        return this.name;
    }
    /**
     Finds the id of an object reader
     * @return the id of reader 
     */
    public String getTCID()
    {
        return this.TCID;
    }
    /**
     Finds the answer of an object reader
     * @return the answer of reader 
     */
    public String getAnswer()
    {
        return this.answer;
    }
}
