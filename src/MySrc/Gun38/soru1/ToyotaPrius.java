package MySrc.Gun38.soru1;

class ToyotaPrius extends Vehicle implements Electric,Gas {
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("priusun pil bitiyor");

    }

    @Override
    public void changeOil() {
        System.out.println("priusun yag değişimi geldi");

    }

    @Override
    public String drive() {
        System.out.println("araba sürülüyor");
        return null;
    }
}
