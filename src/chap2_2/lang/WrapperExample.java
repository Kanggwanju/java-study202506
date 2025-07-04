package chap2_2.lang;

public class WrapperExample {

    private int n;      // 0
    private Integer m;  // null

    public WrapperExample() {
        this.m = 0;
    }

    public static void main(String[] args) {

        // 자바는 객체지향 언어이다.
        // 자바는 기본 타입이 있다.
        // 기본 타입 -> 객체 : Wrapper
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character
        Integer x1 = new Integer(10);

        // boxing: 그냥 기본 타입처럼 써도 객체로 처리해주겠다.
        Integer x2 = 20;
        System.out.println(x1 + x2);

    }

    static void foo(Integer a) {

    }
}
