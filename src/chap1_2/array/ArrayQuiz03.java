package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {

    public static void main(String[] args) {

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(members));
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;


        while (members.length != 0) {
            System.out.println("삭제할 이름을 입력하세요.");
            System.out.print(">> ");
            String target = scanner.nextLine();

            for (int i = 0; i < members.length; i++) {
                if (members[i].equals(target)) {
                    for (int j = i; j < members.length - 1; j++) {
                        members[j] = members[j + 1];
                    }
                    
                    String[] temp = new String[members.length - 1];
                    for (int k = 0; k < temp.length; k++) {
                        temp[k] = members[k];
                    }

                    members = temp;
                    
                    System.out.println("- 삭제 후 배열: " + Arrays.toString(members));
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.println(target + "은(는) 없는 이름입니다.");
            }

            flag = false;
        }

    }
}
