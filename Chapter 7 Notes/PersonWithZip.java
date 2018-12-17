
/**
 * Write a description of class PersonWithZip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonWithZip
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int zipCode;

    /**
     * Constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String name1, String name2, int code)
    {
        this.firstName = name1;
        this.lastName = name2;
        this.zipCode = code;
    }

    /**
     * gets the zip code of the person
     * 
     * @return    the zip code of the person
     */
    public int getZip(int y)
    {
        return this.zipCode;
    }
    /**
     * returns a string with all instance variables with labels
     * 
     * @return      a string with all instance variables with labels
     */
    public String toString()
    {
        String hi = ("Name: " + firstName + " " + lastName + "Zipcode: " + zipCode);
        return hi;
    }
    
}
