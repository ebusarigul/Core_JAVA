package Gun35._01_KalıtımOrnek;

public class Arac {

    private String renk;
    private double motor;
    private String marka;

    public Arac() {
    }

    public Arac(String renk, double motor, String marka) {
        this.renk = renk;
        this.motor = motor;
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }
    public double getMotor() {
        return motor;
    }

    public String getMarka() {
        return marka;
    }
    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", marka='" + marka + '\'' +
                '}';
    }
}
