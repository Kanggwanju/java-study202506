package chap1_9.static_;

public class Calculator {

    String color;     // 계산기의 색상
    static double pi; // 원주율

    // 계산기의 색깔을 변경하는 메서드
    void customizeColor(String newColor) {
        this.color = newColor;
    }

    // 반지름을 알려주면 원의 넓이를 구해주는 메서드
    static double calcCircleArea(double r) {
        return pi * r * r;
    }
}
