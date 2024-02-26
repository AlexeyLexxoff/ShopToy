package Shop.Toys;

import java.util.LinkedList;
import java.util.Random;

public class Toy {
    Random random = new Random();
    private String toyName;
    int ID;
    double probabilityDrop;
    public Toy(int ID, String toyName, double probabilityDrop) {
        this.ID = ID;
        this.toyName = toyName;
        this.probabilityDrop = probabilityDrop;
    }
    public void putToy(LinkedList<Toy> list, Toy t){
        list.add(t);
    }
    public Toy getToy(LinkedList<Toy> list, int i){
        return list.get(i);
    }

    @Override
    public String toString() {
        return "ID: " + ID + " Игрушка: " + toyName;
    }

    public String getToyName(){
        return toyName;
    }


}