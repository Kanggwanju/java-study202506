package chap2_7.lambda.fruit;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링하는 기능을 제공
public class FilterApple {

    /**
     * @solution - try 1 : 사과바구니에서 녹색 사과들만 필터링해주세요
     * 
     * @param basket - 여러가지 색상의 사과들이 모여 있는 바구니
     * @return - basket 안에서 녹색 사과들만 새롭게 담아서 리턴
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면 이 메서드만으로는 불가능
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 1. 녹색 사과들을 모아둘 리스트 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 사용해서 녹색 사과 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @solution - try 2 : 색상을 파라미터화하여 원하는 컬러의 사과를 필터링
     * @param basket - 여러가지 색상의 사과들이 모여 있는 바구니
     * @param color - 필터링을 원하는 사과의 색상
     * @return - basket 안에서 녹색 사과들만 새롭게 담아서 리턴
     * @problem - 만약 필터링 기준이 색상이 아니라 무게라면?
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        List<Apple> filteredBasket = new ArrayList<>();

        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try 3 : 기능(메서드)을 파라미터화 할 수는 없을까?
     *                     -> 안됨. 다만 객체안에 메서드를 바꿔서 사용하는 법
     *                          -> 오버라이딩
     *                              -> 동작(기능)을 추상화시켜 파라미터화 한다.
     * @problem - 필터링 대상이 사과가 아니면? 만약 학생이면?
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate predicate) {
        List<Apple> filteredBasket = new ArrayList<>();

        for (Apple apple : basket) {
            if (predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try 4 : 여러 객체들을 다양하게 필터링할 수 있도록 제네릭을 적용
     */
    public static <T> List<T> filter(List<T> list, GenericPredicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    public static <T> List<T> map(List<T> list, GenericMapping<T> mapping) {
        List<T> mappedList = new ArrayList<>();

        for (T t : list) {
            Object item = mapping.test(t);
            mappedList.add((T) item);
        }
        return mappedList;
    }
}
