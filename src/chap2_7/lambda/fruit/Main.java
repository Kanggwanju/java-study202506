package chap2_7.lambda.fruit;

import java.util.List;

import static chap2_7.lambda.fruit.Color.*;
import static chap2_7.lambda.fruit.FilterApple.*;

public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
            new Apple(80, GREEN)
            , new Apple(155, GREEN)
            , new Apple(120, RED)
            , new Apple(97, RED)
            , new Apple(200, GREEN)
            , new Apple(50, RED)
            , new Apple(85, YELLOW)
            , new Apple(75, YELLOW)
        );

        List<Apple> greenApples = filterGreenApples(appleBasket);

        System.out.println(greenApples);

        System.out.println("================");

        List<Apple> redApples
            = filterApplesByColor(appleBasket, RED);
        System.out.println(redApples);

        System.out.println("================");

        List<Apple> yellowApples = filterApplesByColor(appleBasket, YELLOW);
        System.out.println(yellowApples);

        System.out.println("================");

        // 무게가 100이상인 사과만 필터링
        List<Apple> weightGoe100 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("weightGoe100 = " + weightGoe100);

    }
}
