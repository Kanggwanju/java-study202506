package chap1_4;

//import chap1_4.cake.Apple;
//import chap1_4.cake.Banana;
//import chap1_4.cake.Grape;

import chap1_4.cake.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        chap1_4.juice.Apple juiceApple = new chap1_4.juice.Apple();
        chap1_4.cake.Apple cakeApple = new chap1_4.cake.Apple();

        Scanner sc = new Scanner(System.in);

        // 다른 패키지에서 다른 패키지의 클래스를 사용할 때는 import 문이 필수
        Banana banana = new Banana();
        Grape grape = new Grape();
    }
}
