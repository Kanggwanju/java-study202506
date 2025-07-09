package chap2_7.lambda.fruit;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    /*
        origin: [ {}, {}, {}, {} ]
        filter: [ {}, {}, {} ]
        map :   [ '', '', '' ]
     */

    // 사과목록에서 사과의 색상들만 추출
    public static List<Color> mappingApplesByColor(List<Apple> appleBasket) {
        List<Color> colorList = new ArrayList<>();

        for (Apple apple : appleBasket) {
            Color color = apple.getColor();
            colorList.add(color);
        }
        return colorList;
    }

    // 사과목록에서 사과의 특정 데이터만 추출
    public static <Y> List<Y> mappingApples(List<Apple> appleBasket, AppleFunction<Y> func) {
        List<Y> mappedList = new ArrayList<>();

        for (Apple apple : appleBasket) {
            Y mappedData = func.apply(apple);
            mappedList.add(mappedData);
        }
        return mappedList;
    }

    // 특정객체의 목록에서 특정 객체의 특정 데이터만 추출
    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X, Y> func) {
        List<Y> mappedList = new ArrayList<>();

        for (X x : list) {
            Y mappedData = func.apply(x);
            mappedList.add(mappedData);
        }
        return mappedList;
    }
}
