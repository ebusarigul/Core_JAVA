package Odevler.Gun34Odevler.soru4;
public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    static int amountOfRent = 0;

    public rentApartments() {
    }

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomCount(int roomCount) {
        if (roomCount < 4) {
            this.roomCount = roomCount;
        }
    }
    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public static int renthesapla(rentApartments rentApartments) {
        if (rentApartments.roomCount == 0) {
            amountOfRent = 1400;
        } else if (rentApartments.roomCount == 1) {
            amountOfRent = 1700;
        } else if (rentApartments.roomCount == 2) {
            amountOfRent = 2200;
        } else if (rentApartments.roomCount == 3) {
            amountOfRent = 2700;
        }
        return amountOfRent;
    }
    public static int balconyCheck(rentApartments rentApartments) {
        if (rentApartments.balconyOrNo) {
            amountOfRent += 200;
        }
        return amountOfRent;
    }

    @Override
    public String toString() {
        return name + " rent is " + amountOfRent+" $";
    }
}
