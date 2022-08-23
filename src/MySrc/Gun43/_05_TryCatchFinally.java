package MySrc.Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {


        long startTime=0;
        String str="";


        try{
            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki nokta");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki nokta");
        }
        catch (Exception hata){
            System.out.println("Catch blogu calıstı");
        }
        finally {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapılacaklar");
        }

        System.out.println("try-catch blogundan sonra çalısan kısım");




    }
}
