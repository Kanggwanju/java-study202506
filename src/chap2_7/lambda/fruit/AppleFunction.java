package chap2_7.lambda.fruit;

@FunctionalInterface
public interface AppleFunction<Y> {

    // 사과를 주면 사과에서 Y를 추출해서 주세요
    Y apply(Apple apple);
}
