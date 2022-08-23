package Gun29._02_Consructor;

public class soru1 {
    public static void main(String[] args) {

        // Book class yazınız.fields: name,publishYear,autor.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


        Book kitap1 = new Book("savas ve barıs", 1950, "dostoyevski");
        Book kitap2 = new Book("Saphiens", 2019);
        Book kitap3 = new Book("homo deus");

        Book.bilgileriyazdir(kitap1);
        Book.bilgileriyazdir(kitap2);
        Book.bilgileriyazdir(kitap3);

        System.out.println();

        System.out.println(kitap1);
        System.out.println(kitap2);
        System.out.println(kitap3);


    }
}

class Book {
    String name;
    int publishYear;
    String autor;

    public Book(String name, int publishYear, String autor) {
        this.name = name;
        this.publishYear = publishYear;
        this.autor = autor;
    }

    public Book(String name, int publishYear) {
        this(name);
        this.publishYear = publishYear;

    }

    public Book(String name) {
        this.name = name;

    }

    public static void bilgileriyazdir(Book kitap) {
        System.out.println("kitap adı= " + kitap.name + " yılı = " + kitap.publishYear + " yazarı = " + kitap.autor);
    }

    public String toString() {
        return "kitap ismi = " + name + " yılı = " + publishYear + " yazarı = " + autor;
    }
}
