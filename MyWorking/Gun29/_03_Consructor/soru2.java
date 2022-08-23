package Gun29._03_Consructor;

public class soru2 {
    public static void main(String[] args) {


        Bank bank1 = new Bank("Vakıf", 45, 1889);
        Bank bank2 = new Bank("Ziraat", 145);
        Bank bank3 = new Bank("Finansbank",421);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);


    }
}

class Bank {
    String name;
    int subeSayisi;
    int kurulusYili;


    public Bank(String name, int subeSayisi, int kurulusYili) {
        this.name = name;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;

    }

    public Bank(String name, int subeSayisi) {
        this.name = name;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "banka ismi = " + name + " subesayisi = " + subeSayisi + " kurulusyili = " + kurulusYili;
    }
}