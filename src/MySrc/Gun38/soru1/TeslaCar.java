package MySrc.Gun38.soru1;

class TeslaCar extends Vehicle implements Electric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("teslanın pil ömrü tükendi değişin");

    }

    @Override
    public String drive() {
        System.out.println("araba sürülüyor");
        return null;
    }
}
