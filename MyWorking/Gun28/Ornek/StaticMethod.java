package Gun28.Ornek;

public class StaticMethod {
    public static void main(String[] args) {

        int sayi = 345;

        //1.yontem
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        //2.yontem

        Utility util = new Utility();
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);


        Utility.getInt(strRakam);
        Utility.getString(intRakam);


    }
}
