package MySrc.Gun38.soru1;

import java.util.ArrayList;

public class Vehicle {
    private String model;
    private double engine;

    public static ArrayList<Vehicle> araclar=new ArrayList<>();

    public Vehicle(String model, double engine) {
        this.model = model;
        this.engine = engine;
        araclar.add(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Model= "+model+" Engine= "+engine;
    }
}
