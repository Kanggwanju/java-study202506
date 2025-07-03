package chap2_1.exception;

public class Main {

    public static void main(String[] args) {

        // 회원 생성
        LoginUser user = new LoginUser("abc123", "1234");

        // 로그인 검증
        try {
            user.authenticate("abc1234", "1234");
        } catch (LoginInvalidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
