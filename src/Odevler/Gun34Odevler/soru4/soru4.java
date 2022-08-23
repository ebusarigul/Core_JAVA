package Odevler.Gun34Odevler.soru4;

public class soru4 {
    public static void main(String[] args) {
        //4-//Burada iki adet class vardır. Biri Main diğeri ise rentApartments
        //rentApartments'ın içinde;
        //Bu variable'ları private olarak oluşturun;
        //String name
        // int roomCount
        //boolean balconyOrNo
        //Bütün variable'lar için getter ve setter oluşturunuz.
        //4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
        //Bir method oluşturun;
        //Eğer room sayısı 0 ise,
        //rent(kira) 1400
        //Eğer oda sayısı 1 ise,
        //rent  1700
        //Eğer oda sayısı 2 ise,
        //rent 2200
        //Eğer oda sayısı 3 ise,
        //rent 2700
        //rent'i return'leyin.
        //Bir method oluşturun.
        //Eğer balconyOrNo  true ise,
        //rent'e 200 dollar ekleyin.
        //Main class'ın içinde;
        //**userName rent is amountOfRent**

        rentApartments lessee1 = new rentApartments("Ebubekir", 3, true);
        rentApartments.renthesapla(lessee1);
        rentApartments.balconyCheck(lessee1);

        System.out.println(lessee1);
        System.out.println();

        rentApartments lessee2 = new rentApartments();
        lessee2.setName("Havva");
        lessee2.setRoomCount(2);
        lessee2.setBalconyOrNo(false);

        rentApartments.renthesapla(lessee2);
        rentApartments.balconyCheck(lessee2);
        System.out.println(lessee2);


    }
}
