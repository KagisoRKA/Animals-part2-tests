package src;
import src.Animals;
public class Dog extends Animals {
    private static String name="spike";
    public Dog(){
        super(name);
    }
    public static String sound(){
        return "barks";
    }
}