//Stats Driver
public class StatsDriver{
	public static void main(String[] args){
		Stats hippie = new Stats();
		System.out.println( hippie.mean(4, 6) + "...expecting 5");
		System.out.println( hippie.mean(4.5 , 5.5) + "...expecting 5.0");
		System.out.println( hippie.max(4, 5) + "...expecting 5");
      	System.out.println( hippie.max(4.5, 5.5) + "expecting 5.5");
      	System.out.println( hippie.geoMean(4, 6) + "expecting 4");
      	System.out.println( hippie.geoMean(4.5, 6.5) + "expecting 5.40833");
    }
}
