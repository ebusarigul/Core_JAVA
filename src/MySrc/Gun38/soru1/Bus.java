package MySrc.Gun38.soru1;

class Bus extends Vehicle implements Diesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println("otobüsün diesel yakıtı bitti");

    }

    @Override
    public String drive() {
        System.out.println("otobus sürülüyor");
        return null;
    }
}
