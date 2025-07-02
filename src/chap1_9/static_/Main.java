package chap1_9.static_;

import static chap1_9.static_.util.InputUtils.prompt;

public class Main {

    public static void main(String[] args) {

        // static이 붙어져 있어서 객체를 생성하지 않아도 접근할 수 있다.
        Count.m1();
        Count.x = 100;

        // 원주율 : 샤프계산기의 원주율, 삼성계산기의 원주율
        System.out.println(Math.PI);

        Count c1 = new Count();
        c1.m2();

//        c1.x++;
        Count.x++;
        c1.y++;

        Count c2 = new Count();
        c2.m2();

//        c2.x++;
        Count.x++;
        c2.y++;

        c2.y = 100;
        c2.x = 999;


        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);
        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);


        System.out.println("=================");

        double result = Calculator.calcCircleArea(5);

        Calculator sharpCalc = new Calculator();
        sharpCalc.customizeColor("노랑색");

        Math.random();

        String age = prompt("너 나이 써봐!");



    }
}
