
public class Main
{
   public static void main(String[] args)
   {
      double[][] darray = { { 98.7, 89.2, 55.1 },
                            { 77.6, 99.9, 62.2 } };

      // Process the double array.
      System.out.println("\nProcessing the double array.");
      System.out.println("Total : " +
                         ArrayOperations2D.getTotal(darray));
      System.out.println("Average : " +
                         ArrayOperations2D.getAverage(darray));
      System.out.println("Total of row 0 : " +
                         ArrayOperations2D.getRowTotal(darray, 0));
      System.out.println("Total of row 1 : " +
                         ArrayOperations2D.getRowTotal(darray, 1));
      System.out.println("Total of col 0 : " +
                         ArrayOperations2D.getColumnTotal(darray, 0));
      System.out.println("Total of col 2 : " +
                         ArrayOperations2D.getColumnTotal(darray, 2));
      System.out.println("Highest in row 0 : " +
                         ArrayOperations2D.getHighestInRow(darray, 0));
      System.out.println("Highest in row 1 : " +
                         ArrayOperations2D.getHighestInRow(darray, 1));
      System.out.println("Lowest in row 0 : " +
                         ArrayOperations2D.getLowestInRow(darray, 0));
      System.out.println("Lowest in row 1 : " +
                         ArrayOperations2D.getLowestInRow(darray, 1));
   }
}