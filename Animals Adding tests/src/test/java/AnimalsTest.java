import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnimalsTest extends Main {
    @Test
    void TestDogEats(){
        Dog dog = new Dog();
        assertEquals("Food",dog.eats());
//        assertEquals("food",dog.eats()); This test fails
    }
    @Test
    void TestCatEats(){
        Cat cat = new Cat();
        assertEquals("Food",cat.eats());
//        assertEquals("meat",cat.eat()); This test fails
//        assertEquals("food",cat.eat()); This test fails
    }
    @Test
    void TestDogSound(){
        Dog dog = new Dog();
        assertEquals("Barks", dog.sound());
//        assertEquals("Meow",dog.sound());//This test fails
    }
    @Test
    void TestCatSound(){
        Cat cat = new Cat();
        assertEquals("Meow",cat.sound());
//        assertEquals("Bark",cat.sound());//This test fails
    }
}