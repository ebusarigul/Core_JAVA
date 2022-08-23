package MySrc.Gun38.soru1;

public class VehicleMain {
    public static void main(String[] args) {


        Vehicle tesla=new TeslaCar("Tesla Plaid",100);
        ((TeslaCar)tesla).changeBattery();

        Vehicle toyota=new ToyotaPrius("Toyota Prius",1.8);
        ((ToyotaPrius)toyota).changeOil();
        ((ToyotaPrius)toyota).changeBattery();

        Vehicle otobus=new Bus("Temsa",4.4);

        for (Vehicle v : Vehicle.araclar){
            System.out.println(v);
        }

    }
}
