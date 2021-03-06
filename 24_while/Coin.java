/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 24 -- Get It While You Can
2021-10-26
time spent:

DISCO
- this() is in red
QCC
-
*/

public class Coin {
  public double value;
  public String upFace, name;
  public int flipCtr, headsCtr, tailsCtr;
  public double bias = .5;

  public Coin() {
    reset("heads", 0.5);
  }

  public Coin(String s) {
    this();
    name = s;
    assignValue(s);
  }

  private double assignValue (String s) {
    if (name.equals("penny"))             {value = 0.01; }
    else if (name.equals("nickel"))       {value = 0.05; }
    else if (name.equals("dime"))         {value = 0.1; }
    else if (name.equals("quarter"))      {value = 0.25; }
    else if (name.equals("half dollar"))  {value = 0.5; }
    else if (name.equals("dollar"))       {value = 1; }
    return value; //missing return statement here
  }

  public void reset (String s, double d) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
  }

  public String flip() {
    double randDbl = Math.random();
    if (randDbl < bias) {
      upFace = "heads";
      headsCtr += 1;
    }
    else {
      upFace = "tails";
      tailsCtr += 1;
    }
    flipCtr += 1;
    return upFace;
  }

  public boolean equals(Coin other) {return upFace.equals(other.upFace); }

  public String toString()          {return "" + name + "--" + upFace; }

  public String outflip()           {return "tails:" + tailsCtr + "--heads:" + headsCtr + "--flips:" + flipCtr;}

} //end Coin class
