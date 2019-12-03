import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void TestDogEats(){
        assertEquals("Food",Dog.eat());
//        assertEquals("Meat",Dog.eat());//This test fails
    }
    @Test
    void TestCatEats(){
        assertEquals("Food",Cat.eat());
//        assertEquals("Meat",Cat.eat());//This test fails
    }

}
class CatTest{
    @Test
    void TestDogSound(){
        assertEquals("barks",Dog.sound());
//        assertEquals("Meow",Dog.sound());//This test fails
    }

    @Test
    void TestCatSound(){
        assertEquals("Meow",Cat.sound());
//        assertEquals("bark",Cat.sound());//This test fails
    }
}
