package MySrc.Gun40._02_;

public class Lahmacun implements IFood{

    void dough(){
        System.out.println("ince hamur");
    }
    void addMeat(){
        System.out.println("kıyma eklenildi");
    }
    void bake(){
        System.out.println("fırında 15 dakika pişirildi");
    }
    @Override
    public void taste() {
        System.out.println("agızda dagılan cıtır lahmacun");
    }

    @Override
    public double ucret() {
        return 20;
    }




}
