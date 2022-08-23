package MySrc.Gun33;

public enum Aylar {

    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Subat"),
    MART(3,31,"Mart"),
    NISAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,30,"Haziran"),
    ;

    final int ayNo;
    final int gunMiktar;
    final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "ayNo = " + ayNo + " gun Miktar = " + gunMiktar + " isim = "+isim;
    }
}


