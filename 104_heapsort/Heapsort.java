/**
 * class Heapsort
 * SKELETON
 * sorts in-place by heapifying data, then repeatedly pulling from heap
 */

public class Heapsort
{

  /**
   * int[] sort( int[] data )  --- returns sorted input array
   * Applies heapsort algorithm (in place)
   */
  public int[] sort( int[] data )
  {
    System.out.print( "Input array: \t" );
    printArr( data );


    //STEP 1: heapify array contents
    //slot 0 will contain root
    //(heap will grow from L to R)

    maxHeapify(data);
    System.out.println( "Array heapified. Root at index 0" );
    printArr( data );


    //STEP 2: repeatedly pull from heap until empty
    //(Sorted region will grow from R to L)
<<<<<<< HEAD
    for( int lastLeaf = (data.length - 1) ; lastLeaf > 0; lastLeaf-- ) {
=======
    for( int lastLeaf = ; ;  ) {
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
      //set aside root val
      int tmp = data[0];

      //swap last leaf (rightmost on bottom level) into root pos
<<<<<<< HEAD
      data[0] = data[lastLeaf];


      //walk now-out-of-place root node down the tree...
      int pos = 0;
      int maxChildPos;

      while( pos <= lastLeaf) {
        maxChildPos = maxChildPos(pos, lastLeaf, data);
=======

      //walk now-out-of-place root node down the tree...
      int pos =
      int minChildPos;
      int maxChildPos;

      while( . ) {
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea

        //choose child w/ max value, or check for child

        //if no children, then i've walked far enough
<<<<<<< HEAD
        if ( maxChildPos == -1 ) {
          break;
        }
        //if i am greater than my greatest child, i've walked far enough
        else if (data[maxChildPos] <= data[pos]) {
          break;
        }
        //if i am < greatest child, swap with that child
        else {
          swap(maxChildPos, pos, data);
          pos = maxChildPos;
=======
        if ( maxChildPos == -1 )
          break;
        //if i am greater than my greatest child, i've walked far enough
        else if (  )
          break;
        //if i am > least child, swap with that child
        else {

>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
        }
      }

      //overwrite last leaf with old root val
<<<<<<< HEAD
      data[lastLeaf] = tmp;
    } //end of for loop
=======

    }

>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea

    //STEP teh LAST: return modified array
    return data;

<<<<<<< HEAD
  }//end sort() -- O(n^2) because there is a while loop inside a for loop
=======
  }//end sort() -- O(?)


>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea

  private void minHeapify( int[] a )
  {

    for( int i=1; i<a.length; i++ ) {
      //add a[i] as leaf
<<<<<<< HEAD
      int addValPos = i; //val to add is next non-heap element

      //now must percolate up
      while(addValPos > 0 ) { //potentially swap until reach root
        int addVal = a[addValPos];
        //pinpoint parent
        int parentPos = (addValPos-1) / 2;

        if (addVal < a[parentPos]) {
          swap(addValPos,parentPos, a);
=======
      int addValPos = _heap.size() - 1; //val to add is next non-heap element

      //now must percolate up
      while(addValPos > 0 ) { //potentially swap until reach root

        //pinpoint parent
        int parentPos = (addValPos-1) / 2;

        if (addVal.compareTo(_heap.get(parentPos)) < 0) {
          swap(addValPos,parentPos);
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
          addValPos = parentPos;
        }
        else
          break;
      }
    }
  }//end minHeapify() -- O(logn)



  private void maxHeapify( int[] a )
  {
    for( int i=1; i<a.length; i++ ) {
      //add a[i] as leaf
<<<<<<< HEAD
      int addValPos = i; //val to add is next non-heap element

      //now must percolate up
      while(addValPos > 0 ) { //potentially swap until reach root
        int addVal = a[addValPos];
=======
      int addValPos = _heap.size() - 1; //val to add is next non-heap element

      //now must percolate up
      while(addValPos > 0 ) { //potentially swap until reach root
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea

        //pinpoint parent
        int parentPos = (addValPos-1) / 2;

<<<<<<< HEAD
        if (addVal > a[parentPos]) {
          swap(addValPos,parentPos, a);
=======
        if (addVal.compareTo(_heap.get(parentPos)) > 0) {
          swap(addValPos,parentPos);
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
          addValPos = parentPos;
        }
        else
          break;
      }
    }
  }//end maxHeapify() -- O(logn)



  //return position of child with least value in input array
  //last indicates the last index to look at in the array (represents partition)
  private int minChildPos( int pos, int last, int[] a )
  {
    int retVal;
    int lc = 2*pos + 1; //index of left child
    int rc = 2*pos + 2; //index of right child

    //pos is not in the heap or pos is a leaf position
    if ( pos < 0 || pos >= last || lc >= last )
      retVal = -1;
    //if no right child, then left child is only option for min
    else if ( rc >= last)
      retVal = lc;
    //have 2 children, so compare to find least
<<<<<<< HEAD
    else if (a[lc] < a[rc])
=======
    else if (_heap.get(lc).compareTo(_heap.get(rc)) < 0 )
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
      retVal = lc;
    else
      retVal = rc;
    return retVal;
  }



  //return position of child with greatest value in input array
  private int maxChildPos( int pos, int last, int[] a )
  {
    int retVal;
    int lc = 2*pos + 1; //index of left child
    int rc = 2*pos + 2; //index of right child

    //pos is not in the heap or pos is a leaf position
    if ( pos < 0 || pos >= last || lc >= last )
      retVal = -1;
    //if no right child, then left child is only option for min
    else if ( rc >= last )
      retVal = lc;
    //have 2 children, so compare to find greatest
<<<<<<< HEAD
    else if ( a[lc] > a[rc])
=======
    else if ( _heap.get(lc).compareTo(_heap.get(rc)) > 0 )
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
      retVal = lc;
    else
      retVal = rc;
    return retVal;
  }



  //--------------v- HELPER METHODS -v--------------
  private int minOf( int a, int b ) { return (a<b)?a:b; }

  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  public static int[] buildArray( int size, int hi )
  {
    int[] retArr = new int[size];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( hi * Math.random() );
    return retArr;
  }
  //--------------^- HELPER METHODS -^--------------




  //main method for testing
  public static void main( String[] args )
  {
<<<<<<< HEAD

=======
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
    int[] a = buildArray( 10, 10 );

    printArr(a);

    Heapsort h = new Heapsort();

    h.sort(a);

    printArr(a);
<<<<<<< HEAD
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
=======
>>>>>>> 26f37da27cd335f029237c60ab2edf69984967ea
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main()

}//end class
