import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnimalsTest extends Main {
    @Test
    void TestDogEats(){
        assertEquals("Food",Dog.eats());
//        assertEquals("food",Dog.eats()); This test fails
    }
    @Test
    void TestCatEats(){
        assertEquals("Food",Cat.eats());
//        assertEquals("meat",Cat.eat()); This test fails
//        assertEquals("food",Cat.eat()); This test fails
    }
    @Test
    void TestDogSound(){
        assertEquals("Barks",Dog.sound());
//        assertEquals("Meow",Dog.sound());//This test fails
    }
    @Test
    void TestCatSound(){
        assertEquals("Meow",Cat.sound());
//        assertEquals("Bark",Cat.sound());//This test fails
    }
}