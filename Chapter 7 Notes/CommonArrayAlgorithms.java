import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for(int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray(10, 50); //10 is length 50 is max value
        for (int i = 0; i <array.length; i++) {
            if (i < array.length-1) {
                System.out.print(array[i] + " | "); 
            }
            else {
                System.out.print(array[i]); 
            }
        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array = createRandomArray(20, 5);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                System.out.println("Index of " + valueToFind + ": " + i);
                return;
            }
        }
        System.out.println("The array does not contain " + valueToFind);
    }

    /*
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
        int[] array = createRandomArray( 10, 50 );
        printArray(array);
        
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
        printArray(array);
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array = createRandomArray( 10, 50 );
        int maxValue = array[0];
        for(int number : array)
        {
            if(number > maxValue)
            {
                maxValue = number;
            }
        }
        printArray( array );
        System.out.println("The max value is: " + maxValue);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] array = createRandomArray( 10, 50 );
        int min = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] <= min)
            {
                min = array[i];
            }
        }
        System.out.println(min);
        printArray(array);
    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
        int[] yote = createRandomArray(10,20);
        int[] copied = new int[yote.length];
        for(int i = 0;i<copied.length;i ++){
            copied[i] = yote[i];
        }
        printArray(yote);
        printArray(copied);
        return copied;
    }

}
