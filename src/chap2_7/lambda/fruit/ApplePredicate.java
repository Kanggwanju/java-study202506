package chap2_7.lambda.fruit;

public interface ApplePredicate {

    /**
     * 주어진 사과가 조건에 부합하는지 판단합니다.
     *
     * @param apple 조건을 검사할 대상 사과 객체
     * @return 사과가 조건에 부합하면 true, 그렇지 않으면 false
     */
    boolean test(Apple apple);
}
