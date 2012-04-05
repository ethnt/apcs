import java.util.Arrays;
import java.util.Scanner;

/**
   This program tests the binary search algorithm.
*/
public class BinarySearchTester
{  
   public static void main(String[] args)
   {  
      // Construct random array
   
      int[] a = ArrayUtil.randomIntArray(20, 100);
      Arrays.sort(a);
      ArrayUtil.print(a);
      BinarySearcher searcher = new BinarySearcher(a);
      Scanner in = new Scanner(System.in);

      boolean done = false;
      while (!done)
      {
         System.out.print
               ("Enter number to search for, -1 to quit:");
         int n = in.nextInt();
         if (n == -1) 
            done = true;
         else
         {
            int pos = searcher.search(n);
            System.out.println("Found in position " + pos);
         }
      }
   }
}
