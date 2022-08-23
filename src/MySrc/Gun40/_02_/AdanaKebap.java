package MySrc.Gun40._02_;

public class AdanaKebap implements IFood{

    void marinade(){
        System.out.println("marine edildi");
    }
    void grill(){
        System.out.println("ızgarada 15 dakika odun kömüründe pişirildi");
    }

    @Override
    public void taste() {
        System.out.println("acılı bir tat");
    }

    @Override
    public double ucret() {
        return 45;
    }

}
