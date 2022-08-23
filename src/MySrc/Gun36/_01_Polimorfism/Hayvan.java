package MySrc.Gun36._01_Polimorfism;

public class Hayvan {

    private String name;

    public Hayvan(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ses(){
        System.out.println("ben bir hayvan nesnesiyim");
    }
}

class Kopek extends Hayvan{

    public Kopek(String name) {
        super(name);
    }

    public void kokladi(){
        System.out.println("kokladım");
    }

    @Override
    public void ses() {
        System.out.println("ben bir Kopek sınıfı nesnesiyim");;
    }
}

class Kedi extends Hayvan{

    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("ben bir kedi sınıfı nesnesiyim");
    }
}

