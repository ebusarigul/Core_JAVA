package UdemyMyWorking._10_GenericsKavrami;

public class GenericDiziYazdir<GelenVeriTuru> {

    public void yazdir(GelenVeriTuru [] dizi){
        for (GelenVeriTuru g : dizi){
            System.out.println(g);
        }
    }
}
