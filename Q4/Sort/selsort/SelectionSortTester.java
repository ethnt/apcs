/**
   This program tests the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SelectionSortTester
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(10, 100);
  //ArrayUtil.print(a);

      SelectionSorter sorter = new SelectionSorter(a);
      sorter.sort();

   //ArrayUtil.print(a);
}

}

   
