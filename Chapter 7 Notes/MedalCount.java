
/**
 * Write a description of class MedalCount here.
 *
 * @author ethanlhe
 * @version 11/30/18
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;

    /*
     * Can use array literals to create 2D arrays by nesting
     *      curly brackets.
     */
    private int[][] counts = 
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 1, 0 },
            { 1, 1, 0 },
            { 0, 1, 1 },
            { 0, 0, 0 },
            { 1, 1, 1 },
        };

    /**
     * Constructor for objects of class MedalCount
     */
    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array. It would be followed
         *      by nested loops to initialize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        //for...
    }

    /**
     * Prints the entire table.
     */
    public void printTable()
    {
        //good as long as constants are right for(int row = 0; row < COUNTRIES; row++)
        //better: 
        for(int row = 0; row < this.counts.length; row++)
        {
            //good as long as constants are right for(int column = 0; column < MEDALS; column++)
            //better for(int column = 0; column < this.count[0].length; column++)
            //best:
            for(int column = 0; column < this.counts[row].length; column++)
            {
                System.out.print(this.counts[row][column] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Adds the total medals
     * 
     * @param   countryIndex    the index of the country in the table
     *                              whose medals to sum
     * @return  the sum of the medals for the specified country index
     */
    public int medalSum(int countryIndex)
    {
        int sum = 0;
        for(int col = 0;
        col < this.counts[countryIndex].length;
        col++)
        {
            sum += this.counts[countryIndex][col];
        }
        return sum;
    }

    /**
     * Sums the mdeals of a given type specified by the medal index
     * 
     * @param   medalIndex  the index of a given type of medal to sum
     * @return  the sum of medals of a given type specified to the 
     *              medal index
     */
    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;

        for(int row = 0; row < this.counts.length; row++)
        {
            sum+= this.counts[row][medalIndex];
        }
        return sum;
    }
}