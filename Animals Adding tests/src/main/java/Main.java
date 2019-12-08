public class Main{
    public static void main(String[] args){
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        home.adoptPet(dog1);
        home.adoptPet(dog2);
        home.adoptPet(dog2);
        Home.makeAllSounds();
    }
}