package src;
import java.util.*;
import java.util.ArrayList;

public class Home {
    ArrayList<Animals> list = new ArrayList<Animals>();
    public void adoptpet(Animals pet) {
        list.add(pet);
    }
    public void makeAllsound() {
        for (Animals a : list) {
            a.sound();
        }
    }
}