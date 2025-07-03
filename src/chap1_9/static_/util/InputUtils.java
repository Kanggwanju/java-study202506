package chap1_9.static_.util;

import java.util.Scanner;

public class InputUtils {

    private static Scanner sc = new Scanner(System.in);

    // 입력을 받아서 메세지출력과 함께 입력값을 리턴하는 메서드
    public static String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
    // 입력한 문자열 정수를 정수로 안전하게 변환하는 메서드
    public static int promptNumber(String message) {
        while (true) {
            try {
                System.out.print(message);
                String str = sc.nextLine();
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("정수형 숫자만 입력해주세요!");
            }
        }

    }
}
