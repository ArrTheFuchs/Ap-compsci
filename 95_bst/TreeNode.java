/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  TreeNode( int initValue )
  {
    _cargo = initValue;
    _lt = null;
    _rt = null;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    _cargo = initValue;
    _lt = initLeft;
    _rt = initRight;
  }


  /**
   * Returns the left subtree of this node.
   */
  TreeNode getLeft()
  {
<<<<<<< HEAD
    return _lt;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
<<<<<<< HEAD
    return _rt;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
<<<<<<< HEAD
    return _cargo;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
<<<<<<< HEAD
    _lt = theNewLeft;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
<<<<<<< HEAD
    _rt = theNewRight;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue )
  {
<<<<<<< HEAD
    _cargo = theNewValue;
=======
    /*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> d684376a7502d053c2f9dc609112fd163a78d3ea
  }

}//end class
