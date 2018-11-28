
/**
 * Write a description of class ArrayOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    public static void One()
    {
        int[] x = {8,4,5,21,7,9,18,2,100};
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[8]);
        System.out.println(x[x.length-1]);
        for(int i = 0; i < 9;i++)
        {
            System.out.println(x[i]);
        }
        for(int i = 0; i < 9;i++)
        {
            System.out.println(i+1 + ": "+ x[i]);
        }
        for(int i = 8; i >= 0;i--)
        {
            System.out.println(i + 1 + ": "+ x[i]);
        }
        for(int numbers : x)
        {
           System.out.println(numbers);
        }
    }
}
