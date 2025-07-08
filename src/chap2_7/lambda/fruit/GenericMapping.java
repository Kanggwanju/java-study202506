package chap2_7.lambda.fruit;

@FunctionalInterface
public interface GenericMapping<T, R> {

    R test(T t);
}
