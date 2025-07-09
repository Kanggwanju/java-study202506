package chap2_7.lambda.fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

        List<Color> mappedColors = map(appleBasket, apple -> apple.getColor());
        System.out.println("mappedColors = " + mappedColors);

        System.out.println("================");

        List<Integer> mappedWeights = map(appleBasket, apple -> apple.getWeight());
        System.out.println("mappedWeights = " + mappedWeights);

        System.out.println("================");

        boolean flag1 = every(appleBasket, apple -> apple.getWeight() > 100);
        boolean flag2 = every(appleBasket, apple -> apple.getWeight() < 300);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);

        boolean flag3 = some(appleBasket, apple -> apple.getColor() == RED);
        boolean flag4 = some(appleBasket, apple -> apple.getWeight() >= 200);
        boolean flag5 = some(appleBasket, apple -> apple.getWeight() < 50);
        System.out.println("flag3 = " + flag3);
        System.out.println("flag4 = " + flag4);
        System.out.println("flag5 = " + flag5);

        boolean flag6 = none(appleBasket, apple -> apple.getWeight() > 200);
        boolean flag7 = none(appleBasket, apple -> apple.getWeight() < 50);
        System.out.println("flag6 = " + flag6);
        System.out.println("flag7 = " + flag7);

        boolean flag8 = every(mappedWeights, weight -> weight >= 50);
        boolean flag9 = every(mappedWeights, weight -> weight > 50);
        System.out.println("flag8 = " + flag8);
        System.out.println("flag9 = " + flag9);

        System.out.println("=================");

        List<Color> colorList = MappingApple.mappingApplesByColor(appleBasket);
        System.out.println(colorList);

        System.out.println("=================");

        List<Integer> weightList = MappingApple.mappingApples(appleBasket, new AppleFunction<Integer>() {
            @Override
            public Integer apply(Apple apple) {
                return apple.getWeight();
            }
        });

        System.out.println("weightList = " + weightList);

        // 색상 문자열의 첫글자만 모아서 리턴
        List<Character> characterList = MappingApple.mappingApples(appleBasket, new AppleFunction<Character>() {
            @Override
            public Character apply(Apple apple) {
                return apple.getColor().toString().charAt(0);
            }
        });
        System.out.println("characterList = " + characterList);

        System.out.println("=================");
        
        // 각 사과별로 "xx색 사과는 xxg입니다." 라는 문자열 목록을 리턴
        List<String> stringList = MappingApple.mappingApples(appleBasket, new AppleFunction<String>() {
            @Override
            public String apply(Apple apple) {
                return String.format("%s색 사과는 %dg입니다.", apple.getColor(), apple.getWeight());
            }
        });
        System.out.println("stringList = " + stringList);

        System.out.println("===================");

        /*
            사과목록에서 아래와 같은 데이터 형식의 목록을 리턴
            [
                {
                    first: 'G',
                    weight: 0.08
                },
                {
                    first: 'G',
                    weight: 0.15
                }
            ]
         */
        List<Map<String, Object>> mapList = MappingApple.mappingApples(appleBasket, new AppleFunction<Map<String, Object>>() {
            @Override
            public Map<String, Object> apply(Apple apple) {
                Map<String, Object> map = new HashMap<>();
                map.put("first", apple.getColor().toString().charAt(0));
                map.put("weight", (double)apple.getWeight() / 1000);

                return map;
            }
        });
        System.out.println("mapList = " + mapList);

        List<Map<String, Object>> mapList2 = MappingApple.mappingApples(appleBasket, new AppleFunction<Map<String, Object>>() {
            @Override
            public Map<String, Object> apply(Apple apple) {
                return Map.of(
                    "first", apple.getColor().toString().charAt(0),
                    "weight", apple.getWeight() / 1000.0
                );
            }
        });
        System.out.println("mapList2 = " + mapList2);

        System.out.println("======================");

        List<FormatApple> formatApples = MappingApple.mappingApples(appleBasket, new AppleFunction<FormatApple>() {
            @Override
            public FormatApple apply(Apple apple) {
                return new FormatApple(apple);
            }
        });
        System.out.println("formatApples = " + formatApples);
    }// end main

    private static class FormatApple {
        private char first;
        private double weight;

        public FormatApple(Apple apple) {
            this.first = apple.getColor().toString().charAt(0);
            this.weight = apple.getWeight() / 1000.0;
        }

        public char getFirst() {
            return first;
        }

        public void setFirst(char first) {
            this.first = first;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return '{' + "first: " + first +
                ", weight: " + weight +
                '}';
        }

        @Override
        public boolean equals(Object object) {
            if (!(object instanceof FormatApple that)) return false;
            return first == that.first && Double.compare(weight, that.weight) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, weight);
        }
    }
}
