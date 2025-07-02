package chap1_8.practice;

public class Main {
    public static void main(String[] args) {
        // 1. 필요한 객체들을 생성합니다.
        MessageRelay messageRelay = new MessageRelay();
        User user = new User("하치와레");
        Admin admin = new Admin("가나디");

        // 2. MessageRelay를 통해 유저의 메시지를 전달합니다.
        // messageRelay는 user 객체가 User 타입인지 전혀 모르고,
        // 오직 Messenger 타입이라는 것만 압니다.
        messageRelay.relay(user, "호치하치");

        // 3. MessageRelay를 통해 관리자의 메시지를 전달합니다.
        // 똑같은 relay 메서드지만, 이번엔 Admin 객체가 가진 sendMessage가 호출됩니다.
        messageRelay.relay(admin, "긴급 서버 점검이듀..");

    }
}
