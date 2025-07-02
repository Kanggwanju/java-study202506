package chap1_8.poly.drive;

public class CarShop {

    // 돈을 주면 자동차를 출고해주는 기능
    public Car exportCar(int money) {
        if (money == 6000) {
            // 테슬라 출고
            return new Tesla();
        } else if (money == 5000) {
            // 머스탱 출고
            return new Mustang();
        } else if (money == 3000) {
            // 소나타 출고
            return new Sonata();
        } else {
            // 출고 안 함
            return null;
        }
    }
}
