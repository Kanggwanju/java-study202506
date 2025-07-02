package chap1_9.static_.util;

import java.util.Scanner;

public class InputUtils {

    private static Scanner sc = new Scanner(System.in);

    // 입력을 받아서 메세지 출력과 함께 입력값을 리턴하는 메서드
    static public String prompt(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

}
