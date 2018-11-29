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
       int temp = values[0];
       values[0] = values[values.length-1];
       values[values.length-1] = temp;
   }
   public void shiftRight()
   {
       int temp = this.values[this.values.length-1];
       for(int i = values.length-1; i >0; i--)
       {
           values[i] = values[i-1];
       }
       this.values[0] = temp;
   }
   public void makeEven()
   {
       for(int i = 0; i<values.length; i++)
       {
           if(this.values[i] % 2 == 0)
           {
               this.values[i] = 0;
            }
        }
   }
   public void replaceNeighbor()
   {
       int[] copied = new int[this.values.length];
       for(int i = 0;i<copied.length;i++)
       {
            copied[i] = values[i];
        }
       for(int i = 1; i<values.length-1; i++)
       {
           if(copied[i+1] > copied[i-1])
           {
               this.values[i] = copied[i+1];
           }
           else if(copied[i-1] > copied[i+1])
           {
               this.values[i] = copied[i-1];
           }
           if(copied[i+1] == copied[i-1])
           {
               this.values[i] = copied[i];
           }
        }
        
    }
   public static void main( String[] args )
   { 
      int[] testValues = { 3, 5, 4, 1, 2, 5, 8, 2, 4};
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      tester.replaceNeighbor();
      tester.printArray();
      
   }
}