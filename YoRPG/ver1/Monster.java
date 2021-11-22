public class Monster {
    //creates a monster with a certain name
    static int health;
    public static void Monster(){
        int health = 20;

    }
    public static boolean isAlive(String s){
        return (health != 0);
    }
}

