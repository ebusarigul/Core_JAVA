package MySrc.Gun43;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program çalıştı");
        String kelime = "";
        kelime.charAt(3);
        System.out.println("program bitti");


    }
}

//daha çalışmadan önce olusmus eksikliklerden kaynaklı hatalara derleme zamanı yani COMPİLE ERROR excaption denir
//program  çalıştıktan sonra çalışma zamanı içindeki hatalara çalısan zamanı yani RUNTİME ERROR, exception denir.