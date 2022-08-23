package Gun27._02_ornek;

public class Rectangle {

    int width;
    int length;

    public int cevre(int width,int length){

        int cevre=2*(length+width);
        System.out.println("cevre = " + cevre);
        return cevre;
    }

    public int alan(int width,int length){
        int alan=length*width;
        System.out.println("alan = " + alan);
        return alan;
    }

}
