package src;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.sound();
        cat.eat();
        cat.sound();
    }
}