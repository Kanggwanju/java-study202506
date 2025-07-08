package chap2_7.lambda.fruit;

@FunctionalInterface
public interface GenericEvery<T> {
    boolean test(T t);
}
