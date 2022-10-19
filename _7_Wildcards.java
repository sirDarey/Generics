package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 */

class Vehicle {
    private final String tyre;

    public Vehicle(String tyre) {
        this.tyre = tyre;
    }

    public String getTyre() {
        return tyre;
    }
    
    void randomFunc () {
        System.out.println("Vehicle Tyre is "+getTyre());
    }
}

class Car extends Vehicle {
    String model;

    public Car(String model, String tyre) {
        super(tyre);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    
    @Override
    public void randomFunc () {
        System.out.println("Car Tyre is "+getTyre());
        System.out.println("Car Model is "+getModel());
    }
}

public class _7_Wildcards {
    
    public static void main(String[] args) { 
        List <Vehicle> vList = new ArrayList<>();
        vList.add(new Car("Honda", "R15"));
        vList.add(new Car("4 Runner", "R16"));
        vList.add(new Vehicle("R17"));
        display(vList);
    }
    
    
    
    static void display (List<? extends Vehicle> list) {  //Upper Bound
        //For Lower Bound, super keyword is used; though the use is limited compared to upper bound
        
        list.forEach(v -> {
            v.randomFunc();    //With Polymorphism in the background, it knows which "randomFunc" to call
            //from both classes
        });
           
    }
}
