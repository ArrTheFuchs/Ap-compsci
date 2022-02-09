
/***
  class MergeSort
  Implements mergesort on array of ints.

Stack Underflow Ariel, Russel, Nada
APCS
HW 61 -- Instructions so Simple... -- Implement Merge Sort
time: 1 hours


  Summary of Algorithm: Our algorithm splits arrays into sets of two recursively until there are

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] bear = new int[a.length+b.length];
    int actr = 0;
    int bctr = 0;
    for(int i = 0; i < bear.length; i++){
      if(actr > a.length - 1){
        bear[i] = b[bctr];
        bctr++;
      }
      else if(bctr > b.length -1){
        bear[i] = a[actr];
        actr++;
      }

      else if(a[actr] >= b[bctr]){
        bear[i] = b[bctr];
        bctr++;
      }
      else{
        bear[i] = a[actr];
        actr++;
      }
    }

    return bear;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr ){
    if(arr.length < 2){
      return arr;
    }
    int splitPoint = arr.length/2;
      int[] deck1 = new int[splitPoint];
      int[] deck2 = new int[arr.length - splitPoint];

      //deck 1
      for( int i = 0; i < splitPoint; i++ ) {
        deck1[i] = arr[i];
      }

      //deck 2
      for( int i = splitPoint; i < arr.length; i++){
        deck2[i-splitPoint] = arr[i];
      }

      deck1 = sort(deck1);
      deck2 = sort(deck2);

      //merge deck
      int[] result = merge( deck1, deck2 );

      //return merged deck
      return result;
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
