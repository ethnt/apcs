/**
   This program tests the heap sort algorithm.
*/
public class InsertionSortTester
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      ArrayUtil.print(a);
      InsertionSorter sorter = new InsertionSorter(a);
      sorter.sort();
      ArrayUtil.print(a);
      

   }
}

