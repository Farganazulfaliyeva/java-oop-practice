package vehicle;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        MyCar<Mercedes> myCar = new MyCar<>(mercedes);

        myCar.toString();
    }
}
