import java.util.Arrays;

public class ArrayMethods
{
   private int[] values;
   public ArrayMethods(int[] initialValues)
   {
      this.values = initialValues;
   }
   public void printArray()
   {
      System.out.println(Arrays.toString(this.values));
   }
   public void swapFirstAndLast()
   {
      this.values[0] = this.values[values.length-1];
   }
   public void shiftRight()
   {

   }

   public static void main( String[] args )
   {
      int[] testValues = { 3, 5, 6, 1 };
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      tester.swapFirstAndLast();
      tester.printArray();
   }
}