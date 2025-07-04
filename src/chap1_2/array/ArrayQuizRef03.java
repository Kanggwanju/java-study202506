package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuizRef03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 삭제할 멤버의 이름을 입력하세요.");
            String targetName = sc.nextLine();

            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (tvxq[i].equals(targetName)) {
                    index = i;
                    break;
                }
            } // end for

            if (index != -1) {

                // 삭제 여부 질문
                System.out.printf("진짜로 %s님을 삭제할까요? [y/n]\n", targetName);
                System.out.print(">> ");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    for (int i = index; i < tvxq.length - 1; i++) {
                        tvxq[i] = tvxq[i + 1];
                    }

                    String[] temp = new String[tvxq.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = tvxq[i];
                    }
                    tvxq = temp;
                    temp = null;

                    System.out.println("- 삭제 완료!");
                    System.out.println("# 삭제 후 정보: " + Arrays.toString(tvxq));
                    break;
                }
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        } // end while
    }
}
