package MySrc.Gun36.FınalMethod;

public class Tasit {
    private String model;

    public Tasit(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return " model="+model;
    }
}
