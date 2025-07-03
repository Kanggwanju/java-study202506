package chap1_9.singleton;

public class Singleton {

    int a;

    // 싱글턴 패턴: 객체 생성은 오직 하나만 생성되어야 한다.
    // 1. 아예 외부에서 객체를 못만들게 함.
    private Singleton() {}

    // 2. 스스로 딱 하나의 객체를 생성함.
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    // 3. 외부에 공개할 메서드를 만들고 그 메서드에 단 하나의 객체를 리턴시킴
    // 객체 생성 없이 외부에서 호출하기 위해서 static을 붙인다.
    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
            "a=" + a +
            '}';
    }
}
