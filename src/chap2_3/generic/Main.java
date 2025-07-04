package chap2_3.generic;

public class Main {

    public static void main(String[] args) {

        // ====== 제네릭을 사용하지 않았을 때 ====== //

        // 사과 바구니 생성
        AppleBasket appleBasket = new AppleBasket();
        appleBasket.setApple(new Apple(10));


        Apple apple = appleBasket.getApple();
        System.out.println("apple = " + apple);

        // 바나나 전용 바구니 생성
        BananaBasket bananaBasket = new BananaBasket();
        bananaBasket.setBanana(new Banana(14));
        Banana banana = bananaBasket.getBanana();
        System.out.println("banana = " + banana);

        // ====== 제네릭을 사용했을 때 ====== //
        // 일단 범용적인 바스켓을 만들고, 만들고 난 다음에 뭘 담을지 후에 결정

        // 사과바구니를 만들거야
        // new Basket<Apple>은 Apple 생략 가능
        Basket<Apple> basketA = new Basket<>();
        basketA.setFruit(new Apple(11));
        Apple app = basketA.getFruit();

        // 바나나 바구니를 만들거야
        Basket<Banana> basketB = new Basket<>();
        basketB.setFruit(new Banana(25));
        Banana ban = basketB.getFruit();

        Basket<Peach> basketC = new Basket<>();
        basketC.setFruit(new Peach(10));

//        Basket<Water> basketD = new Basket<>();
    }
}
