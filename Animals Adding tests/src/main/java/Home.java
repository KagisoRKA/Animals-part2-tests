import java.util.*;
public class Home{
    static ArrayList<Animals> pets = new ArrayList<>();
    public void adoptPet(Animals pet){
        if(pets.contains(pet)){
            System.out.println("Oops!!... that pet has already been adopted");
        }else{
            pets.add(pet);
            System.out.println("Pet has just been adopted.");
        }
    }
    public static void makeAllSounds(){
        for (Animals pet: pets) {
            System.out.println(pet.sound());
        }
    }
}