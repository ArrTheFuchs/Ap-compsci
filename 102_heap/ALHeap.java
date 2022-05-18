
/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap {

  // instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor --- inits empty heap
   */
  public ALHeap() {
    _heap = new ArrayList<Integer>();
  }

  /**
   * toString() --- overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString() {
    return  _heap.toString();
  }// O(?)

  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty() {
    return _heap.size() != 0;
  }// O(1)

  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin() {
    return _heap.get(0);
  }// O(1)

  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * <your clear && concise procedure here>
   */
  public void add(Integer addVal) {
    _heap.add(addVal);
    // if there is only one node in the tree, return. no need to compare
    if (_heap.size() == 1) {
      return;
    }
    int newValIndex = _heap.size() - 1;
    int parent = (newValIndex - 1) / 2;

    while (_heap.get(parent) > _heap.get(newValIndex)) {
      //swap the parent and new val
      swap(parent, newValIndex);
      if(parent == 0){
        return;
      }
      //create new index vals for parent and newValIndex
      newValIndex = parent;
      parent = (newValIndex - 1) / 2;
    }

  }// O(log(n)) because in the worst case scenario you have to float through half
  // of the tree

  /**
   * removeMin() --- means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * <your clear && concise procedure here>
   */
  public Integer removeMin() {
    return 1;
  }// O(?)

  /**
   * minChildPos(int) --- helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos(int pos) {
    return 1;
  }// O(?)

  // ~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf(Integer a, Integer b) {
    if (a.compareTo(b) < 0)
      return a;
    else
      return b;
  }

  // swap for an ArrayList
  private void swap(int pos1, int pos2) {
    _heap.set(pos1, _heap.set(pos2, _heap.get(pos1)));
  }

  // main method for testing
  public static void main(String[] args) {
     ALHeap pile = new ALHeap();

     pile.add(2);
     System.out.println(pile);
     pile.add(4);
     System.out.println(pile);
     pile.add(6);
     System.out.println(pile);
     pile.add(8);
     System.out.println(pile);
     pile.add(10);
     System.out.println(pile);
     pile.add(1);
     System.out.println(pile);
     pile.add(3);
     System.out.println(pile);
     pile.add(5);
     System.out.println(pile);
     pile.add(7);
     System.out.println(pile);
     pile.add(9);
     System.out.println(pile);


     /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     System.out.println("removing " + pile.removeMin() + "...");
     System.out.println(pile);
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
  }// end main()

}// end class ALHeap
