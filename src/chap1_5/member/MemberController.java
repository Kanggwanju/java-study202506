package chap1_5.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    // 객체의 협력과 위임
    // 필드: 클래스의 속성 - 부품 속성
    MemberRepository mr; // 의존관계
    Scanner sc;

    MemberController() {
        mr = new MemberRepository();
        sc = new Scanner(System.in);
    }

    // 프로그램 초기 화면 출력
    void start() {
        System.out.printf("\n#####  회원 관리 시스템 (현재 회원 수: %d명)  #####\n", mr.size());
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");

        String menuNum = prompt(">> ");
    }

    /**
     * 사용자로부터 입력 메시지를 출력하며 데이터를 입력 받는 메서드입니다.
     *
     * @param message 입력을 요청하며 출력할 메시지
     * @return 사용자가 입력한 문자열
     */
    String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
