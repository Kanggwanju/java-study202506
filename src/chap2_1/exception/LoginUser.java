package chap2_1.exception;

public class LoginUser {
    private String account;
    private String password;

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 로그인 검증 기능
    public String authenticate(String inputAccount, String inputPassword)
            throws LoginInvalidException { // 이 메서드는 에러 가능성이 있는 위험한 메서드다.
                               // 따라서 사용자는 직접 예외처리를 할 것!

        /*
            예외를 던지다 : 예외가 발생하면 코드의 흐름이 끊김.
            마치 리턴문 탈출처럼 에러를 활용할 수 있다.
            다만 에러가 발생하면 프로그램이 튕기기 때문에 그에 따른
            예외처리는 호출하는 쪽에게 떠넘긴다.
         */
         


        // 계정 검증
        if (!this.account.equals(inputAccount)) {
            // 사용자에게 등록되지 않음 계정임을 알림
            // throw(raise): 유발시키다.
            throw new LoginInvalidException("회원가입되지 않은 계정입니다.");
        }

        // 패스워드 검증
        if (!this.password.equals(inputPassword)) {
            // 사용자에게 틀린 비밀번호임을 알림
            throw new LoginInvalidException("비밀번호가 틀렸습니다.");
        }
        
        /*
            실제로 인증 로직에서 로그인에 성공하면
            브라우저나 클라이언트에게 인증 토큰을 포함한 인증정보를 보냄
         */
        
        System.out.println("로그인에 성공했습니다.");
        return "로그인 성공";
    }
}
