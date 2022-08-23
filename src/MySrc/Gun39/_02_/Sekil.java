package MySrc.Gun39._02_;

public abstract class Sekil {

    private String name;

    public abstract double alan();
    public abstract double cevre();

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void ciz(){
        System.out.println(this.name+" çiziliyor");
    }

    @Override
    public String toString() {
        return  "isim="+name+"\n"+
                "alan= "+Math.round(alan())+"\n" +
                "cevre= "+Math.round(cevre());
    }

}
