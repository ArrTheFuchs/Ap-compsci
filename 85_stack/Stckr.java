/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Z> hotCakes = new ALStack<Z>();
    hotCakes.push(1);
    hotCakes.push(2);
    hotCakes.push(3);
    hotCakes.push(4);
    hotCakes.push(5);
    System.out.println("finished adding");

    hotCakes.pop();
    hotCakes.pop();
    hotCakes.pop();
    hotCakes.pop();
    hotCakes.pop();
    hotCakes.pop();
    System.out.println("finished popping no more cake");

    //Stack<Z> hotCakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class
