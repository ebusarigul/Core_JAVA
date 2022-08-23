package MySrc.Gun40._01_;

public class Main {
    public static void main(String[] args) {


        Kedi kedi=new Kedi("Tekir",false,"01.01.2016");
        System.out.println(kedi);

        System.out.println();

        Kartal kartal=new Kartal("Beşiktaş",true,"24.10.1903");
        System.out.println("kartal.yiyecegi() = " + kartal.yiyecegi());
        System.out.println("kartal.gunlukUykusuresi() = " + kartal.gunlukUykusuresi());
        System.out.println("kartal.sesi() = " + kartal.sesi());
        System.out.println(kartal);




    }
}
