package MySrc.Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        String str = "Bugün";
        int a = 5;
        int b = 0;
        int c = 0;

        try {

            char ilkHarf = str.charAt(0);
            c = a / b;

        }
        catch (StringIndexOutOfBoundsException hata) {
            System.out.println("kelime bos oldugu için index alınamadı");
        }
        catch (ArithmeticException hata) {
            System.out.println("sayı sıfıra bölünemez");
        }
        catch (Exception hata) {
            System.out.println(hata.getMessage());
        }


    }
}
