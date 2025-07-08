package chap2_7.lambda.fruit;

@FunctionalInterface
public interface GenericPredicate<T> {

    boolean test(T t);
}
