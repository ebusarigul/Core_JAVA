package Odevler.Gun38Odevler.soru3;

import java.util.ArrayList;

public class Bicycle implements IVehicle{

    private int speed;
    private int gear;


    public Bicycle() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void changeGear(int gears) {
        System.out.println("vitesi "+gears+" a takıyorum");
        setGear(gears);
    }

    @Override
    public void speedUp(int speeds) {
        System.out.println("hızı "+speeds+" e ayarlıyorum");
        setSpeed(speeds);

    }
    @Override
    public void applyBrakes(int brakes) {
        System.out.println("hızımı "+brakes+" e kadar düsürüp yavaslıyorum");
        setSpeed(brakes);
    }
    public void printAll(){
        System.out.println("current SPEED="+ speed+"km/h"+"\n"+"GEAR count is= "+gear);
    }

    @Override
    public String toString() {
        return "hızım = "+ speed + " vitesim="+gear;
    }
}

