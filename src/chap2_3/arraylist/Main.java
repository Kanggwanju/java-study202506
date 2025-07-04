package chap2_3.arraylist;

import chap1_8.poly.drive.Car;
import chap1_8.poly.drive.Mustang;
import chap1_8.poly.drive.Sonata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 문자열 전용 배열
        MyArrayList<String> foods = new MyArrayList<>();
        foods.push("볶음밥");
        foods.push("탕수육");
        foods.push("불고기");
        foods.push("고래밥");
        System.out.println(foods);
        // foods 배열에 데이터 몇개있어요??
        int size = foods.size();
        System.out.println("데이터 개수: " + size);

        // foods의 0번 인덱스에 접근하고 싶어요
        String firstFood = foods.get(0);
        System.out.println("firstFood = " + firstFood);
        
        // foods의 0번 인덱스를 삭제하고 싶어요
        String removedFood = foods.remove(0);
        System.out.println(foods);
        System.out.println("삭제된 데이터: " + removedFood);
        System.out.println("===================");

        // foods에 고래밥이 있나요
        boolean hasGorae = foods.contains("고래밥");
        System.out.println("고래밥이 있나요: " + hasGorae);
        System.out.println("===================");

        // foods에 불고기가 어디에 있나요
        int indexOfBul = foods.indexOf("불고기");
        System.out.println("불고기 위치: " + indexOfBul);
        System.out.println("===================");

        try {
            // 원하는 인덱스에 데이터 넣기
            foods.insert("깐풍기", 1);
            System.out.println("foods 리스트: " + foods);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        System.out.println("===================");

        // 리스트의 모든 요소 한번에 비우기
        foods.clear();
        System.out.println("foods 리스트: " + foods);
        System.out.println("===================");




        // 정수 전용 배열
        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.push(100);
        numbers.push(200);
        numbers.push(300);

        numbers.remove(0);
        System.out.println("삭제 후 배열: " + numbers);
        System.out.println("===================");
        int index2 = numbers.indexOf(200);
        System.out.println("index2 = " + index2);
        System.out.println("===================");
        numbers.clear();
        System.out.println("numbers 배열: " + numbers);

        System.out.println(numbers);

        // 자동차 전용 배열
        MyArrayList<Car> cars = new MyArrayList<>();

        cars.push(new Sonata());
        cars.push(new Mustang());


        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("농구");

        System.out.println(hobbies);
    }
}
