package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {

        Car t1 = new Tesla();
        Car t2 = new Tesla();
        Car t3 = new Tesla();

        Car s1 = new Sonata();
        Car s2 = new Sonata();

        Car m1 = new Mustang();
        Car m2 = new Mustang();
        Car m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, m1, m2, m3};
        for (Car car : cars) {
            car.accelerate();
        }

        Object[] arr = {1, "dfss", false, new Sonata()};

        int a = 10;

        double[] dArr = {a};

    }
}
