import java.util.*;
public class Home{
    ArrayList<Animals> pets = new ArrayList<>();
    public void adoptPet(Animals pet){
        if(pets.contains(pet)){
            System.out.println("Oops!!... that pet has already been adopted");
        }else{
            pets.add(pet);
            System.out.println("Pet has just been adopted.");
        }
    }
    public void makeAllSounds(){
        for(Animals a: pets){
            a.sound();
        }
    }
}