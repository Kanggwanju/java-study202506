package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수1: ");
                String str1 = sc.nextLine(); // 정수를 문자열로 입력
                int n1 = Integer.parseInt(str1); // 문자열을 정수로 변환

                System.out.print("정수2: ");
                String str2 = sc.nextLine(); // 정수를 문자열로 입력
                int n2 = Integer.parseInt(str2); // 문자열을 정수로 변환

                String str = null;
                str.toUpperCase();

                System.out.println("n1 / n2 = " + (n1 / n2));
                break;
            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace(); // 예외처리 안했을 때 뜨던 빨간 메시지를 보여줌
                System.out.println("정수로만 입력하세요!");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (Exception e) {
                System.out.println("알 수 없는 에러 발생! 조치 후 점검하겠습니다.");
            }
        }



        System.out.println("프로그램 정상 종료!");
    }
}
