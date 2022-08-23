package MySrc.Gun39._03_;

public abstract class Food {

    private String name;
    abstract void madeIn();
    abstract void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Yiyecek İsmi="+name;
    }
}
