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

        System.out.println("================");

        // 무게가 홀수인 사과만 필터링
        List<Apple> oddWeightApples = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() % 2 == 1;
            }
        });
        System.out.println("oddWeightApples = " + oddWeightApples);

        System.out.println("================");

        // 색상이 빨강 또는 초록 사과만 필터링
        List<Apple> redOrGreenApples = filterApples(appleBasket,
            apple -> apple.getColor() == RED || apple.getColor() == GREEN);
        System.out.println("redOrGreenApples = " + redOrGreenApples);

        System.out.println("================");

        // 무게가 100이상이면서 빨강사과만 필터링
        List<Apple> weightGoe100AndRedApples = filterApples(appleBasket,
            apple -> apple.getWeight() >= 100 && apple.getColor() == RED);
        System.out.println("weightGoe100AndRedApples = " + weightGoe100AndRedApples);

        System.out.println("================");

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        // 짝수만 필터링
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Apple> yellowAppleList
               = filter(appleBasket, a -> a.getColor() == YELLOW);
        System.out.println("yellowAppleList = " + yellowAppleList);

        List<String> filteredFoods = filter(
            List.of("짜장면", "김", "탕수육"),
            str -> str.length() == 3
        );

        System.out.println("filteredFoods = " + filteredFoods);

        System.out.println("================");

        List<Apple> mappedColors = map(appleBasket, apple -> apple.getColor());
        System.out.println("mappedColors = " + mappedColors);

        System.out.println("================");

        List<Apple> mappedWeights = map(appleBasket, apple -> apple.getWeight());
        System.out.println("mappedWeights = " + mappedWeights);

    }
}
