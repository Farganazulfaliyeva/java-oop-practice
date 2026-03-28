package vehicle;

public class MyCar <A>{
    private A name;

    public MyCar(A name) {
        this.name = name;
    }

    public A getName() {
        return name;
    }
    public void setName(A name) {
        this.name = name;
    }
}
