package chap2_7.lambda.fruit;

@FunctionalInterface
public interface GenericSome<T> {
    boolean test(T t);
}
