import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Integer> line;

//O(1)
    public ArrayPriorityQueue(){
      line = new ArrayList<Integer>();
    }

//O(n) in worst case scenario
    public void add( int x ){
      if(checkPriority(x)){
        line.add(0, x);
      }
      else{
        line.add(x);
      }
  }

//O(1)
    public boolean isEmpty(){
      return (line.size() <= 0);
  }
//O(n)
    public int peekMin(){
      int currentMin = line.get(0);
      for( int val: line){
            if( val < currentMin  ){
                currentMin = val;
            }

        }
        return currentMin;
    }

//O(n)
    public int removeMin(){
      int index = line.indexOf(peekMin());
      return line.remove(index);

  }

  //Helper method
  //checks if the value has priority.
  //O(1)
    public static boolean checkPriority(Integer val){
      return (val % 3 == 0);
    }


//O(n)
    public String toString() {
            return line.toString();
        }


//taken from Piazza (thanks LL)
   public static void main(String[] args){
     ArrayPriorityQueue poo = new ArrayPriorityQueue();
     poo.add(5);
     poo.add(3);
     poo.add(4);
     poo.add(7);
     poo.add(8);
     poo.add(1);
     System.out.println("poo: "+  poo);

     System.out.println();
     System.out.println("min: " + poo.peekMin());
     System.out.println("removeMin: " + poo.removeMin());
     System.out.println("min: " + poo.peekMin());
     System.out.println("removeMin: " + poo.removeMin());
     System.out.println("min: " + poo.peekMin());
     System.out.println("removeMin: " + poo.removeMin());

     System.out.println();
     System.out.println("poo: "+  poo);
   } //end of main method

} //end of class
