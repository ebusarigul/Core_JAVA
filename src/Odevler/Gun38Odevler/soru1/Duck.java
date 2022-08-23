package Odevler.Gun38Odevler.soru1;

public class Duck implements ISailing,IFlying{



    @Override
    public String food() {
        return "ördek olarak ne bulursam onu yerim";
    }

    @Override
    public String flying() {
        return "ördek olarak yarım yamalak ucabiliyorum";
    }

    @Override
    public String sailing() {
        return "sudan cıkmam ordk";
    }
}
