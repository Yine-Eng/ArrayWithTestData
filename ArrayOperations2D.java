/**
   The ArrayOperations2D class stores methods for 2D array operations.
   for the 2D Array Operations programming challenge.
*/

public class ArrayOperations2D
{
   /**
      getTotal method.
      @param array A 2D array of doubles.
      @return The total of the values stored in the
              argument array.
   */
      
   public static double getTotal(double[][] array)
   {
      double total = 0.0;
     for(double[] row : array)
       {
         for(double sum : row)
           {
             total += sum;
           }
       }
     return total;
   }

    
   /**
      getAverage method
      @param array A 2D array of doubles.
      @return The average of the values stored in the
              argument array.
   */
   
   public static double getAverage(double[][] array)
   {
    int numElements = 0;
     for(double[]row : array){
       numElements += row.length;
   }
     double total = getTotal(array);
     return total / numElements;
   }
  

   /**
      getRowTotal method.
      @param array A 2D array of double.
      @param row A specified row
      @return The total of the values stored in the
              specified row of the argument array.
   */
   
   public static double getRowTotal(double[][] array, int row)
   {
      if(row >= 0 && row < array.length)
      {
        double total = 0.0;
        for(double value : array[row])
          {
            total += value;
          }
        return total;
      }
     else
      {
        return 0.0;
      }
   }

   /**
      getColumnTotal method.
      @param array A 2D array of doubles.
      @param col A specified col
      @return The total of the values stored in the
              specified column of the argument array.
   */
   
   public static double getColumnTotal(double[][] array, int col)
   {
     if(array.length == 0 || col < 0 || col >= array[0].length)
    {
      return 0.0;

   }
     double total = 0.0;
     for (double[] row : array)
     {
       if(col < row.length)
       {
       total += row[col];
     }
   }
   return total;
   }
   

   /**
      getHighestInRow method.
      @param array A 2D array of doubles.
      @param row A specified row.
      @return The highest value stored in the
              specified row of the argument array.
   */
   
   public static double getHighestInRow(double[][] array, int row)
   {
      if(row >= 0 && row < array.length)
      {
        double highest = Double.MIN_VALUE;
        for(double value : array[row])
          {
            if(value > highest)
            {
              highest = value;
          }
          }
        return highest;
      } 
      else
      {return Double.MAX_VALUE;
      }
   }

   /**
      getLowestInRow method.
      @param array A 2D array of doubles.
      @param row A specified row.
      @return The lowest value stored in the
              specified row of the argument array.
   */
   
   public static double getLowestInRow(double[][] array, int row)
   {
      if(row >= 0 && row < array.length)
      {
        double lowest = Double.MAX_VALUE;
        for(double value : array[row])
          {
            if(value < lowest)
            {
              lowest = value;
            }
          }
            return lowest;
          } else {
        return Double.MAX_VALUE;
      }
   }
   /**
      getElementCount method.
      @param array A 2D array of doubles.
      @return The number of elements in the
              argument array.
   */
   
   public static int getElementCount(double[][] array)
   {
      int count = 0;
     for (double[] row : array) 
     {
       count += row.length;
   }
     return count;
   }
}