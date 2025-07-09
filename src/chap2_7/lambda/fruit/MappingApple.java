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
    public static List<Color> mappingApplesByColor(List<Apple>appleBasket) {
        List<Color> colorList = new ArrayList<>();

        for (Apple apple : appleBasket) {
            Color color = apple.getColor();
            colorList.add(color);
        }
        return colorList;

    }
}
