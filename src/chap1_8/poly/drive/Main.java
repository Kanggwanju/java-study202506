package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();

        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, m1, m2, m3};
        for (Car car : cars) {
            car.accelerate();
        }

        Object[] arr = {1, "dfss", false, new Sonata()};

        int a = 10;

        double[] dArr = {a};

        System.out.println("====================");

        Driver heartping = new Driver("하츄핑");

        heartping.drive(m1);

        System.out.println("====================");

        CarShop carShop = new CarShop();

        Car car1 = carShop.exportCar(6000);
        System.out.println("car1 = " + car1);
        if (car1 != null)car1.accelerate();

        System.out.println("================");

        // Sonata인 것을 안다면 미리 Sonata로 다운캐스팅 실행
        Sonata car2 = (Sonata) carShop.exportCar(3000);
        car2.accelerate();
        car2.joinHyundaiMembership();

        // Car 타입이 아니여도 자동으로 cars 배열에 바뀌어서 들어감
        cars[0] = car2;
    }
}
