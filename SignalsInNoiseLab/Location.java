
/**
 * Write a description of class Location here.
 *
 * @author ethanlhe
 * @version 12/10/18
 */
public class Location
{
    private int r,c;

    /**
     * Constructor for objects of class Location
     * 
     * @param   the number of rows and columns in the location.
     */
    public Location(int row, int column)
    {
        this.r = row;
        this.c = column;
    }

    /**
     * gets the number of rows in the array
     * @return      number of rows.
     */
    public int getRow()
    {
       return this.r;
    }
    /**
     * gets the number of columns in the array
     * @return      number of columns.
     */
    public int getCol()
    {
       return this.c;
    }
}
