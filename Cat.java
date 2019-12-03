package src;
public class Cat extends Animals{
    private static String name="Tom";
    public Cat(){
        super(name);
    }
    public static String sound(){
        return "Meow";
    }
}