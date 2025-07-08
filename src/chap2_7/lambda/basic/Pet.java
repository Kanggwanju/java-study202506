package chap2_7.lambda.basic;

// 함수형 인터페이스 - 람다를 사용할 수 있는지 체크
@FunctionalInterface
public interface Pet {

    // 이 인터페이스는 추상메서드가 딱 1개
    // 이 인터페이스는 람다를 사용할 수 있음.
    void eat();

    default void foo() {

    }

    static void foo1() {

    }
}
