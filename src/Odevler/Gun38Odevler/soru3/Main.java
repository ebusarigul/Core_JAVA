package Odevler.Gun38Odevler.soru3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("******Bicycle******");
        Bicycle bc = new Bicycle();
        bc.speedUp(35);
        bc.changeGear(20);
        bc.applyBrakes(10);
        bc.printAll();
        System.out.println();

        System.out.println("******Car******");
        Car car = new Car();
        car.speedUp(130);
        car.changeGear(7);
        car.applyBrakes(80);
        car.printAll();
    }
}
